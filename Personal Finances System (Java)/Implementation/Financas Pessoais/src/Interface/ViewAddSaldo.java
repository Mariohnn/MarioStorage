package Interface;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Interface.*;
import trab.*;
import Connector.*;


public class ViewAddSaldo extends JFrame{
	
	
	// Tela mostrada ao interagir com "adicionar saldo"
	
	
	public ViewAddSaldo(){

        this.setBounds(800,300,400,400);
        this.setLayout(null);
        Container con = this.getContentPane();
        con.setBackground(new Color(60,60,120));
        
        JLabel lInfo = new JLabel("Para adicionar saldo, digite:");
        lInfo.setBounds(0, 0, 400, 100);
        lInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lInfo.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lInfo.setForeground(new Color(255,255,255));
        this.add(lInfo);
        
        JLabel lUsuario = new JLabel("Usuário:");
        lUsuario.setBounds(0, 60, 400, 100);
        lUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lUsuario.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lUsuario.setForeground(new Color(255,255,255));
        this.add(lUsuario);
        
        JLabel lSaldo = new JLabel("Saldo a ser adicionado:");
        lSaldo.setBounds(0, 110, 400, 200);
        lSaldo.setHorizontalAlignment(SwingConstants.CENTER);
        lSaldo.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lSaldo.setForeground(new Color(255,255,255));
        this.add(lSaldo);
        
        JTextField tNome = new JTextField();
        tNome.setBounds(80, 120, 250, 30);
        tNome.setHorizontalAlignment(SwingConstants.CENTER);
        tNome.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tNome.setForeground(new Color(0,0,0));
        this.add(tNome);
        
        JTextField tSaldo = new JTextField();
        tSaldo.setBounds(80, 220, 250, 30);
        tSaldo.setHorizontalAlignment(SwingConstants.CENTER);
        tSaldo.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        tSaldo.setForeground(new Color(0,0,0));
        this.add(tSaldo);
        
        JButton bVer = new JButton("Adicionar");
        bVer.setBounds(150, 300, 120, 25);
        bVer.setFont(new Font("FreeSerif", Font.PLAIN, 20));
        bVer.setForeground(new Color(0,0,0));
        bVer.setBackground(new Color(255,255,255));
        this.add(bVer);
        
        bVer.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		String nome = tNome.getText();
        		float saldo = Float.parseFloat(tSaldo.getText());
        		if(UsuariosDAO.adicionarSaldo(nome, saldo)) {
        			JOptionPane.showInternalMessageDialog(null, "Saldo Adicionado!","Saldo Adicionado!", JOptionPane.INFORMATION_MESSAGE);
        		}else {
        			JOptionPane.showInternalMessageDialog(null, "Erro!","Erro!", JOptionPane.INFORMATION_MESSAGE);
        		}
        	}
        });
        
	}
}