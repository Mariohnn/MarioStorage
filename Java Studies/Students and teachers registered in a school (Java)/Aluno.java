import java.util.Calendar;

public class Aluno {
	String nome;
	int matricula;
	int anoNascimento;
	int ano = Calendar.getInstance().get(Calendar.YEAR);
	
	Aluno() {
		this("",0,0);
	}
	Aluno(String nome, int matricula, int anoNascimento){
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	int getIdade() {
		int idade = ano - this.anoNascimento;
		return idade;
	}
	String getDescricao() {
		String descricao = this.nome + " (mat=" + this.matricula + ", idade=" + getIdade() + ")";
		return descricao;
	}
}
