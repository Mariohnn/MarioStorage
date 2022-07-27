import java.util.Scanner;

public class AreaVolume {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double A, V;
		double pi = Math.PI;
		A = pi*(Math.pow(r, 2));
		V = (4.0*pi*Math.pow(r, 3))/3.0;
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.", r, A);
		System.out.println();
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", r, V);
	}
}
