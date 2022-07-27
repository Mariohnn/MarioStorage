import java.util.Scanner;

public class VolumeCombustivel{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double H = scan.nextFloat(), h = scan.nextFloat(), r = scan.nextFloat();
		double Vtotal, Vtanq, Vcalota;
		double pi = Math.PI;
		Vtotal = ((4*pi*r*r*r)/3) + (H-(2*r))*pi*r*r;
		if(H<0 || h<0 ||r<0 || H<h) {System.out.printf("-1.000");}
		else if(h<r) {
			Vtanq = (pi*(h*h)*((3*r)-h))/3;
			System.out.printf("%.3f", Vtanq);
		}
		else if(h==r) {
			Vtanq = (4*pi*r*r*r)/6;
			System.out.printf("%.3f", Vtanq);
		}
		else if(h>r && h<(H-r)) {
			Vtanq = ((2*pi*r*r*r)/3) + ((h-r)*pi*r*r);
			System.out.printf("%.3f", Vtanq);
		}
		else if(h==(H-r)) {
			Vtanq = ((4*pi*r*r*r)/6) + ((H-(2*r))*pi*r*r);
			System.out.printf("%.3f", Vtanq);
		}
		else if(h>(H-r)) {
			Vtanq = Vtotal - (pi*(H-h)*(H-h)*((3*r)-(H-h))/3);
			System.out.printf("%.3f", Vtanq);
		}
		else {
			System.out.printf("-1.000");
		}
	}
}