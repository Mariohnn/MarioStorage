package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
	public double raio;
	double pi = Math.PI;
	
	public Circulo(int posX, int posY, double raio){
		this.posX = posX;
		this.posY =  posY;
		this.raio = raio;
	}
	
	public double getArea() {
		double a = pi*(raio)*(raio);
		return a;
	}
	
	public double getPerimetro() {
		double c = 2*pi*raio;
		return c;
	}
	public String toString() {
		String descricao = "C�rculo na posi��o ("+ this.posX +", "+ this.posY +") com raio de "+ raio +"cm (�rea="+ getArea() +"cm2, per�metro="+ getPerimetro() +"cm)";
		return descricao;
	}
}
