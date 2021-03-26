public class Lista {
	
	private String nome;
	private long ra;
	private Lista proximo;
	
	public  Lista() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getRa() {
		return ra;
	}

	public void setRa(long ra) {
		this.ra = ra;
	}

	public Lista getProximo() {
		return proximo;
	}

	public void setProximo(Lista proximo) {
		this.proximo = proximo;
	}
	
}
