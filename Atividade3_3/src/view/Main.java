package view;

import controller.Sapo;

public class Main {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			Thread sapo = new Sapo(i);
			sapo.start();
		}
	}

}
