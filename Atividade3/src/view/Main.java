package view;

import javax.swing.JOptionPane;

import controller.ThreadVetor;

public class Main {
	public static void main(String [] args) {
		int vet[]= new int[1000];
		int num = 0;
		int opc=0;

		
		for(int i=0;i<1000;i++) {
			vet[i]=(int)(Math.random()*101)+1;
		}
		
		while (opc!=2) {
			opc=Integer.parseInt(JOptionPane.showInputDialog("digite\n"+ 
					"1- para repetir\n"+ 
					"2 - fim"));
			
			switch(opc){
			case 1:
				num = Integer.parseInt(JOptionPane.showInputDialog("digite um número\n"+ 
						"ímpar para o tempo do foreach\n"+ 
						"par para o tempo do for"));
			
				Thread tVetor = new ThreadVetor(vet, num);
				tVetor.start();
				
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "opção inválida");
			}//end switch
			
		}// end while
		
		
		
	
	
	}

}
