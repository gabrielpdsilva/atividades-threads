package controller;

public class ThreadVetor extends Thread {
	
	private int numero;
	private int[] vetor;
	
	public ThreadVetor(int numero, int[] vetor) {
		this.numero = numero;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		percorrerVetor();
	}
	
	public void percorrerVetor() {
		
		double tempoInicial;
		double tempoFinal;
		double tempoTotal;
		
		if(numero % 2 == 0){
			
			tempoInicial = System.nanoTime();
			
			for(int i = 0; i < vetor.length; i++){
				
			}
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			tempoTotal /= Math.pow(10, 9);
			System.out.println("for convencional -> " + tempoTotal + "s.");
			
		} else {
			tempoInicial = System.nanoTime();
			
			for(int valor: vetor){
			
			}
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			tempoTotal /= Math.pow(10, 9);
			System.out.println("foreach -> " + tempoTotal + "s.");
		}
		
	}
}