import java.util.ArrayList;

public class Turma {
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	int contador = 0;
	
	
	Turma(){
		this("","",0,false);
	}
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}
	
	void addHorario(int horario) {
		horarios.add(horario);
		this.contador++;
	}
	
	String getHorariosString() {
		int j = 0;
		String desc = "";
		for(int i=1;i<35;i++) {
			if(horarios.get(j) == i  &&  i<8) {
				switch(i) {
					case 1: desc = desc + "segunda "+ (i+7) +"hs, ";break;
					case 2: desc = desc + "segunda "+ (i+8) +"hs, ";break;
					case 3: desc = desc + "segunda "+ (i+9) +"hs, ";break;
					case 4: desc = desc + "segunda "+ (i+10) +"hs, ";break;
					case 5: desc = desc + "segunda "+ (i+11) +"hs, ";break;
					case 6: desc = desc + "segunda "+ (i+12) +"hs, ";break;
					case 7: desc = desc + "segunda "+ (i+13) +"hs, ";break;
				}
				if(j==contador-1) {break;}
				j++;
			}
			else if(horarios.get(j) == i  &&  (i>7 && i<15)) {
				switch(i) {
					case 8: desc = desc + "terça "+ (i) +"hs, ";break;
					case 9: desc = desc + "terça "+ (i+1) +"hs, ";break;
					case 10: desc = desc + "terça "+ (i+2) +"hs, ";break;
					case 11: desc = desc + "terça "+ (i+3) +"hs, ";break;
					case 12: desc = desc + "terça "+ (i+4) +"hs, ";break;
					case 13: desc = desc + "terça "+ (i+5) +"hs, ";break;
					case 14: desc = desc + "terça "+ (i+6) +"hs, ";break;
				}
				if(j==contador-1) {break;}
				j++;
			}
			else if(horarios.get(j) == i  &&  (i>14 && i<22)) {
				switch(i) {
					case 15: desc = desc + "quarta "+ (i-7) +"hs, ";break;
					case 16: desc = desc + "quarta "+ (i-6) +"hs, ";break;
					case 17: desc = desc + "quarta "+ (i-5) +"hs, ";break;
					case 18: desc = desc + "quarta "+ (i-4) +"hs, ";break;
					case 19: desc = desc + "quarta "+ (i-3) +"hs, ";break;
					case 20: desc = desc + "quarta "+ (i-2) +"hs, ";break;
					case 21: desc = desc + "quarta "+ (i-1) +"hs, ";break;
				}
				if(j==contador-1) {break;}
				j++;
			}
			else if(horarios.get(j) == i  && (i>21 && i<29)) {
				switch(i) {
					case 22: desc = desc + "quinta "+ (i-14) +"hs, ";break;
					case 23: desc = desc + "quinta "+ (i-13) +"hs, ";break;
					case 24: desc = desc + "quinta "+ (i-12) +"hs, ";break;
					case 25: desc = desc + "quinta "+ (i-11) +"hs, ";break;
					case 26: desc = desc + "quinta "+ (i-10) +"hs, ";break;
					case 27: desc = desc + "quinta "+ (i-9) +"hs, ";break;
					case 28: desc = desc + "quinta "+ (i-8) +"hs, ";break;
				}
				if(j==contador-1) {break;}
				j++;
			}
			else if(horarios.get(j) == i  &&  i>28) {
				switch(i) {
					case 29: desc = desc + "sexta "+ (i-21) +"hs, ";break;
					case 30: desc = desc + "sexta "+ (i-20) +"hs, ";break;
					case 31: desc = desc + "sexta "+ (i-19) +"hs, ";break;
					case 32: desc = desc + "sexta "+ (i-18) +"hs, ";break;
					case 33: desc = desc + "sexta "+ (i-17) +"hs, ";break;
					case 34: desc = desc + "sexta "+ (i-16) +"hs, ";break;
					case 35: desc = desc + "sexta "+ (i-15) +"hs, ";break;
				}
				if(j==contador-1) {break;}
				j++;
			}
		}
		int tamanho = desc.length(); 
		return desc.substring(0,tamanho-2);
	}
	
	String getTipoString() {
		if(acessivel == true) { return "sim";}
		else if(acessivel == false){return  "não";}
		return null;
	}
	
	String getDescricao() {
		String descricao = "Turma: "+ this.nome +"\n";
		descricao = descricao + "Professor: "+ this.professor +"\n";
		descricao = descricao + "Número de Alunos: "+ this.numAlunos +"\n";
		descricao = descricao + "Horário: "+ getHorariosString() +"\n";
		descricao = descricao + "Acessível: "+ getTipoString();
		return descricao;
	}
	
}

