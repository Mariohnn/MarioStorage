import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println();
			if(i%2==0) {
				for(int j = 0; j<n; j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j = 0; j<n; j++) {
					System.out.print(" *");
				}
			}
		}
	}
}
