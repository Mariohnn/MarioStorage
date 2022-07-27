import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int entrada = 0;
        ArrayList<Integer> horatrab = new ArrayList<Integer>();
        ArrayList<ArrayList> funcs = new ArrayList<ArrayList>();
        ArrayList<Integer> horas = new ArrayList<Integer>();
        do {
            for (int j = 0; j < 7; j++) {
                entrada = scan.nextInt();
                if (entrada != -1) {
                    horatrab.add(entrada);
                } else {
                    break;
                }
            }
            if (entrada != -1) {
            	funcs.add(horatrab);
            }
            horatrab = new ArrayList<Integer>();
        } while (entrada != -1);
        scan.close();
        for (int i = 0; i < 7; i++) {
            soma = 0;
            for (int j = 0; j < funcs.size(); j++) {
                soma += (int) funcs.get(j).get(i);
            }
            horas.add(soma);
        }

        for (int i = 0; i < horas.size(); i++) {
            if (Collections.max(horas) == horas.get(i)) {
                System.out.println(i + 1);
            }
        }
    }
}