import javax.swing.JOptionPane;

public class Main {

	public static void main( String[] args) {
		
		MetodosLista a = new MetodosLista();
		
		a.adicionaFinal("nome 1", 11111);
		a.adicionaFinal("nome 2", 22222);
		a.adicionaFinal("nome 3", 33333);
		a.adicionaFinal("nome 4", 44444);
		String lista = a.percorre();
		JOptionPane.showMessageDialog(null, lista);
		a.removeFinal();
		lista = a.percorre();
		JOptionPane.showMessageDialog(null, lista);
		a.adicionaInicio("nome 0", 000000);
		lista = a.percorre();
		JOptionPane.showMessageDialog(null, lista);
		a.removeInicio();
		lista = a.percorre();
		JOptionPane.showMessageDialog(null, lista);
		
	}

}
