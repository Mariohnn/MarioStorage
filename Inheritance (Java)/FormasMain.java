package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {        
        public static void main(String[] args) {
            Circulo circulo = new Circulo(10, 20, 48);
            System.out.println(circulo.toString());
            Retangulo retangulo = new Retangulo(10, 20, 48, 84);
            System.out.println(retangulo.toString());
            Quadrado quadrado = new Quadrado(10, 20, 48);
            System.out.println(quadrado.toString());
        }
}