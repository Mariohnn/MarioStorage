import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double vh = scan.nextFloat();
		int t = scan.nextInt();
		double total = vh*t;
		System.out.printf("Salario Bruto: R$%.2f", total);
		System.out.println();
		System.out.printf("IR: R$%.2f", total*0.11);
		System.out.println();
		System.out.printf("INSS: R$%.2f", total*0.08);
		System.out.println();
		System.out.printf("Total de descontos: R$%.2f", total*0.19);
		System.out.println();
		System.out.printf("Salario liquido: R$%.2f", total*0.81);
	}
}