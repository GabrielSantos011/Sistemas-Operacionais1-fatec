package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class FifaController implements IFifaController {

	@Override
	public Stack<String> empilhaBrasileiros(String caminho, String nome) throws IOException {
		File arq = new File(caminho, nome);
		
		Stack<String> pilha = new Stack<String>();
		
		if (arq.exists() && arq.isFile()) {
			
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			linha = buffer.readLine();
			while (linha!=null) {
				
				String split[]= linha.split(",");
				
				if (split[5].equals("Brazil")) {
					pilha.push(linha);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inexistente");
		}

		return pilha;
	}

	@Override
	public void desmpilhaBonsBrasileiros(Stack<String> pilha) throws IOException {

		
		
		int tamanhoPilha = pilha.size();
		
		for (int i = 0 ; i < tamanhoPilha ; i++){
			
			String [] split = pilha.pop().split(",");
			if (split[7]==null) {
				break;
			}
			int overall = Integer.parseInt(split[7]);
			
			if (overall>=80) {
				System.out.println("nome: "+split[2]+"\noverall: "+split[7]+"\n");
			}
		
		}
		System.out.println("\n\n");
		
	}

	@Override
	public List<String> listaRevelacoes(String caminho, String nome) throws IOException {
		File arq = new File(caminho, nome);
		
		List<String> lista = new LinkedList<String>();
		
		if (arq.exists() && arq.isFile()) {
			
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			linha = buffer.readLine();
			while (linha!=null) {
				
				String split[]= linha.split(",");
				int age = Integer.parseInt(split[3]);
				if (age<=20) {
					lista.add(linha);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inexistente");
		}

		return lista;
	}

	@Override
	public void buscaListaBonsJovens(List<String> lista) throws IOException {

		int tamanhoLista = lista.size();

		for (int i = tamanhoLista - 1; i >= 0; i--){
			String dado = lista.get(i);
			String split[] = dado.split(",");
			
			int overall = Integer.parseInt(split[7]);
			
			if (overall>=80) {
				System.out.println("nome: "+split[2]+"\nidade: "+split[3]+"\noverall: "+split[7]+"\n");
			}
		}
		System.out.println("\n\n");
		
	}

}
