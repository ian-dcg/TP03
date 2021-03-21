package pacote;

public class Carrinho extends Mercado{
	private boolean check;
	
	public void setItens(Itens itens) {
		this.itens = itens;
	}
	
	public int getNumItens() {
		return numItens;
	}
	
	public void setNumItens(int numItens) {
		this.numItens = numItens;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	public String toString() {
		return "Valor total do Carrinho: " + valorTotal;
	}

}
