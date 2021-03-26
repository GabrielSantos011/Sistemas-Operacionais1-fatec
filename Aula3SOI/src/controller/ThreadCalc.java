package controller;

public class ThreadCalc extends Thread {
	
	private int a, b, op;
	
	public ThreadCalc(int a, int b, int op) {
		this.a=a;
		this.b=b;
		this.op=op;
	}
	
	@Override
	public void run() {
		super.run();
		calc();
	}

	private void calc() {
		
		int res=0;
		String operacao="";
		
		int tempo=1000;//mili segundos
		try {
			sleep(op * tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch (op) {
		case 0://0*1000
			operacao = "+";
			res=a+b;
			
			break;
		case 1://1*1000
			operacao = "-";
			res=a-b;
			
			break;
		case 2://2*1000
			operacao = "x";
			res=a*b;
			
			break;
		case 3://3*1000
			operacao = "/";
			res=a/b;
			
			break;
		}
		
		System.out.println("TID # "+ getId() + " ==> "+a+" "+operacao+" "+b+" = "+res);
	}
}
