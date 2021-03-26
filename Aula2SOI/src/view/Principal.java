package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessosController ProcController = new ProcessosController();
		
//		System.out.println(ProcController.os());
		
//		String process = "C:\\Windows\\wrie.exe";
		
		
//		String process = "C:\\Windows\\regedit.exe";
//		ProcController.callProcess(process);

		
//		String process = "tasklist /fo table";
//		ProcController.readProcess(process);
		
		String param = "Teams.exe";// 
		ProcController.killProcess(param);
	}
	
}
