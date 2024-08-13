package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static void inicializarBase() {
		usuarios.add(new Usuario("jose", "jose123"));
		usuarios.add(new Usuario("maria", "maria123"));
	}
	
	public static boolean isUsuario(Usuario usuario) {
		for (Usuario usuarioCurrent : usuarios) {
			if (usuarioCurrent.getLogin().equalsIgnoreCase(usuario.getLogin()) 
			    && usuarioCurrent.getSenha().equals(usuario.getSenha()))
				return true;
		}
		return false;
	}
}
