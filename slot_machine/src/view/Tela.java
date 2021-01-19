package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CampoController;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField tfCampo1;
	private JTextField tfCampo2;
	private JTextField tfCampo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfCampo1 = new JTextField();
		tfCampo1.setEditable(false);
		tfCampo1.setHorizontalAlignment(SwingConstants.CENTER);
		tfCampo1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		tfCampo1.setBounds(30, 66, 102, 86);
		contentPane.add(tfCampo1);
		tfCampo1.setColumns(10);
		
		tfCampo2 = new JTextField();
		tfCampo2.setEditable(false);
		tfCampo2.setHorizontalAlignment(SwingConstants.CENTER);
		tfCampo2.setFont(new Font("Tahoma", Font.PLAIN, 36));
		tfCampo2.setColumns(10);
		tfCampo2.setBounds(168, 66, 102, 86);
		contentPane.add(tfCampo2);
		
		tfCampo3 = new JTextField();
		tfCampo3.setEditable(false);
		tfCampo3.setHorizontalAlignment(SwingConstants.CENTER);
		tfCampo3.setFont(new Font("Tahoma", Font.PLAIN, 36));
		tfCampo3.setColumns(10);
		tfCampo3.setBounds(305, 66, 102, 86);
		contentPane.add(tfCampo3);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(256, 236, 159, 23);
		contentPane.add(btnJogar);
		CampoController campoController = new CampoController(tfCampo1, tfCampo2, tfCampo3, btnJogar);
		btnJogar.addActionListener(campoController);
	}
}