import java.util.Scanner;

public class IdadeUfam{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int fundacao = 1909;
        int ano = scan.nextInt();
        int idade = ano - fundacao;
        System.out.printf("A UFAM tem %d anos de fundacao", idade);
    }
}