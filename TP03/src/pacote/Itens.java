package pacote;

public class Itens {
	private String nomeProduto;
	private Unidade quantidade;
	private double preco;
	private Setor setor;
	private boolean checkCarrinho;

	public Itens(String p, Unidade qtd, double val, Setor s, boolean check) {
		nomeProduto = p;
		quantidade = qtd;
		preco = val;
		setor = s;
		checkCarrinho = check ;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Unidade getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Unidade quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public boolean isCheckCarrinho() {
		return checkCarrinho;
	}

	public void setCheckCarrinho(boolean checkCarrinho) {
		this.checkCarrinho = checkCarrinho;
	}

}
