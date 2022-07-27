import java.util.Scanner;

public class DataExtenso {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String valorStr = scan.next();
        String numStr1 = valorStr.substring(0, 2);
        String numStr2 = valorStr.substring(2, 4);
        String numStr3 = valorStr.substring(4, 8);
        int data = Integer.parseInt(numStr1);
        int mes = Integer.parseInt(numStr2);
        int ano = Integer.parseInt(numStr3);
        if(mes == 1) {System.out.printf("%d de janeiro de %d", data, ano);}
        if(mes == 2) {System.out.printf("%d de fevereiro de %d", data, ano);}
        if(mes == 3) {System.out.printf("%d de março de %d", data, ano);}
        if(mes == 4) {System.out.printf("%d de abril de %d", data, ano);}
        if(mes == 5) {System.out.printf("%d de maio de %d", data, ano);}
        if(mes == 6) {System.out.printf("%d de junho de %d", data, ano);}
        if(mes == 7) {System.out.printf("%d de julho de %d", data, ano);}
        if(mes == 8) {System.out.printf("%d de agosto de %d", data, ano);}
        if(mes == 9) {System.out.printf("%d de setembro de %d", data, ano);}
        if(mes == 10) {System.out.printf("%d de outubro de %d", data, ano);}
        if(mes == 11) {System.out.printf("%d de novembro de %d", data, ano);}
        if(mes == 12) {System.out.printf("%d de dezembro de %d", data, ano);}
    }
}