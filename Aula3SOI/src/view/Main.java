package view;


import controller.*;

public class Main {

	public static void main(String[] args) {
		
		for(int idThread=0; idThread<5; idThread++) {
//			ThreadId threadId = new ThreadId(idThread);
			Thread threadId = new ThreadId(idThread);
			threadId.start();
		}//end for
		
				
		int a=10,b=2;
		
		for(int op=0; op<4; op++) {
			Thread threadCalc = new ThreadCalc(a,b,op);
			threadCalc.start();
		}
		
	}
}
