package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//ctr + shift + o --> corrige imports

public class ProcessosController {
	
	public ProcessosController() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String os() { // retorna o SO que está em execução
		String os = System.getProperty("os.name");// qual sistema
		String arch = System.getProperty("os.arch");// arquitetura
		String version = System.getProperty("os.version");// versão
		return os + " - v. " + version + " - arch == " + arch;
	}
	
	public void callProcess(String process) {
		
		try {//rodas as linhas que eu quero que receba tratamento
			Runtime.getRuntime().exec(process);
		} catch (Exception e) {// todos os erros que eu quero que receba tratamento
//			e.printStackTrace();//mostra o erro
			String msgErro = e.getMessage();//só mostra o erro e nada do java
//			System.err.println(msgErro);
			
			if(msgErro.contains("740")) {//erro de que precisa ser adm
				// cmd /c caminho
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(process);
				
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void readProcess(String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha!=null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	public void killProcess(String param) {
		String cmdPid = "taskkill /pid";
		String cmdName = "taskkill /im";
		int pid =0;
		StringBuffer buffer = new StringBuffer();
		
		try {//TASKKILL /PID XXXX
			pid = Integer.parseInt(param);
			buffer.append(cmdPid);
			buffer.append(" ");
			buffer.append(pid);
			
		}catch(NumberFormatException e) {
			//TASKKILL /IM nome do processo
			
			buffer.append(cmdName);
			buffer.append(" ");
			buffer.append(param);
		}
		callProcess(buffer.toString());
	}
}













