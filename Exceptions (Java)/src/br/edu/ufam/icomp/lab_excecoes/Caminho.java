package br.edu.ufam.icomp.lab_excecoes;

public class Caminho extends RoverException {
	private int tamanho;
	private Coordenada caminho[];
	int i = 0;
	
	public Caminho(int MaxTam){
		caminho = new Coordenada[MaxTam];
		this.tamanho = MaxTam;
	}
	
	public int tamanho() {
        for (int i = 0; i < caminho.length; i++) {
            if (caminho[i] == null) {
                return i;
            }
        }
        return caminho.length;
    }
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
		if (tamanho() >= this.tamanho) {
            throw new TamanhoMaximoExcedidoException();
        } 
		else if (tamanho() >= 1) {
            if ((Math.sqrt((Math.pow(caminho[tamanho() - 1].getPosX() - coordenada.getPosX(), 2)) + (Math.pow(caminho[tamanho() - 1].getPosY() - coordenada.getPosY(), 2)))) > 15.0) {
                throw new DistanciaEntrePontosExcedidaException();
            }
            else {
            	caminho[tamanho()] = coordenada;
            }
		}
		else {
			caminho[tamanho()] = coordenada;
		}
		
	}
	
	public void reset() {
        for(int k = 0; k < caminho.length; k++) {
            caminho[k] = null;
        }
        tamanho = 0;
    }
	
	public String toString() {
        int j=0;
		String desc = String.format("Dados do caminho:\n" + "  - Quantidade de pontos: %d\n  - Pontos:\n", tamanho());
        while (j<tamanho) {
        	if(caminho[j] == null) {
        		break;
        	}else {
        		desc += "    -> " + caminho[j].toString() + "\n";
                j++;
        	}
        }
        return desc;
    }
	
}




 