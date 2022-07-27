import java.util.ArrayList;

public class Turma{
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Turma(){
		this("",0,0,null);
	}
	
	Turma(String disciplina, int ano, int semestre, Professor professor){
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
	}
	
	void addAluno(Aluno aluno) {
		for(int i = 0; i<alunos.size(); i++) {
			if(aluno.matricula == alunos.get(i).matricula) {
				return;
			}
		}
		alunos.add(aluno);
	}
	Aluno getAluno(int matricula) {
		int i = 0;
		alunos.get(0);
		for(i = 1; i<alunos.size(); i++) {
			if(matricula == alunos.get(i).matricula) {
				return alunos.get(i);
			}
			alunos.get(i);
		}
		return null;
	}
	double getMediaIdade() {
		int i;
		float soma = 0;
		for(i = 0; i<alunos.size(); i++) {
			soma = soma + alunos.get(i).getIdade();	
		}
		return (soma/alunos.size());
	}
	
	String getDescricao() {
		String descricao = "Turma " + this.disciplina + " - " + this.ano + "/" + this.semestre + " (" + professor.getDescricao() + "):\n";
		for(int i = 0; i<alunos.size(); i++) {
			descricao = descricao + "  - Aluno "+ (i+1) +": "+ alunos.get(i).getDescricao() +"\n";
		}
		return descricao;
	}
	
}
