package controller;

import java.util.Random;

public class OperacaoController {
	
	public OperacaoController() {
		super();
	}
	
	public void vt100() {
		Random r = new Random();
		
		int a [] = new int [100];
		
		for(int i = 0;i<100;i++) {
			a[i]=r.nextInt(11);
		}
		
		double soma = 0;
		double tempoInicial = System.nanoTime();
		
		for(int i = 0;i<100;i++) {
			soma+= a[i];
		}
		
		double tempoFinal=System.nanoTime();
		
		double tempo =tempoFinal-tempoInicial;
		
		tempo/=Math.pow(10, 9);
		
		System.out.println("vt[100] == " + tempo + "s.");
		
	}
	
	public void vt1000() {
		Random r = new Random();
		
		int a [] = new int [1000];
		
		for(int i = 0;i<100;i++) {
			a[i]=r.nextInt(11);
		}
		
		double soma = 0;
		double tempoInicial = System.nanoTime();
		
		for(int i = 0;i<1000;i++) {
			soma+= a[i];
		}
		
		double tempoFinal=System.nanoTime();
		
		double tempo =tempoFinal-tempoInicial;
		
		tempo/=Math.pow(10, 9);
		
		System.out.println("vt[1000] == " + tempo + "s.");
		
	}
	
	public void vt10000() {
		Random r = new Random();
		
		int a [] = new int [10000];
		
		for(int i = 0;i<10000;i++) {
			a[i]=r.nextInt(11);
		}
		
		double soma =0;
		double tempoInicial = System.nanoTime();
		
		for(int i = 0;i<10000;i++) {
			soma+= a[i];
		}
		
		double tempoFinal=System.nanoTime();
		
		double tempo =tempoFinal-tempoInicial;
		
		tempo/=Math.pow(10, 9);
		
		System.out.println("vt[10000] == " + tempo + "s.");
		
	}

}
