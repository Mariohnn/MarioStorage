import java.util.Scanner;

public class ArteAscii{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		for(int j=valor;j>0;j--){
			System.out.println();
			for(int i=0;i<j;i++) {
				System.out.print("*");
			}
		}
		for(int k=1;k<valor+1;k++){
			System.out.println();
			for(int l=0;l<k;l++) {
				System.out.print("*");
			}
		}
	}
}