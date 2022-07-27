package Interface;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Interface.*;
import trab.*;
import Connector.*;

public class ViewLista extends JFrame{
	
	//Tela que abre ao clicar "Listar Despesas"
	
	public ViewLista() {
		this.setSize(600,600);
        this.setLayout(null);
        this.setBounds(700,200,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(new Color(60,60,120));
        
        JLabel lTitulo = new JLabel("Listagem de Gastos:");
        lTitulo.setBounds(100, 0, 400, 255);
        lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lTitulo.setFont(new Font("FreeSerif", Font.PLAIN, 25));
        lTitulo.setForeground(new Color(255,255,255));
        this.add(lTitulo);
        
        JLabel lNome = new JLabel("Digite seu nome de usuário");
        lNome.setBounds(0, 0, 400, 100);
        lNome.setHorizontalAlignment(SwingConstants.CENTER);
        lNome.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lNome.setForeground(new Color(255,255,255));
        this.add(lNome);
        
        JTextField tNome = new JTextField();
        tNome.setBounds(50, 80, 300, 40);
        tNome.setHorizontalAlignment(SwingConstants.CENTER);
        tNome.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tNome.setForeground(new Color(0,0,0));
        this.add(tNome);
       
        // não consegui listar os gastos, esta era a tabela que iria mostrá-los
        // não consegui importar o nome de usuario do login para cá, para referenciá-lo na funcao
        /*
        String listarDespesas = tabelaGastosDAO.mostrarDespesas(nome);
        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(75, 100, 300, 300);
        this.add(jTextArea);
        jTextArea.append(listarDespesas);
	*/
	}
}
