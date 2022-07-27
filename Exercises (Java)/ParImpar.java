import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n!=-1) {
			if(n%2==0) {
				System.out.printf("PAR");
			}
			else {System.out.printf("IMPAR");}
			n = scan.nextInt();
		}
	}
}

