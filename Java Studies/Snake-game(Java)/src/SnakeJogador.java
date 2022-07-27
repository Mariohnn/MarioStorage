import java.awt.Point;
import java.util.*;

/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, a próxima direção da cobra é escolhida aleatoriamente
 * entre as direções possíveis (que não geram colisões).
 * <p>
 * Use esta classe como base inicial para a sua solução do jogo. Basicamente
 * você precisará reimplementar o método {@code getDirecao}.
 * 
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo;
    
    /**
     * Cria um novo jogador para o jogo passado como parâmetro.
     * @param jogo jogo snake.
     */
    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    /**
     * Executado pelo método {@link Snake#inicia()} a cada 'tick' do jogo para
     * perguntar qual a próxima direção da cobra ('C'ima, 'D'ireita, 'B'aixo,
     * 'E'squerda ou 'N'enhum).
     * 
     * @return a próxima direção da cobra.
     */
    public char Exemplo() {
        /*
         * IMPLEMENTE AQUI A SUA SOLUÇÃO PARA O JOGO
         */
        
        ArrayList<Character> possiveisDirecoes = new ArrayList<Character>(4);
        Point cabeca = jogo.getSegmentos().getFirst();
        
        // Adiciona as possíveis direções na lista
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) possiveisDirecoes.add('C'); // Cima
        if (jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) possiveisDirecoes.add('D'); // Direita
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) possiveisDirecoes.add('B'); // Baixo
        if (jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) possiveisDirecoes.add('E'); // Esquerda
        
        // Não existe mais nenhuma direção disponível
        if (possiveisDirecoes.size() == 0) return 'N';
        
        // Pega um número aleatório entre 0 e o tamanho da lista e retorna a direção
        int posicao = possiveisDirecoes.size()-2;
        return possiveisDirecoes.get(posicao);
    }
    
    
    public char getDirecao() {
    	Point cabeca = jogo.getSegmentos().getFirst();
    	Point comida = jogo.getComida(); 
    	char direcao;
    	direcao = 'D';
    	
    	
    	if(cabeca.x<comida.x && jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) { 
    		direcao = 'D';
    	}
    	else if(cabeca.x>comida.x && jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) { 
    		direcao = 'E';
    	}
    	else if(cabeca.y>comida.y && jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) { 
    		direcao = 'C';
    	}
    	else { 
    		direcao = 'B';
    	}
    	
 
    	if (direcao == 'C' && jogo.isCelulaLivre(cabeca.x, cabeca.y-1) == false) {
    		if (jogo.isCelulaLivre(cabeca.x-1, cabeca.y) == false)  direcao = 'D';
    		else direcao = 'E';
    	}
    	else if (direcao == 'B' && jogo.isCelulaLivre(cabeca.x, cabeca.y+1) == false) {
    		if (jogo.isCelulaLivre(cabeca.x-1, cabeca.y) == false)  direcao = 'D';
    		else direcao = 'E';
    	}
    	else if (direcao == 'D' && jogo.isCelulaLivre(cabeca.x+1, cabeca.y) == false) {
    		if (jogo.isCelulaLivre(cabeca.x, cabeca.y-1) == false)  direcao = 'B';
    		else direcao = 'C';
    	}
    	else if (direcao == 'E' && jogo.isCelulaLivre(cabeca.x-1, cabeca.y) == false) {
    		if (jogo.isCelulaLivre(cabeca.x, cabeca.y-1)  == false)  direcao = 'B';
    		else direcao = 'C';
    	} 
    	else if (direcao == 'D' && jogo.isCelulaLivre(cabeca.x, cabeca.y+1)==false && jogo.isCelulaLivre(cabeca.x, cabeca.y-1)==false) direcao = 'D';
    	else if (direcao == 'E' && jogo.isCelulaLivre(cabeca.x, cabeca.y+1)==false && jogo.isCelulaLivre(cabeca.x, cabeca.y-1)==false) direcao = 'E';
    	else if (direcao == 'C' && jogo.isCelulaLivre(cabeca.x+1, cabeca.y)==false && jogo.isCelulaLivre(cabeca.x-1, cabeca.y)==false) direcao = 'C';
    	else if (direcao == 'B' && jogo.isCelulaLivre(cabeca.x+1, cabeca.y)==false && jogo.isCelulaLivre(cabeca.x-1, cabeca.y)==false) direcao = 'B';
	
    	return direcao;
    }
}
