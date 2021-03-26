package view;

import java.io.IOException;

import controller.ArquivosController;

public class Principal {

	public static void main(String[] args) {
		ArquivosController arqCont = new ArquivosController();
		
		String dirWin = "C:\\Windows";
		String path ="C:\\Users\\gabri\\Desktop\\teste";
		String nome = "teste";
		
		try {
//			arqCont.readDir(dirWin);
//			arqCont.createFile(path, nome);
			arqCont.readFile(path, nome);
//			arqCont.openFile(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
