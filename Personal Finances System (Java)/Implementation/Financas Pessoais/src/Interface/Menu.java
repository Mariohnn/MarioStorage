package Interface;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Interface.*;
import trab.*;
import Connector.*;

public class Menu extends JFrame{
	
	//MENU Interativo
	
	public Menu(){

        this.setSize(600,600);
        this.setLayout(null);
        this.setBounds(700,200,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(new Color(60,60,120));
        
        JLabel lTitulo = new JLabel("Finanças Pessoais");
        lTitulo.setBounds(100, 0, 400, 255);
        lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lTitulo.setFont(new Font("FreeSerif", Font.PLAIN, 35));
        lTitulo.setForeground(new Color(255,255,255));
        this.add(lTitulo);

        JLabel lDesc = new JLabel("O que deseja fazer?");
        lDesc.setBounds(100, 30, 400, 255);
        lDesc.setHorizontalAlignment(SwingConstants.CENTER);
        lDesc.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lDesc.setForeground(new Color(255,255,255));
        this.add(lDesc);
        
        JButton bVoltar = new JButton("Voltar");
        bVoltar.setBounds(250, 500, 100, 20);
        bVoltar.setFont(new Font("Calibri", Font.ITALIC, 15));
        bVoltar.setBackground(new Color(255,255,255));
        this.add(bVoltar);
        
        JButton bChecarSaldo = new JButton("Checar o Saldo");
        bChecarSaldo.setBounds(130, 200, 150, 100);
        bChecarSaldo.setFont(new Font("FreeSerif", Font.PLAIN, 15));
        bChecarSaldo.setBackground(new Color(255,255,255));
        this.add(bChecarSaldo);
        
        JButton bAddSaldo = new JButton("Adicionar Saldo");
        bAddSaldo.setBounds(320, 200, 150, 100);
        bAddSaldo.setFont(new Font("FreeSerif", Font.PLAIN, 15));
        bAddSaldo.setBackground(new Color(255,255,255));
        this.add(bAddSaldo);
        
        JButton bAddDespesa = new JButton("Adicionar Despesas");
        bAddDespesa.setBounds(130, 320, 150, 100);
        bAddDespesa.setFont(new Font("FreeSerif", Font.PLAIN, 15));
        bAddDespesa.setBackground(new Color(255,255,255));
        this.add(bAddDespesa);
        
        JButton bListarDespesas = new JButton("Listar Despesas");
        bListarDespesas.setBounds(320, 320, 150, 100);
        bListarDespesas.setFont(new Font("FreeSerif", Font.PLAIN, 15));
        bListarDespesas.setBackground(new Color(255,255,255));
        this.add(bListarDespesas);
        
        //botão de retornar ao login
        bVoltar.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		LoginView retornar = new LoginView();
        		retornar.setVisible(true);
        		dispose();
        	}
        });
        
        //botão interativo de adicionar saldo
        bAddSaldo.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		ViewAddSaldo as = new ViewAddSaldo();
        		as.setVisible(true);
        	}
        });
        
        //botão interativo de adicionar despesas
        bAddDespesa.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		despesaView dv = new despesaView();
        		dv.setVisible(true);
        		dispose();
        	}
        });
        
        //botão interativo de checar saldo
        bChecarSaldo.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		SaldoView sv = new SaldoView();
        		sv.setVisible(true);
        	}
        });
        
        //botão interativo para listar despesas
        bListarDespesas.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		ViewLista vl = new ViewLista();
        		vl.setVisible(true);
        	}
        });
	}
}
