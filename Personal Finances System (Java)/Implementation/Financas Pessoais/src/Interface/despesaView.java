package Interface;

import trab.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Connector.UsuariosDAO;
import Connector.tabelaGastosDAO;
import Interface.Menu;

public class despesaView extends JFrame{
	
	//tela interativa ao clicar em adicionar despesas
	
	public despesaView(){
        super("Finanças Pessoais");
        this.setBounds(700,200,600,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(new Color(60,60,120));
        
        //labels pré definidos
        
        JLabel lInfo = new JLabel("Para inserir uma despesa");
        lInfo.setBounds(100, 0, 400, 100);
        lInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lInfo.setFont(new Font("FreeSerif", Font.BOLD, 30));
        lInfo.setForeground(new Color(255,255,255));
        this.add(lInfo);
        
        JLabel lInfo2 = new JLabel("insira a seguir:");
        lInfo2.setBounds(150, 30, 300, 100);
        lInfo2.setHorizontalAlignment(SwingConstants.CENTER);
        lInfo2.setFont(new Font("FreeSerif", Font.BOLD, 30));
        lInfo2.setForeground(new Color(255,255,255));
        this.add(lInfo2);
        
        JLabel lUsuario = new JLabel("Usuário:");
        lUsuario.setBounds(85, 80, 300, 100);
        lUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lUsuario.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lUsuario.setForeground(new Color(255,255,255));
        this.add(lUsuario);
        
        JLabel lTipo = new JLabel("Tipo do gasto:");
        lTipo.setBounds(105, 140, 300, 100);
        lTipo.setHorizontalAlignment(SwingConstants.CENTER);
        lTipo.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lTipo.setForeground(new Color(255,255,255));
        this.add(lTipo);
        
        JLabel lData = new JLabel("Data:");
        lData.setBounds(75, 200, 300, 100);
        lData.setHorizontalAlignment(SwingConstants.CENTER);
        lData.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lData.setForeground(new Color(255,255,255));
        this.add(lData);
        
        JLabel lValor = new JLabel("Valor:");
        lValor.setBounds(75, 260, 300, 100);
        lValor.setHorizontalAlignment(SwingConstants.CENTER);
        lValor.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lValor.setForeground(new Color(255,255,255));
        this.add(lValor);
        
        
        // espaco em branco para inputs do usuario
        
        JTextField tUsuario = new JTextField("");
        tUsuario.setBounds(200, 140, 200, 20);
        tUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tUsuario.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tUsuario.setForeground(new Color(0,0,0));
        this.add(tUsuario);
        
        JTextField tTipo = new JTextField("");
        tTipo.setBounds(200, 200, 200, 20);
        tTipo.setHorizontalAlignment(SwingConstants.CENTER);
        tTipo.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tTipo.setForeground(new Color(0,0,0));
        this.add(tTipo);
        
        JTextField tData = new JTextField("");
        tData.setBounds(200, 320, 200, 20);
        tData.setHorizontalAlignment(SwingConstants.CENTER);
        tData.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tData.setForeground(new Color(0,0,0));
        this.add(tData);
        
        JTextField tValor = new JTextField("");
        tValor.setBounds(200, 260, 200, 20);
        tValor.setHorizontalAlignment(SwingConstants.CENTER);
        tValor.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tValor.setForeground(new Color(0,0,0));
        this.add(tValor);
        
        //botões
        
        JButton bRegistrar = new JButton("Registrar Gasto");
        bRegistrar.setBounds(220,400,160,25);
        bRegistrar.setFont(new Font("FreeSerif", Font.ITALIC, 16));
        bRegistrar.setBackground(new Color(255,255,255));
        bRegistrar.setForeground(new Color(0,0,0));
        this.add(bRegistrar);
        
        JButton bVoltar = new JButton("Voltar");
        bVoltar.setBounds(260,450,80,25);
        bVoltar.setFont(new Font("FreeSerif", Font.ITALIC, 16));
        bVoltar.setBackground(new Color(255,255,255));
        bVoltar.setForeground(new Color(0,0,0));
        this.add(bVoltar);
        
        
        //funcionalidades
        
        bVoltar.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		Menu menu = new Menu();
        		menu.setVisible(true);
        		dispose();
        	}
        });
        
        bRegistrar.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		String user = tUsuario.getText();
        		String tipo = tTipo.getText();
        		String data = tData.getText();
        		float valor = Float.valueOf(tValor.getText().toString());
        		if(tabelaGastosDAO.adicionarDespesa(user,tipo,data,valor)) {
        			JOptionPane.showInternalMessageDialog(null, "Gasto registrado com Sucesso!","Gasto registrado com Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        		}else {
        			JOptionPane.showInternalMessageDialog(null, "Não foi possível registrar o gasto.","Não foi possível registrar o gasto.", JOptionPane.INFORMATION_MESSAGE);
        		}
        	}
        });
	}	
}