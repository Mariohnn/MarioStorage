import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int soma = 0, resto = 0;
		while(n>0) {
			resto = n%10;
			n = (n-resto)/10;
			soma = soma + resto;
		}
		System.out.printf("%d", soma);
		
	}
}
