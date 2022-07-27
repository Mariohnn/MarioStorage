import java.util.Scanner;

public class OperacoesString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = new String();
        s = scan.nextLine();
        int tamS = s.length();
        char first = s.charAt(0);
        char last = s.charAt(tamS - 1);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        int vog = 0;
        System.out.printf("%d\n", tamS);
        System.out.printf("%c\n", first);
        System.out.printf("%c\n", last);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(s.replaceAll("a", "e"));
        for (int k = 0; k < s.length(); k++) {
            if(k%2 == 0) {
                System.out.print(s.charAt(k));
            }
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117 | c == 65 | c == 69 | c == 73 | c == 79 | c == 85) {
                vog++;
                continue;
            }
            else {
            	continue;
            }
        }
        System.out.println();
        System.out.printf("%d", vog);
    }
}