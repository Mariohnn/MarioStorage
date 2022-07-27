import java.util.Scanner;

public class Mediana{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int vet[];
		vet = new int[100];
		int i = 0;
		float mediana = 0;
		vet[i] = scan.nextInt();
		while(vet[i]!=-1) {
			i++;
			vet[i] = scan.nextInt();
		}
		if(i%2==0) {
			mediana = (vet[i/2]+vet[(i/2)-1])/2;
			System.out.printf("%.1f", mediana);
		}
		else {
			mediana = vet[(i/2)];
			System.out.printf("%.1f", mediana);
		}
	}
}