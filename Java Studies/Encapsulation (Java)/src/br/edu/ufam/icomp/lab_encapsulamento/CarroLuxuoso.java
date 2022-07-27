package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel {
    public CarroLuxuoso() {
        this("");
    }
    public CarroLuxuoso(String placa) {
        this.placa = placa;
    }
    public Posicao getPosicao() {
        Random ra = new Random();
        Random rb = new Random();
        Random rc = new Random();
        double latitude = -3.160000 + (-2.960000 + 3.160000) * ra.nextDouble();
        double longitude = -60.120000 + (-59.820000 + 60.120000) * rb.nextDouble();
        double altitude = 15.00000 + (100.00000 - 15.00000) * rc.nextDouble();
        Posicao posicao = new Posicao(latitude, longitude, altitude);
        return posicao;
    }
    public double getErroLocalizacao() {
        return 15.0;
    }
}