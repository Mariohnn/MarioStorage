import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float c = scan.nextInt();
		float f = ((9*c)/5)+32;
		System.out.printf("%.1f", f);
	}
}
