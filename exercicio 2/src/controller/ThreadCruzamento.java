package controller;

import java.util.concurrent.Semaphore;

public class ThreadCruzamento extends Thread {
	
	private int idCarro;
	private Semaphore semaforo;
	
	public ThreadCruzamento(int idCarro, Semaphore semaforo) {
		this.idCarro=idCarro;
		this.semaforo=semaforo;
	}
	
	@Override
	public void run() {
		anda();
		try {
			semaforo.acquire();
			cruzamento();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}


	private void anda() {
		// TODO Auto-generated method stub
		int deslocamento = 100;
		int deslocamentoTotal = 1000;
		int deslocamentoParcial = 0;
		int tempo = 1000;
		
		while(deslocamentoParcial < deslocamentoTotal) {
			deslocamentoParcial+=deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("#"+idCarro+" já andou "+deslocamentoParcial);
		}
		System.out.println("#"+idCarro+" chegou no cruzamento");
	}
	
	

	private void cruzamento() {
		// TODO Auto-generated method stub
		System.out.println("#"+idCarro+" está cruzando");
		int tempo = (int) ((Math.random()*11)+1);
		System.out.println("#"+idCarro+" ja terminou o cruzamento");
	}
	
}
