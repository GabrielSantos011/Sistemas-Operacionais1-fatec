package controller;

// extends Thread - para ser um thread (herdar as caracteristicas de thread)
//parametros por construtor
// só executa se estiver no método run()
public class ThreadId extends Thread{
	
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}
	
	public void run() {
		//só executa o que está aqui dentro
		
		System.out.println(idThread);
	}
	
}
