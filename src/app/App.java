package app;

import controller.LoginController;
import model.BaseDados;
import view.LoginView;

public class App {
	public static void main(String[] args) {
		BaseDados.inicializarBase();
		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginView);
	}
}
