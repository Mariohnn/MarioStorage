import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int raio = scan.nextInt(), x = scan.nextInt(), op = scan.nextInt();
        double areaAr = 0;
        if(op==1) {
            areaAr = ((3.14159265359/3)*(x*x)*((3*raio)-x));
            System.out.printf("%.4f",areaAr);
        }
        if(op==2) {
            double areaEsf = ((4*(3.14159265359)*(raio*raio*raio))/3);
            areaAr = ((3.14159265359/3)*(x*x)*((3*raio)-x));
            double comb = areaEsf - areaAr;
            System.out.printf("%.4f",comb);
        }        
    }
}