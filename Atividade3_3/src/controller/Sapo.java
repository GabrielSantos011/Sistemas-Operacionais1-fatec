package controller;

public class Sapo extends Thread {
	int sapoId;
	int salto;
	int total;
	static int posicao=0;
	
	public Sapo(int sapoId) {
		this.sapoId=sapoId;
		this.salto=0;
		this.total=100;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		corrida();
		
	}
	
	public void corrida() {
		
		while(salto< total) {
			int saltoParcial= (int)(Math.random()*10);
			salto+=saltoParcial;
			System.out.println("O sapo " + sapoId + " deu um salto de " + saltoParcial);
		}
		System.out.println("O sapo " + sapoId + " chegou em " + (posicao+1));
		posicao++;
	}
	
}
