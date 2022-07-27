import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        double a = 2, b = 3, o = 4, pi = 3;
        if(valor == 1) {
            System.out.printf("%.6f", pi);
        }
        else {
            System.out.printf("%.6f", pi);
            for(int i = 1; i < valor; i++) {
                if(i % 2 != 0){
                    pi = (pi + (4.0/(a*b*o)));
                    a = a + 2;
                    b = b + 2;
                    o = o + 2;
                    System.out.printf("%.6f\n", pi);
                }
                else {
                    pi = (pi - ((4.0/(a*b*o))));
                    a = a + 2;
                    b = b + 2;
                    o = o + 2;
                    System.out.printf("%.6f\n", pi);
                }
            }
        }
    }
}