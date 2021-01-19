package controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ThreadCampo extends Thread {
	
	private JTextField tfCampo;
	private JButton btnJogar;
	
	public ThreadCampo(JTextField tfCampo, JButton btnJogar) {
		this.tfCampo = tfCampo;
		this.btnJogar = btnJogar;
	}
	
	@Override
	public void run() {
		girar();
	}
	
	public void girar() {
		btnJogar.setEnabled(false);
		
		Random random = new Random();
		int valor;
		for(int i = 0; i < 150; i++){
			valor = random.nextInt((7 - 1) + 1) + 1;
			tfCampo.setText(String.valueOf(valor));
			try {
				Thread.sleep(50);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		btnJogar.setEnabled(true);

	}

}