package controller;

public class ThreadSoma extends Thread {
	
	private int vetor[]=new int[5];
	private int linha;
	
	public ThreadSoma(int vetor[], int linha) {
		
		this.vetor=vetor;
		this.linha = linha;
		
	}
	
	public void run() {
		soma();
	}
	
	public void soma() {
		int soma=0;
		for(int i=0;i<5;i++) {
			soma+=vetor[i];
		}
		
		System.out.println("A soma da linha "+linha+" é "+soma);
	}
		
		
}
