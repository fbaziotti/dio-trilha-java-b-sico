public class PessoaConstrutores {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public PessoaConstrutores (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		//this: atributo é da classe diferente do parâmetro
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}