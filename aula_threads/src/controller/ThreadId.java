package controller;

//extends Thread
//parametros por construtor
//metodo run()
public class ThreadId extends Thread {
	
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//so executa o que esta aqui dentro
		System.out.println(idThread);
	}

}
