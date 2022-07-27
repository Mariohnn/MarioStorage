package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{
	
	public Quadrado(int posX, int posY, double lado){
		this.posX = posX;
		this.posY = posY;
		this.largura = lado;
		this.altura = lado;
	}
	
	public String toString() {
		String descricao = "Quadrado na posi��o ("+ this.posX +", "+ this.posY +") com lado de "+ this.largura +"cm (�rea="+ this.getArea() +"cm2, per�metro="+ this.getPerimetro() +"cm)";
		return descricao;
	}
}
