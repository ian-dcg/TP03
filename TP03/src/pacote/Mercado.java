package pacote;

public abstract class Mercado {
	protected String nome;
	public Mercado(String n) {
		nome = n;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
