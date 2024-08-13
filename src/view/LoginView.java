package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	
	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton botaoEntrar, botaoSair;
	
	public LoginView() {
		super("Login");
		setSize(200, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		loginLabel = new JLabel("Login:");
		senhaLabel = new JLabel("Senha:");
		
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		
		botaoEntrar = new JButton("Entrar");
		botaoSair = new JButton("Sair");
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(botaoEntrar);
		add(botaoSair);
		
		setVisible(true);
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getBotaoEntrar() {
		return botaoEntrar;
	}

	public JButton getBotaoSair() {
		return botaoSair;
	}
	
	
}


