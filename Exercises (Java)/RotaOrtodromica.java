import java.util.Scanner;

public class RotaOrtodromica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double t1 = scan.nextDouble(), g1 = scan.nextDouble(), t2 = scan.nextDouble(), g2 = scan.nextDouble();
		double d, R = 6371;
		double rt1 = Math.toRadians(t1), rt2 = Math.toRadians(t2), rg1 = Math.toRadians(g1), rg2 = Math.toRadians(g2);
		d = R*Math.acos((Math.sin(rt1)*Math.sin(rt2)) + (Math.cos(rt1)*Math.cos(rt2)*Math.cos(rg1-rg2)));
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1, g1, t2, g2, d);
	}
}
