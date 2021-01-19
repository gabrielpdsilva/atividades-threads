package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import controller.ThreadCampo;

public class CampoController implements ActionListener {
	
	private JTextField tfCampo1;
	private JTextField tfCampo2;
	private JTextField tfCampo3;
	private JButton btnJogar;
	
	public CampoController(JTextField tfCampo1, JTextField tfCampo2, JTextField tfCampo3, JButton btnJogar){
		this.tfCampo1 = tfCampo1;
		this.tfCampo2 = tfCampo2;
		this.tfCampo3 = tfCampo3;
		this.btnJogar = btnJogar;
	}
	
	private void botaoJogar() {
		Thread t1 = new ThreadCampo(tfCampo1, btnJogar);
		Thread t2 = new ThreadCampo(tfCampo2, btnJogar);
		Thread t3 = new ThreadCampo(tfCampo3, btnJogar);
		t1.start();
		t2.start();
		t3.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		botaoJogar();
	}	

}