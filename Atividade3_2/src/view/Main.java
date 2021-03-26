package view;

import controller.ThreadSoma;

public class Main {

	public static void main(String[] args) {
		
		int matriz[][]=new int[3][5];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=(int)(Math.random()*10)+1;
			}
		}//preencheu a matriz
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matriz[i][j]+ "  ");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<3;i++) {
			Thread soma = new ThreadSoma(matriz[i],i);
			soma.start();
		}

		
	}

}
