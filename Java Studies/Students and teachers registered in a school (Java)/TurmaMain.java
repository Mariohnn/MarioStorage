import java.util.ArrayList;

public class TurmaMain {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Emmett L. Brown",7714,22);
		Aluno aluno2 = new Aluno("Egon Spengler",5907,20);
		Aluno aluno3 = new Aluno("Peter Weyland",7734,19);
		Professor professor = new Professor("Dr.","Hubert J. Farnsworth",2208);
		Turma turma = new Turma("Inicia��o Tecnol�gica e Cient�fica",2016,1,professor);
		turma.addAluno(aluno1);
		turma.addAluno(aluno2);
		turma.addAluno(aluno3);
		turma.getDescricao();
	}
}
