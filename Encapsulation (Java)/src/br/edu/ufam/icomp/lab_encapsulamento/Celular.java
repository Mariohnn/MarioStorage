package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular extends Posicao implements Localizavel{
    private int codPais;
    private int codArea;
    private int numero;
    
    public Celular() {
        this(0, 0, 0);
    }
    
    public Celular(int codPais, int codArea, int numero) {
        if(codPais >= 1 && codPais <= 1999) {
            this.codPais = codPais;
        }
        else {
            this.codPais = -1;
        }
        if(codArea >= 10 && codArea <= 99){
            this.codArea = codArea;
        }
        else {
            this.codArea = -1;
        }
        if(numero >= 10000000 && numero <= 999999999) {
            this.numero = numero;
        }
        else {
            this.numero = -1;
        }
    }
    
    public final void setCodPais(int codPais){
        this.codPais = codPais;
    }
    
    public int getCodPais() {
        return codPais;
    }
    
    public final void setCodArea(int codArea) {
        this.codArea = codArea;
    }
    
    public int getCodArea() {
        return codArea;
    }
    
    public final void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
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
        return 50.0;
    }
}