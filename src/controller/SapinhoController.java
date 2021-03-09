package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SapinhoController implements ActionListener {
	private JLabel lblSapinho1;
	private JLabel lblSapinho2;
	private JLabel lblSapinho3;
	private JLabel lblSapinho4;
	private JLabel lblSapinho5;
	private JButton btnIniciar;
	public SapinhoController(JLabel lblSapinho1,JLabel lblSapinho2,JLabel lblSapinho3,
			JLabel lblSapinho4,JLabel lblSapinho5, JButton btnIniciar) {
		this.lblSapinho1 = lblSapinho1;
		this.lblSapinho2 = lblSapinho2;
		this.lblSapinho3 = lblSapinho3;
		this.lblSapinho4 = lblSapinho4;
		this.lblSapinho5 = lblSapinho5;
		this.btnIniciar = btnIniciar;
	}	
	private void botaoBolinha(){//da a função ao botão
		Thread t1 = new ThreadSapinho(lblSapinho1, btnIniciar);
		Thread t2 = new ThreadSapinho(lblSapinho2, btnIniciar);
		Thread t3 = new ThreadSapinho(lblSapinho3, btnIniciar);
		Thread t4 = new ThreadSapinho(lblSapinho4, btnIniciar);
		Thread t5 = new ThreadSapinho(lblSapinho5, btnIniciar);	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		// da iniciação as duas bolinhas quando o botao é apertado
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		botaoBolinha();
		
	}
	
}
