package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.LoginView;
import view.Mensagem;

public class LoginController {
	LoginView loginView;

	ButtonHandler buttonHandler;
	
	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		buttonHandler = new ButtonHandler();
		control();
	}
	
	private void control() {
		loginView.getBotaoEntrar().addActionListener(buttonHandler);
		loginView.getBotaoSair().addActionListener(buttonHandler);
	}
	
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==loginView.getBotaoEntrar()) {
				if (BaseDados.isUsuario(new Usuario(loginView.getLoginField().getText(), loginView.getSenhaField().getText())))
						Mensagem.exibirMensagem(Mensagem.SUCESS_LOGIN + loginView.getLoginField().getText());
				else
					Mensagem.exibirMensagem(Mensagem.ERROR_LOGIN);
					
			}
			
			if (e.getSource()==loginView.getBotaoSair()) {
				int response = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
				if (response == 0) {
					System.exit(0);
				}
			}
			
		}
		
	}
	
	
}
