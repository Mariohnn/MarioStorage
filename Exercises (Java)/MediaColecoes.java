import java.util.Scanner;

public class MediaColecoes{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 0;
		float soma = n,count = 0, stop = 0;
		float media = 0;
		do {
			n = scan.nextInt();
			if(n==-1) {
				stop++;
				if(stop==2) {break;}
				media = soma/count;
				System.out.printf("%.2f", media);
				System.out.println();
				soma = 0;
				count = 0;
			}
			else {
				soma = soma + n;
				count++;
				stop = 0;
			}
		}while(stop!= 2);
	}
}