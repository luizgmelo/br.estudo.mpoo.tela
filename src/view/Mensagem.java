package view;

import javax.swing.JOptionPane;

public class Mensagem extends JOptionPane {
	public static final String SUCESS_LOGIN = "Bem vindo: ";
	public static final String ERROR_LOGIN = "Erro ao logar!";
	
	public static void exibirMensagem(String message) {
		showMessageDialog(null, message);
	}
}
