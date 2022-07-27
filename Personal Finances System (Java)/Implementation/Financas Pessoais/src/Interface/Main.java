package Interface;

import javax.swing.*;
import Connector.*;
import Interface.*;
import trab.*;


public class Main {
	public static void main(String[] args ) {
		
		BancoDeDados bd = new BancoDeDados();
		LoginView login = new LoginView();
		
		if(bd.conecta()) {
			login.setVisible(true);
		}else {
			System.out.println("nao deu certo");
		}
	}
	
}
