package pacote;

public class Itens {
	private String nomeProduto;
	private double preco;
	private boolean checkCarrinho;
	private boolean checkRiscado;
	private Unidade quantidade;
	private Setor setor;

	//Sobrecarga
	public Itens(String p, Unidade qtd, double val, Setor s, boolean check, boolean cRiscado) {
		nomeProduto = p;
		quantidade = qtd;
		preco = val;
		setor = s;
		checkCarrinho = check ;
		checkRiscado = cRiscado;
	}
	
	public Itens(String p, Unidade qtd, double val, Setor s, boolean check) {
		nomeProduto = p;
		quantidade = qtd;
		preco = val;
		setor = s;
		checkCarrinho = check ;
	}
	
	public String toString() {
		return "Nome do Item: " + nomeProduto + ", Setor: " + setor + quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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
	
	public Unidade getUnidade() {
		return quantidade;
	}

	public void setUnidade(Unidade quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isCheckCarrinho() {
		return checkCarrinho;
	}

	public void setCheckCarrinho(boolean checkCarrinho) {
		this.checkCarrinho = checkCarrinho;
	}
	
	public boolean isCheckRiscado() {
		return checkRiscado;
	}

	public void setCheckRiscado(boolean cRiscado) {
		this.checkRiscado = cRiscado;
	}
}
