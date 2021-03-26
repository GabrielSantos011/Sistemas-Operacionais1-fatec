import javax.swing.JOptionPane;

public class MetodosLista {
	
	private Lista primeiro;
	private Lista ultimo;
	private int tamanho =0;
	
	public MetodosLista() {
		primeiro = null;
		ultimo = primeiro;
	}
	
	public void adicionaFinal(String nome, long ra) {
		if(primeiro == null) {
			primeiro = new Lista();
			ultimo = primeiro;
			Lista novo = new Lista();
			novo.setNome(nome);
			novo.setRa(ra);
			novo.setProximo(null);
			ultimo.setProximo(novo);
			ultimo=novo;
		}else {
			Lista novo = new Lista();
			novo.setNome(nome);
			novo.setRa(ra);
			novo.setProximo(null);
			ultimo.setProximo(novo);
			ultimo=novo;
		}//end if
		tamanho++;
	}//end adiciona
	
	
	public void adicionaInicio(String nome, long ra) {	
		if (primeiro == null) {
			MetodosLista a = new MetodosLista();
			a.adicionaFinal(nome,ra);
		} else {
			Lista adiciona = new Lista();
			Lista aux = primeiro.getProximo();
			
			adiciona.setNome(nome);
			adiciona.setRa(ra);
			adiciona.setProximo(aux);
			primeiro.setProximo(adiciona);
			tamanho++;
		} //end if
	} //end adiciona
	
	
	
	public void removeInicio() {
		if(primeiro == null) {
			JOptionPane.showMessageDialog(null, "A lista está vazia, impossível remover");
		}else {
			Lista aux = primeiro.getProximo();
			primeiro.setProximo(aux.getProximo());
			tamanho--;
		}//end if
	}//end remove
	
	
	public void removeFinal() {
		if(primeiro == null) {
			JOptionPane.showMessageDialog(null, "A lista está vazia, impossível remover");
		}else {
			Lista aux = new Lista();
			aux = primeiro;
			
			for(int i = 0; i<tamanho-1; i++) {
				aux = aux.getProximo();
			}//end for
			aux.setProximo(null);
			tamanho--;
		}//end if
	}//end remove
	
	public String percorre() {
		Lista aux = new Lista();
		aux = primeiro.getProximo();
		String mostra="LISTA\n\n\n";
		do {
			
			mostra = mostra +"nome: "+ aux.getNome() +"\n";
			mostra = mostra +"ra: "+ aux.getRa() +"\n";
			mostra = mostra +"\n--------\n";
			
			aux = aux.getProximo();
			
		}while(aux.getProximo()!=null);
		
		mostra = mostra +"nome: "+ aux.getNome() +"\n";
		mostra = mostra +"ra: "+ aux.getRa() +"\n";
		mostra = mostra +"\n--------\n";
		
		
		return mostra;
	}
	
	
	
	
	
}