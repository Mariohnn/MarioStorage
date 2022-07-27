
public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	Sala(){
		this(0,0,0,false);
	}
	
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	String getTipoString() {
		if(acessivel == true) { return "acess�vel";}
		else if(acessivel == false){return  "n�o acess�vel";}
		return null;
	}
	
	String getDescricao() {
		String descricao = "Bloco "+ this.bloco +", Sala "+ this.sala +" ("+ this.capacidade +" lugares, "+ getTipoString() +")";
		return descricao;
	}
}