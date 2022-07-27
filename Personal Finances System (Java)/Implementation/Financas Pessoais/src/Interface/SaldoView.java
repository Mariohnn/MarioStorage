package Interface;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Interface.*;
import trab.*;
import Connector.*;


public class SaldoView extends JFrame{
	
	//tela que aparece ao interagir com "checar saldo"
	
	public SaldoView(){

        this.setBounds(800,300,400,200);
        this.setLayout(null);
        Container con = this.getContentPane();
        con.setBackground(new Color(60,60,120));
        
        JLabel lNome = new JLabel("Para ver seu saldo, digite seu nome de usuário");
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
        
        JButton bVer = new JButton("Verificar");
        bVer.setBounds(140, 125, 120, 25);
        bVer.setFont(new Font("FreeSerif", Font.PLAIN, 20));
        bVer.setForeground(new Color(0,0,0));
        bVer.setBackground(new Color(255,255,255));
        this.add(bVer);
        
        bVer.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		String nome = tNome.getText();
        		float x = 0;
        		try{
        			x = UsuariosDAO.checarSaldo(nome);
        			JOptionPane.showInternalMessageDialog(null, "Saldo atual: R$" + x,"Saldo atual: R$" + x, JOptionPane.INFORMATION_MESSAGE);
        		}catch(Exception E) {return;}
        		
        	}
        });
        
	}
}
