import java.util.Scanner;

public class OperacoesInteiros{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float media = 0;
		int v[];
		v = new int[100];
		int count = 0,  pares = 0, impares = 0, soma = 0, maior, menor, stop = 0;
		do {	
			v[count] = scan.nextInt();
			maior = v[0];
			menor = v[0];
			if(v[count]==-1) {
				stop++;
				
				if(stop==2) {break;}
				media = (float)soma/count;
				for(int i=0;i<count;i++) {
					if(v[i]>maior) { maior = v[i];}
				}
				for(int i=0;i<count;i++) {
					if(v[i]<menor) { menor = v[i];}
				}
				System.out.printf("%d", count);
				System.out.println();
				System.out.printf("%d", pares);
				System.out.println();
				System.out.printf("%d", impares);
				System.out.println();
				System.out.printf("%d", soma);
				System.out.println();
				System.out.printf("%.2f", media);
				System.out.println();
				System.out.printf("%d", maior);
				System.out.println();
				System.out.printf("%d", menor);
				System.out.println();
				soma = 0;
				count = 0;
				pares = 0;
				impares = 0;
			}
			else {
				if(v[count]%2==0) {pares++;}
				else if(v[count]%2!=0) {impares++;}
				soma = soma + v[count];
				count++;
				stop = 0;
			}
		}while(stop!= 2);
	}
}
