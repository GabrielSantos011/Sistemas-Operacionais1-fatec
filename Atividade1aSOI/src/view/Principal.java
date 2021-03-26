package view;

import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		OperacaoController op = new OperacaoController();
		
		op.vt100();
		op.vt1000();
		op.vt10000();
	}

}
