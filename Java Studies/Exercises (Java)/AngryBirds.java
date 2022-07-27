import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Vo = scan.nextInt(), ang = scan.nextInt();
        float d = scan.nextFloat();
        double rad = Math.toRadians(ang);
        double r = Math.pow(Vo,  2) * Math.sin(2*rad)/9.8;
        if((d > r+0.1) || (d < r-0.1)) {
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}