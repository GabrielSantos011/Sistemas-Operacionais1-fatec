package controller;

import javax.swing.JOptionPane;

public class ThreadVetor extends Thread {
	public int []vet = new int[100];
	public int num;
	
	public ThreadVetor(int vet[], int num) {
		this.vet=vet;
		this.num=num;
	}
	
	public void run() {
		metodo(vet, num);
	}
	
	
	public double metodo(int vet[], int num) {
		double tempoTotal;
		double tempoInicial;
		double tempoFinal;
		
		if(num%2==0) {
			tempoInicial = System.nanoTime();
			for(int i=0;i<vet.length;i++) {
				
			}
			tempoFinal=System.nanoTime();
			tempoTotal= tempoFinal-tempoInicial;
			tempoTotal/=Math.pow(10, 9);
			JOptionPane.showMessageDialog(null, "O tempo no for foi de "+tempoTotal+"s");
		}else {
			tempoInicial = System.nanoTime();
			for(double aux: vet) {
				
			}
			tempoFinal=System.nanoTime();
			tempoTotal=tempoFinal-tempoInicial;
			tempoTotal/=Math.pow(10, 9);
			JOptionPane.showMessageDialog(null, "O tempo no for foi de "+tempoTotal+"s");
		}
		
		return tempoTotal;
	}
	
}
