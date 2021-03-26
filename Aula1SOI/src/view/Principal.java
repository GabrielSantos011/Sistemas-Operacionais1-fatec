package view;
//ctr+f11 - roda a aplicação
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) { //main ctr+space - para aparecer
		// TODO Auto-generated method stub
/*
 * ctr+ s - salva essa classe
 * ctr + shift+ s salva todas
*/
		OperacoesController op = new OperacoesController();
		
		String frase = "olá mundo, estou aprendendo a usar o eclipse";
		
		op.concatenaString();
		op.concatenaBuffer();
		
		op.divideFrase(frase);
	}

}
