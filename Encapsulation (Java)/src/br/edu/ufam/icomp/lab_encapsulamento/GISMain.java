package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        Local[] vetor = new Local[100];
        int i = 0;
        vetor[i] = new Celular();
        vetor[i] = new CarroLuxuoso();
        for(i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].getPosicao());
        }
    }
}