DB_HOST = "localhost"
DB_NAME = "Amazon-metadata"
DB_USER = "admin"
DB_PASS = "icomp123"

import psycopg2
import pandas as pd

with open ("amazon-meta.txt", "r", encoding="utf-8") as arquivo:
    texto = arquivo.readlines()

#funções

def prepara_categoria(categoria):
    characters = "|[1234567890"
    for x in range(len(characters)):
        categoria = categoria.replace(characters[x],"")
    categoria = categoria.replace("]",",")
    categoria = categoria.split(",")
    categoria = categoria[:-1]
    return categoria

def prepara_catid(categoria):
    characters = "|[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSüäöçTUVWXáóYёZé&ёí-/}{:ñ@ẽ#!?$%^*)+(.' "
    for x in range(len(characters)):
        categoria = categoria.replace(characters[x],"")
    categoria = categoria.replace("]",",")
    categoria = categoria.split(",")
    categoria = categoria[:-1]
    return categoria

def prepara_total_reviews(review):
    review = review.split()
    return review[2]

def prepara_data(frase):
    frase = frase.split()
    return frase[0]

def prepara_customer(frase):
    frase = frase.split()
    return frase[2]

def prepara_rating(frase):
    frase = frase.split()
    return frase[4]

def prepara_novotes(frase):
    frase = frase.split()
    return frase[6]

def prepara_nohelpful(frase):
    frase = frase.split()
    return frase[8]

def prepara_qntd_similar(frase):
    frase = frase.split()
    return frase[1]

def prepara_similares(frase):
    frase = frase.split()
    return frase[2:]


conn = psycopg2.connect(database=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST)

cursor = conn.cursor()  



#Criação das tabelas
cursor.execute("""CREATE TABLE Produtos(
    id  INT,
    grupo   VARCHAR(30),
    titulo  VARCHAR(1000),
    salesrank   BIGINT,
    asin    VARCHAR(10)     NOT NULL,
    PRIMARY KEY(asin);
)""")
cursor.execute("""CREATE TABLE Review(
    asin    VARCHAR(10)     NOT NULL,
    data    DATE,
    customer  VARCHAR(20),
    rating      INT,
    novotes     INT,
    nohelpful   INT,
    FOREIGN KEY(asin) REFERENCES Produtos.asin;
)""")
cursor.execute("""CREATE TABLE Categorias(
    catid   VARCHAR(20),
    categoria   VARCHAR(100);
)""")
cursor.execute("""CREATE TABLE Prodcat(
    asin   VARCHAR(10),
    catid  VARCHAR(20),
    FOREIGN KEY(asin) REFERENCES Produtos.asin;
)""")
cursor.execute("""CREATE TABLE SimilarP(
    asin    VARCHAR(10),
    similarasin   VARCHAR(10),
    FOREIGN KEY(asin) REFERENCES Produtos.asin;
)""")

#Extração

for frase in texto:
    if "Id:   " in frase:
        frase = frase.replace("Id: ", "")
        frase = frase.replace("\n","")
        noid = frase
    if "ASIN: " in frase:
        frase = frase.replace("ASIN: ", "")
        frase = frase.replace("\n","")
        asin = frase
    if "title: " in frase:
        frase = frase.replace("title: ", "")
        frase = frase.replace("\n","")
        title = frase
    if "  group: " in frase:
        frase = frase.replace("  group: ", "")
        frase = frase.replace("\n","")
        group = frase
    if "salesrank: " in frase:
        frase = frase.replace("salesrank: ", "")
        frase = frase.replace("\n","")
        salesrank = frase
        cursor.execute("""INSERT INTO Produtos(id, grupo, titulo, salesrank, asin) VALUES (%s, %s, %s, %s, %s)""",(noid, group, title, salesrank, asin))  #monta a tabela Produtos
    if " similar: " in frase:
        #nosimilar = prepara_qntd_similar(frase)
        list_similares = prepara_similares(frase)
        for i in range(0,len(list_similares)):
            cursor.execute("""INSERT INTO SimilarP(asin, similarasin) VALUES (%s, %s)""",(asin, list_similares[i]))    #monta a tabela SimilarP
    if "|" in frase:
        categoria = prepara_categoria(frase)
        catid = prepara_catid(frase)
        for i in range(0, len(categoria)):
            if catid[i] == '' or catid[i] == 'ё':
                catid[i] = 0
            cursor.execute("""INSERT INTO Categorias(catid, categoria) VALUES (%s, %s)""",(catid[i], categoria[i]))    #monta a tabela Categorias
            cursor.execute("""INSERT INTO Prodcat(asin, catid) VALUES (%s, %s)""",(asin, catid[i]))    #monta a tabela Prodcat
    if "  reviews: total: " in frase:
        total_reviews = prepara_total_reviews(frase)
        if total_reviews == 0 : 
            cursor.execute("""INSERT INTO Review(asin, data, customer, rating, novotes, nohelpful) VALUES (%s, NULL, NULL, NULL, NULL, NULL)""",(asin))
    if " cutomer: " in frase:
        data = prepara_data(frase)
        customer = prepara_customer(frase)
        rating = prepara_rating(frase)
        novotes = prepara_novotes(frase)
        nohelpful = prepara_nohelpful(frase)
        cursor.execute("""INSERT INTO Review(asin, data, customer, rating, novotes, nohelpful) VALUES (%s, %s, %s, %s, %s, %s)""",(asin, data, customer, rating, novotes, nohelpful))  #monta a tabela Review
    if "discontinued product" in frase:
        title = "unknown"
        # group = NULL
        # salesrank = NULL
        cursor.execute("""INSERT INTO Produtos(id, grupo, titulo, salesrank, asin) VALUES (%s, NULL, %s, NULL, %s)""",(noid, title, asin))    #monta a tabela Produtos






conn.commit()

cursor.close()

conn.close()