package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] vetor = new int[1000];
		
		for(int i = 0; i < 1000; i++)
			vetor[i] = random.nextInt(100 - 1 + 1) + 1;
		
		
		Thread tv = new ThreadVetor(1, vetor);
		tv.start();
		
		Thread tv2 = new ThreadVetor(2, vetor);
		tv2.start();
	}

}