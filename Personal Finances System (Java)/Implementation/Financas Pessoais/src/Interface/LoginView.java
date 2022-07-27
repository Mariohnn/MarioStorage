package Interface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Connector.*;
import trab.*;

public class LoginView extends JFrame{
    public LoginView(){
     
    	
    	//tela de login inicial
    	
    	super("Finanças Pessoais");
        this.setSize(600,600);
        this.setLayout(null);
        this.setBounds(700,200,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(new Color(60,60,120));
        
        //Labels informativos
        
        JLabel lTitulo = new JLabel("Finanças Pessoais");
        lTitulo.setBounds(100, 30, 400, 255);
        lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lTitulo.setFont(new Font("FreeSerif", Font.PLAIN, 35));
        lTitulo.setForeground(new Color(255,255,255));
        this.add(lTitulo);

        JLabel lDesc = new JLabel("Bem-vindo");
        lDesc.setBounds(100, 0, 400, 255);
        lDesc.setHorizontalAlignment(SwingConstants.CENTER);
        lDesc.setFont(new Font("FreeSerif", Font.ITALIC, 25));
        lDesc.setForeground(new Color(255,255,255));
        this.add(lDesc);

        JLabel lLogin = new JLabel("Usuário:");
        lLogin.setBounds(150, 215, 300, 25);
        lLogin.setHorizontalAlignment(SwingConstants.LEFT);
        lLogin.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lLogin.setForeground(new Color(255,255,255));
        this.add(lLogin);
        
        JLabel lSenha = new JLabel("Senha:");
        lSenha.setBounds(150, 270, 300, 25);
        lSenha.setHorizontalAlignment(SwingConstants.LEFT);
        lSenha.setFont(new Font("FreeSerif", Font.ITALIC, 20));
        lSenha.setForeground(new Color(255,255,255));
        this.add(lSenha);
        
        
        //labels que esperam inputs dos usuarios
        
        
        JTextField tLogin = new JTextField("");
        tLogin.setBounds(150, 240, 300, 25);
        tLogin.setHorizontalAlignment(SwingConstants.LEFT);
        tLogin.setFont(new Font("Calibri", Font.ITALIC, 20));
        this.add(tLogin);

        
        JTextField tSenha = new JTextField("");
        tSenha.setBounds(150, 300, 300, 25);
        tSenha.setHorizontalAlignment(SwingConstants.LEFT);
        tSenha.setFont(new Font("Calibri", Font.ITALIC, 15));
        this.add(tSenha);

        // botões
        
        JButton bLogin = new JButton("Login");
        bLogin.setBounds(260, 350, 80, 20);
        bLogin.setFont(new Font("FreeSerif", Font.BOLD, 15));
        bLogin.setBackground(new Color(255,255,255));
        this.add(bLogin);
        
        JButton bCadastro = new JButton("Cadastrar");
        bCadastro.setBounds(250, 380, 100, 23);
        bCadastro.setFont(new Font("FreeSerif", Font.BOLD, 15));
        bCadastro.setBackground(new Color(255,255,255));
        this.add(bCadastro);
        
        // funcionalidades
        
        
        bLogin.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		
        		String login = tLogin.getText();
        		String senha = tSenha.getText();  

                try {
                	if(UsuariosDAO.checkLogin(login, senha)){
                		Menu menu = new Menu();
                		menu.setVisible(true);
                		dispose();
                	}else{
                		JOptionPane.showInternalMessageDialog(null, "Senha Incorreta ou Usuário Inexistente.","Senha Incorreta ou Usuário Inexistente.", JOptionPane.INFORMATION_MESSAGE);
                	}
                }catch(Exception E) {return;}
        	}
        });
        
        
        
        bCadastro.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        	
        		String login = tLogin.getText();
        		String senha = tSenha.getText();        		
                try {
                	if(UsuariosDAO.register(login, senha)){
                		JOptionPane.showInternalMessageDialog(null, "Usuário criado com Sucesso!","Usuário criado com Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                	}else{
                		JOptionPane.showInternalMessageDialog(null, "Usuário já existe.","Usuário já existe", JOptionPane.INFORMATION_MESSAGE);
                	}
                }catch(Exception E) {return;}
        	}
        });
        

        JLabel lSenhaErrada = new JLabel("Senha Incorreta.");
        lSenhaErrada.setBounds(75, 330, 100, 20);
        lSenhaErrada.setFont(new Font("Dialog", Font.ITALIC, 15));
        lSenhaErrada.setVisible(false);
        this.add(lSenhaErrada);

       
    }

}