import java.util.Scanner;

public class AproximacaoSeno {
	public static double Fatorial (double valor){
        double fat = 1;
        for(int i = 2; i<=valor; i++) {
            fat = fat * i;
        }
        return fat;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angulo = scan.nextDouble(), i = scan.nextDouble();
        double radians = Math.toRadians(angulo);
        double n = radians;
        int x = 3;
        if(i == 1) {
            System.out.printf("%.10f", radians);
        }
        else {
            System.out.printf("%.10f\n", radians);
            for(int k = 1; k < i; k++) {
                if(k%2==0) {
                    n = (n + (Math.pow(radians, x)/(Fatorial(x)))); 
                    x = x + 2;
                    System.out.printf("%.10f\n", n);
                }
                else {
                    n = (n - (Math.pow(radians, x)/(Fatorial(x))));
                    x = x + 2;
                    System.out.printf("%.10f\n", n);
                }
            }
        }
    }
}  