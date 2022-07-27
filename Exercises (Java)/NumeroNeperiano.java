import java.util.Scanner;

class NumeroNeperiano {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int fatorial = 1;
        double resultado = 0.0;
        double entrada = scan.nextDouble();
        scan.close();

        for (int i = 0; i < entrada; i++) {
            x = i;
            for (x = i; x > 1; x--) {
                fatorial *= x;
            }
            resultado += 1.0 / fatorial;
            fatorial = 1;
        }

        System.out.printf("%.6f", resultado);

    }

}