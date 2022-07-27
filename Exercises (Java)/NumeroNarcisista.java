import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble(), n;
		n = x;
		double soma = 0, count=0;
		double resto = 0;
		while(n>0) {
			resto = n%10;
			n = (n-resto)/10;
			count++;
		}
		n = x;
		resto = 0;
		while(n>0) {
			resto = (n%10);
			n = (n-resto)/10;
			soma = soma + Math.pow(resto, count);
			
		}
		if(x == soma) {
			System.out.println("SIM");
		}
		else {System.out.println("NAO");}
	}
}