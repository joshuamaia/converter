package joshua.converter;

import joshua.converter.domain.Usuario;
import joshua.converter.repository.UsuarioRepository;
import joshua.converter.util.Util;

public class Main {

	public static void main(String[] args) {
		
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		
		Usuario usuario = usuarioRepository.getUsuario();
		
		System.out.println("Converte Classe em XML");
		String xmlUsuario = Util.converterClasseEmXml(usuario);
		System.out.println(xmlUsuario);
		System.out.println();
		
		System.out.println("Converte XML em Classe");
		Usuario usuarioConvertidoXml = (Usuario) Util.converterXmlEmClasse(xmlUsuario);
		System.out.println(usuarioConvertidoXml);
		System.out.println();
		
		System.out.println("Converte Classe em Json");
		String jsonUsuario = Util.converterClasseEmJson(usuario);
		System.out.println(jsonUsuario);
		System.out.println();
		
		System.out.println("Converte Json em Classe");
		Usuario usuarioConvertidoJson = (Usuario) Util.converterJsonEmClasse(jsonUsuario, Usuario.class);
		System.out.println(usuarioConvertidoJson);
		System.out.println();
		
		System.out.println("Converte Json em XML");
		String usuarioJsonEmXml = Util.converterJsonEmXml(jsonUsuario, Usuario.class);
		System.out.println(usuarioJsonEmXml);
		System.out.println();
		
		System.out.println("Converte XML em JSON");
		String usuarioXmlEmJson = Util.converterXmlEmJson(xmlUsuario);
		System.out.println(usuarioXmlEmJson);
		System.out.println();
	}
	
}
