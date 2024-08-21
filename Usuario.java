package classes;

public class Usuario {
	String nome; //declarando e armazenando nossas variaveis Strings
	String password;
	String permissao;
	String usuario;
	int id; //declarando e armazenando nossas variaveis Int 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;

	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String excluir() {
		return "cadastro excluido";
	}
	public String permitido() {
		return "cadastro salvo";
	}
}
	