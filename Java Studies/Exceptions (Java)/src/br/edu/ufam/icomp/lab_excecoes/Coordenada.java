package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada extends RoverException{
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
		
		this.posX = posX;
		this.posY = posY;
		this.digito = digito;
		if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
		if(posX < 0 || posY < 0 || posX > 30000 || posY > 30000) throw new CoordenadaForaDosLimitesException();
		if((posX+posY)%10 != digito) throw new DigitoInvalidoException();
	}

	public int getPosX(){
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public double distancia(Coordenada coordenada) {
		return Math.sqrt(Math.pow(coordenada.posX-this.posX, 2) + Math.pow(coordenada.posY - this.posY, 2));
	}
	
	public String toString() {
		return this.posX + ", " + this.posY;
	}
}
