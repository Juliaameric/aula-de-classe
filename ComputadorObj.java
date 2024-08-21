package classes;
;

public class ComputadorObj {

	public static void main(String[] args) {
		computador computador1 = new computador();
		computador computador2= new computador();
		
		computador1.setCor("vinho");
		computador1.setMarca("Apple");
		computador1.setPreco("4.999,00");
		computador1.setModelo("Macbook Air ");
		

		System.out.println("-----------computador 1----------");
		System.out.println(computador1.getCor());
	    System.out.println(computador1.getMarca());
		System.out.println(computador1.getPreco());
		System.out.println(computador1.getModelo());
		System.out.println(computador1.ligar());
	    
			
		computador2.setCor("Azul");
		computador2.setMarca("Dell");
		computador2.setPreco("4.799,00");
		computador2.setModelo("Inspiron 24 All in One");
	   
			System.out.println("-----------computador 2----------");
			System.out.println(computador2.getCor());
			System.out.println(computador2.getMarca());
			System.out.println(computador2.getPreco());
			System.out.println(computador2.getModelo());
			System.out.println(computador2.desligar());
			
	}

}
