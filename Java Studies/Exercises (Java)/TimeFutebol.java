import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int vitorias = 0, empates = 0, derrotas = 0;
		int scoreHome[], scoreAway[], partida = 0, jogo = 0;
		scoreHome = new int[100];
		scoreAway = new int[100];
		scoreHome[partida] = scan.nextInt();
		while(scoreHome[partida]!=-1) {
			partida++;
			scoreHome[partida] = scan.nextInt();
		}
		scoreAway[jogo] = scan.nextInt();
		while(scoreAway[jogo]!=-1) {
			jogo++;
			scoreAway[jogo] = scan.nextInt();
		}
		for(int i=0; i<partida; i++) {
			if(scoreHome[i]>scoreAway[i]) { vitorias++;}
			else if(scoreHome[i]==scoreAway[i]) {empates++;}
			else if(scoreHome[i]<scoreAway[i]) {derrotas++;}
		}
		System.out.printf("%d %d %d", vitorias, empates, derrotas);
	}
}
