package pacote;

public class Lista {
	private String nomeLista;
	private Itens[] itens = new Itens[50];
	
	public Lista(String l, Itens[] i) {
		nomeLista = l;
		itens = i;
	}
	
	public String getNomeLista() {
		return nomeLista;
	}


	public void setNomeLista(String nomeLista) {
		this.nomeLista = nomeLista;
	}


	public Itens[] getItens() {
		return itens;
	}


	public void setItens(Itens[] itens) {
		this.itens = itens;
	}

}
