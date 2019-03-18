package joshua.converter.repository;

import java.util.ArrayList;
import java.util.List;

import joshua.converter.domain.Usuario;

public class UsuarioRepository {

	public Usuario getUsuario() {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("usuario@gmail.com");
		usuario.setIdade(25);
		usuario.setNome("Usuário 1");
		
		return usuario;
	}
	
	public List<Usuario> getUsuarios(){
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario();
		usuario.setEmail("usuario@gmail.com");
		usuario.setIdade(25);
		usuario.setNome("Usuário 1");
		
		Usuario usuario2 = new Usuario();
		usuario2.setEmail("usuario2@gmail.com");
		usuario2.setIdade(38);
		usuario2.setNome("Usuário 2");
		
		Usuario usuario3 = new Usuario();
		usuario3.setEmail("usuario3@gmail.com");
		usuario3.setIdade(16);
		usuario3.setNome("Usuário 3");
		
		Usuario usuario4 = new Usuario();
		usuario4.setEmail("usuario4@gmail.com");
		usuario4.setIdade(55);
		usuario4.setNome("Usuário 4");
		
		return lista;
	}
	
}
