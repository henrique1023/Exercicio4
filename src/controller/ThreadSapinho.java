package controller;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadSapinho extends Thread{
	private JLabel lblSapinho;
	private JButton btnIniciar;
	public ThreadSapinho(JLabel lblSapinho, JButton btnIniciar) {
		this.lblSapinho = lblSapinho;
		this.btnIniciar = btnIniciar;
		}
	private void mexeBolinha() {
		btnIniciar.setEnabled(false);
		Rectangle posicao;
		posicao = lblSapinho.getBounds();
		lblSapinho.setBounds(posicao);
		int contadorDeMov = 0;
		String sap = "";
		int disMax = 100;
		int i = 0;
		while (contadorDeMov <= disMax) {
			posicao.x += contadorDeMov;
			lblSapinho.setBounds(posicao);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			i = (int)(Math.random() * 12 ) + 1;
			contadorDeMov += i;
			
			if(contadorDeMov == disMax) {
				contadorDeMov = 100;
			}
		}
		if(getId() == 17) {
			sap="Sapinho1";
		}else {
			if(getId() == 18) {
				sap = "Sapinho2";
			}else {
				if(getId() == 19) {
					sap = "Sapinho3";
				}else {
					if(getId() == 20) {
						sap = "Sapinho4";
					}else {
						if(getId() == 21) {
							sap = "Sapinho5";
						}
					}
				}
			}
		}
		System.out.println(sap + " Salto foi de " + i);
		btnIniciar.setEnabled(true);
		posicao.x = 0;
		lblSapinho.setBounds(posicao);
	}
	@Override
	public void run() {
		mexeBolinha();
	}
}
