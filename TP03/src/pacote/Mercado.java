package pacote;

public abstract class Mercado {
	protected int numItens = 0;
	protected double valorTotal;
	protected Itens itens;
	
	public Mercado(Itens a, int num, double tot) {
		
	}
	
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
	

}
