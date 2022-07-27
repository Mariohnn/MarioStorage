import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double n = scan.nextFloat();
		double raiz;
		raiz = Math.sqrt(n);
		System.out.printf("%.4f", raiz);
	}
}
