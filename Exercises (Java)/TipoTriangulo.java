import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
    	if(a <= 0 || b <= 0 || c <= 0 || (a+b) <= c || (b+c) <= a || (a+c) <= b) {
    		System.out.println("invalido");
    	}
    	else {
    		if(a == b && b == c && c == a) {
    			System.out.println("equilatero");
    		}
    		else if(!(a == b && b == c && c == a)) {
    			System.out.println("escaleno");
    		}
    		else {
    			System.out.println("isoceles");
    		}
    	}
    }
}