package controller;

public class OperacoesController {
	
	public OperacoesController() {
		//ctr+d apaga a linha toda
//		ctr+/ - comenta a linha toda
//		f11 - depura e f6 para ir no linha a linha f8 finaliza
		super();
	}
		//concatena em var. str.
		
		public void concatenaString(){
			
			String cadeia = "";
			double tempoInicial = System.nanoTime(); //ctr+1 criar variável
			
			for(int i =0; i<32768;i++) {
				cadeia = cadeia+"a";
			}
			
			double tempoFinal= System.nanoTime();
			
			double tempoTotal = tempoFinal-tempoInicial;
			//tempoTotal está em nano segundos =10^-9s
			tempoTotal /= Math.pow(10, 9);
			System.out.println("tempo str == "+tempoTotal+"s."); // sysout+ctr+space
			
		}
		
		
		//concatena em buffer str.
		
		public void concatenaBuffer() {
			
			StringBuffer buffer = new StringBuffer();
			
			double tempoInicial = System.nanoTime(); //ctr+1 criar variável
			
			for(int i =0; i<32768;i++) {
				
				buffer.append("a");
				
			}
			
			double tempoFinal= System.nanoTime();
			
			double tempoTotal = tempoFinal-tempoInicial;
			//tempoTotal está em nano segundos =10^-9s
			tempoTotal /= Math.pow(10, 9);
			System.out.println("tempo buffer == "+tempoTotal+"s.");			
			
		
		}
		
		// receber uma str - divide em palavras e printa palavras
		
		public void divideFrase(String frase) {
			String vetorPalavras [] = frase.split(" ");//IPC
			/*int tamanho = vetorPalavras.length
			 * for(int i=0;i<tamanho;i++)
			 */
			for(String palavra : vetorPalavras) {
				System.out.println(palavra);
			}
		}
}
