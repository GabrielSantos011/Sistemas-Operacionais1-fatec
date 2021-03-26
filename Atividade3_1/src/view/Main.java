package view;


import controller.*;

public class Main {

	public static void main(String[] args) {
		
		for(int idThread=0; idThread<5; idThread++) {
//			ThreadId threadId = new ThreadId(idThread);
			Thread threadId = new ThreadId(idThread);
			threadId.start();
		}//end for
		
	}
	
}