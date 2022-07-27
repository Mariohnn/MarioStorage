import java.util.Scanner;

public class Desconto {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double preco = scan.nextDouble();
		if(preco<200) {System.out.printf("%.2f", preco);}
		else {
			//preco = preco*(0,95)
			System.out.printf("%.2f", preco*0.95);
		}
	}
}
