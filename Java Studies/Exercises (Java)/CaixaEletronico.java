import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int c, d, dd;
		if(v>0 && v%2==0) {
			c = v/50;
			d = (v-(c*50))/10;
			dd = (v-((c*50)+(d*10)))/2;
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2",c,d,dd);
		}
		else { System.out.println("Valor Invalido");}
	}
}
