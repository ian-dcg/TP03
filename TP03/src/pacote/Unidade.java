package pacote;

public class Unidade {
	private String tipoUnidade;
	private int quantidade;
	
	public Unidade(String u, int qtd) {
		tipoUnidade = u;
		quantidade = qtd;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
