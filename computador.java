package classes;

public class computador {
	String cor; 
	String marca;
	String preço;
	String modelo;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;

	}
	public String getPreco() {
		return preço;
	}
	public void setPreco(String preço) {
		this.preço = preço;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public String ligar() {
		return "ligado";
	}
	public String desligar() {
		return "desligado";
	}
}
	

