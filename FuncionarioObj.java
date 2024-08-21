package classes;

public class FuncionarioObj {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		Fornecedor fornecedor2= new Fornecedor();
		
		fornecedor1.setNomefantasia("Maria Julia Americo ");
		fornecedor1.setRazaosocial("*** **/**");
		fornecedor1.setCnpj("permissao negada");
		fornecedor1.setEndereco("rua guarei Vila arruda 291");
		fornecedor1.setId(896754);
		fornecedor1.setFone("159989863");
		fornecedor1.setEmail("mariajuliaamerico876@gmail.com");
		fornecedor1.setInscricaoEstadual("6777");
		

		System.out.println("---------------froneedor 1--------------");
		System.out.println(fornecedor1.getNomefantasia());
	    System.out.println(fornecedor1.getRazaosocial());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.getFone());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getInscricaoEstadual());
		
		fornecedor2.setNomefantasia("Maria Julia Americo ");
		fornecedor2.setRazaosocial("*** **/**");
		fornecedor2.setCnpj("permissao negada");
		fornecedor2.setEndereco("corina caçapava barth 234");
		fornecedor2.setId(896754);
		fornecedor2.setFone("551588885");
		fornecedor2.setEmail("americo@gmail.com");
		fornecedor2.setInscricaoEstadual("9987");
		
	   
		 System.out.println("---------------froneedor 2--------------");
			System.out.println(fornecedor2.getNomefantasia());
		    System.out.println(fornecedor2.getRazaosocial());
			System.out.println(fornecedor2.getCnpj());
			System.out.println(fornecedor2.getEndereco());
			System.out.println(fornecedor2.getId());
			System.out.println(fornecedor2.getFone());
			System.out.println(fornecedor2.getEmail());
			System.out.println(fornecedor2.getInscricaoEstadual());
			
	}

}
