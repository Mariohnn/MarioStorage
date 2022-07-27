import java.util.Scanner;

public class ValorExpoente {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double valor = 0, exp = 0, soma=0;
		while(n>=soma) {
			exp++;
			valor = Math.pow(2, exp);
			soma = soma + valor;
		}
		System.out.printf("%.0f", exp);
	}
}
