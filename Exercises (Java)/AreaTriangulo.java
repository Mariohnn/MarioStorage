import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), s=0;
		double A=0;
		s = (a + b + c)/2;
		A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		if(a <= 0 || b <= 0 || c <= 0 || (a+b) <= c || (b+c) <= a || (a+c) <= b) {
	        System.out.println("Triangulo invalido");
	    }
		else {System.out.printf("%.2f", A);}
	}
}
