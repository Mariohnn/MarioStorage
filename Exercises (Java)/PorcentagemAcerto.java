import java.util.Scanner;

public class PorcentagemAcerto {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int gabarito[], i=0, j=0, resposta[];
		gabarito = new int[100];
		resposta = new int[100];
		double media, count=0;
		gabarito[0] = scan.nextInt();
		while(gabarito[i]!=-1) {
			i++;
			gabarito[i] = scan.nextInt();
		}
		resposta[0] = scan.nextInt();
		while(resposta[j]!=-1) {
			j++;
			resposta[j] = scan.nextInt();
		}
		for(int k=0; k<i; k++) {
			if(gabarito[k] == resposta[k]) {count++;}
		}
		media = (100*count)/i;
		System.out.printf("%.2f", media);
	}
}
