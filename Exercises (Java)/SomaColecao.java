import java.util.Scanner;

public class SomaColecao{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int soma = n;
        while(n!=-1) {
            n = scan.nextInt();
            soma = soma + n;
        }
        soma = soma + 1;
        System.out.printf("%d", soma);
    }
}