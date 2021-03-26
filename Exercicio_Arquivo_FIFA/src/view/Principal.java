package view;

import java.io.IOException;

import controller.FifaController;

public class Principal {

	public static void main(String[] args) {
		
		FifaController fifaController = new FifaController();
		
		try {
			System.out.println("Brasileiros acima de 80\n\n");
			fifaController.desmpilhaBonsBrasileiros(fifaController.empilhaBrasileiros
					("C:\\temp\\","data.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			System.out.println("Jovens acima de 80\n\n");
			fifaController.buscaListaBonsJovens(fifaController.listaRevelacoes
					("C:\\Users\\gabri\\Desktop\\home\\leandro\\Downloads\\ExercicioSistemaArquivos", "data.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		
	}

}
