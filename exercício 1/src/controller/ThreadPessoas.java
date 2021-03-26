package controller;

import java.util.concurrent.Semaphore;

public class ThreadPessoas extends Thread {
	
	private int idPessoa;
	private static int posChegada;
	private Semaphore semaforo;
	
	
	public ThreadPessoas(int idPessoa, Semaphore semaforo) {
		this.idPessoa=idPessoa;
		this.semaforo=semaforo;
	}
	
		@Override
		public void run() {
			andaCorredor();
//			---Seção crítica---
			try {
				semaforo.acquire();
				atravessaPorta();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				semaforo.release();
			}
			
		}
		
		private void andaCorredor() {
			int distanciaPercorrida = 0;
			int anda;
			int corredor = 200;
			int tempo = 1000;
			
			while(distanciaPercorrida<corredor) {
				anda = (int) ((Math.random()*7)+4);
				distanciaPercorrida+=anda;
				
				try {
					sleep(tempo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("#"+idPessoa+" já andou "+ distanciaPercorrida +" metros");
			}
			posChegada++;
			System.out.println("#"+idPessoa+" chegou em "+ posChegada);
			
		}
		

		private void atravessaPorta() {
			System.out.println("#"+idPessoa+" está atravessando a porta");
			int tempo = (int) ((Math.random()*3000)+1000);
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("#"+idPessoa+" atravessou a porta");
		}

	
}
