package pacote;

public class Lista  extends Mercado {
	private String nomeLista;
	private Itens [] itensRegistrados = new Itens[50];
	
	
	//Sobrecarga
	public Lista (int num, double tot) {
		nomeLista = nome;
		numItens = num;
		valorTotal = tot;
	}
	
	public Lista (String nome, int num, double tot) {
		nomeLista = nome;
		numItens = num;
		valorTotal = tot;
	}
	
	public String toString() {
		return "Nome da Lista: " + nomeLista + ", total de itens na lista: " + numItens + ", Valor total da lista: " + valorTotal;
	}
	
	public Itens[] getItens() {
		return this.itensRegistrados;
	}
	
	public void setArrayItensRegistrados(Itens[] a) {
		this.itensRegistrados = a;
	}
	
	public String getNomeLista() {
		return nomeLista;
	}
	
	public void setNomeLista(String nomeLista) {
		this.nomeLista = nomeLista;
	}
	
	public int getNumItens() {
		return numItens;
	}
	
	public void setNumItens(int numItens) {
		this.numItens = numItens;
	}
	
	public Unidade getQuantidade(int i) {
		return itensRegistrados[i].getQuantidade();
	}
	
	public void setQuantidade(Itens qtd, int i) {
		this.itensRegistrados[i] = qtd;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String consultarItensRegistrados() {
		String registro = "Lista de Itens Registrados; \n";
		for (int i = 0; i < numItens; i++) {
			System.out.println(i);
			registro = registro + "\n" + itensRegistrados[i].getItens().toString();
		}
		return registro;
	}

}
