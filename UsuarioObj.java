package classes;

public class UsuarioObj {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		Usuario usuario2= new Usuario();
		
		 usuario1.setNome("Maria Julia Americo Sutil");
		 usuario1.setPassword("*** **/**");
		 usuario1.setPermissao("permissao negada");
		 usuario1.setUsuario("ADM");
		 usuario1.setId(896754);
		

		System.out.println("---------------usuario 1--------------");
		System.out.println(usuario1.getNome());
	    System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		System.out.println(usuario1.getId());
		System.out.println(usuario1.excluir());
	    
		 usuario2.setNome("Julia Maria Sutil  Americo");
		 usuario2.setPassword("**/***");
		 usuario2.setPermissao("permissao permitida");
		 usuario2.setUsuario("Visitante ");
		 usuario2.setId(970545);
		
	   
		 System.out.println("---------------usuario 2--------------");
			System.out.println(usuario2.getNome());
		    System.out.println(usuario2.getPassword());
			System.out.println(usuario2.getPermissao());
			System.out.println(usuario2.getUsuario());
			System.out.println(usuario2.getId());
			System.out.println(usuario2.permitido());
		    
			
	}

}
