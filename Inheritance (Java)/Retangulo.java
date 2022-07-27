package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura;
	public double altura;
	
	Retangulo(){
		this(0,0,0.0,0.0);
	}
	
	public Retangulo(int posX, int posY, double largura, double altura){
		this.posX = posX;
		this.posY = posY;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea() {
		double a = largura*altura;
		return a;
	}
	
	public double getPerimetro() {
		double c = (2*largura) + (2*altura);
		return c;
	}
	public String toString() {
		String descricao = "Retângulo na posição ("+ this.posX +", "+ this.posY +") com largura de "+ largura +"cm e altura de "+ altura +"cm (área="+ getArea() +"cm2, perímetro="+ getPerimetro()+"cm)";
		return descricao;
	}
}
