package pacote;

public class Carrinho {
	private Itens[] itensCarrinho;
	private double valorCarrinho;
	
	public Carrinho(Itens[] i, double total) {
		itensCarrinho = i;
		valorCarrinho = total;
	}

	public Itens[] getItensCarrinho() {
		return itensCarrinho;
	}

	public void setItensCarrinho(Itens[] itensCarrinho) {
		this.itensCarrinho = itensCarrinho;
	}

	public double getValorCarrinho() {
		return valorCarrinho;
	}

	public void setValorCarrinho(double valorCarrinho) {
		this.valorCarrinho = valorCarrinho;
	}

}
