package controller;

public class ThreadSoma extends Thread {
	
	int[] vetor;
	int indice;
	
	public ThreadSoma(int[] vetor, int indice) {
		this.vetor = vetor;
		this.indice = indice;
	}
	
	@Override
	public void run() {
		somar();
	}
	
	public void somar() {
		int somatoria = 0;
		for(int valor: vetor){
			somatoria += valor;
		}
		System.out.println("Indice ===> " + indice + ", somatoria ===> " + somatoria);
	}

}