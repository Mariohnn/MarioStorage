DB_HOST = "localhost"
DB_NAME = "Amazon-metadata"
DB_USER = "admin"
DB_PASS = "icomp123"
     
import psycopg2
import pandas as pd

conn = psycopg2.connect(database=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST)

cursor = conn.cursor()  

#Todas as consultas requeridas estão listadas a baixo

# #a)
# cursor.execute("""
# (SELECT * 
# FROM Review
# WHERE asin = 'X.asin'
# ORDER BY nohelpful DESC, rating DESC
# LIMIT 5) UNION ALL (SELECT * 
#                     FROM Review 
#                     WHERE asin = 'X.asin'
#                     ORDER BY nohelpful DESC, rating ASC
#                     LIMIT 5)
# ;""")
# X é o produto dado
# X.asin é o asin do produto

# #b)
# cursor.execute("""
# SELECT  *
# FROM Produtos
# WHERE salesrank<'X.salesrank' AND asin IN (SELECT similarasin
#                                           FROM SimilarP
#                                           WHERE asin = 'X.sain');""")
# ## X é a row do produto dado
# ## X.salesrank é o rank de vendas do produto dado.
# ## X.asin é o asin do produto dado.

# #c)
# cursor.execute("""
# SELECT date, avg(rating)
# FROM Review
# WHERE asin = 'X.asin'
# GROUP BY date
# ORDER BY date ASC;""")
# 
# X.asin é o asin do produto dado


# #d)
# cursor.execute("""
# (SELECT *
# FROM Produtos
# WHERE grupo = 'Book'
# ORDER BY salesrank ASC
# LIMIT 10) UNION (SELECT *
#                 FROM Produtos
#                 WHERE grupo = 'DVD'
#                 ORDER BY salesrank ASC
#                 LIMIT 10) UNION (SELECT *
#                                 FROM Produtos
#                                 WHERE grupo = 'Music'
#                                 ORDER BY salesrank ASC
#                                 LIMIT 10) UNION (SELECT *
#                                                 FROM Produtos
#                                                 WHERE grupo = 'Video'
#                                                 ORDER BY salesrank ASC
#                                                 LIMIT 10)
# ;""")

# #e)
# cursor.execute("""
# SELECT *
# FROM Produtos JOIN (SELECT asin, avg(rating), avg(nohelpful)
#                     FROM Review
#                     GROUP BY asin
#                     ORDER BY avg(rating) DESC, avg(nohelpful) DESC
#                     LIMIT 10)""")

# #f)
# cursor.execute("""
# SELECT categoria, avg(rating), avg(nohelpful)
# FROM Categorias JOIN Review
# GROUP BY categoria
# ORDER BY avg(rating) DESC, avg(nohelpful) DESC
# LIMIT 5;""")

# #g)
# cursor.execute("""
# (SELECT grupo, customer, sum(asin)
# FROM Review JOIN Produtos
# WHERE grupo = 'Book'
# GROUP BY grupo
# ORDER BY count(asin) DESC
# LIMIT 10) UNION ((SELECT grupo, customer, sum(asin)
#                 FROM Review JOIN Produtos
#                 WHERE grupo = 'Video'
#                 GROUP BY grupo
#                 ORDER BY count(asin) DESC
#                 LIMIT 10) UNION (SELECT grupo, customer, sum(asin)
#                                 FROM Review JOIN Produtos
#                                 WHERE grupo = 'Music'
#                                 GROUP BY grupo
#                                 ORDER BY count(asin) DESC
#                                 LIMIT 10) ) UNION (SELECT grupo, customer, sum(asin)
#                                                     FROM Review JOIN Produtos
#                                                     WHERE grupo = 'Video'
#                                                     GROUP BY grupo
#                                                     ORDER BY count(asin) DESC
#                                                     LIMIT 10) )
# ;""")


cursor.close()

conn.close()
