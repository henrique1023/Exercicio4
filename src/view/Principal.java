package view;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.SapinhoController;

public class Principal extends JFrame {
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Principal frame = new Principal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
			public Principal() {//declaracao da janela
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblSapinho1 = new JLabel(".");//declaracao das bolinhas
				lblSapinho1.setFont(new Font("Tahoma", Font.BOLD, 70));
				lblSapinho1.setBounds(10, 10, 68, 74);//primeiro mexe para esqueda ou direita
				//segundo mexe pra cima ou pra baixo
				//terceiro e quarto mexem na estrutura da bolinha
				contentPane.add(lblSapinho1);//deixa a bolinha visivel
				
				JLabel lblSapinho2 = new JLabel(".");
				lblSapinho2.setFont(new Font("Tahoma", Font.BOLD, 70));
				lblSapinho2.setBounds(10, 30, 68, 74);
				contentPane.add(lblSapinho2);
				
				JLabel lblSapinho3 = new JLabel(".");
				lblSapinho3.setFont(new Font("Tahoma", Font.BOLD, 70));
				lblSapinho3.setBounds(10, 50, 68, 74);
				contentPane.add(lblSapinho3);
				
				JLabel lblSapinho4 = new JLabel(".");
				lblSapinho4.setFont(new Font("Tahoma", Font.BOLD, 70));
				lblSapinho4.setBounds(10, 70, 68, 74);
				contentPane.add(lblSapinho4);
				
				JLabel lblSapinho5 = new JLabel(".");
				lblSapinho5.setFont(new Font("Tahoma", Font.BOLD, 70));
				lblSapinho5.setBounds(10, 90, 68, 74);
				contentPane.add(lblSapinho5);
				
				JButton btnIniciar = new JButton("Iniciar Corrida");
				btnIniciar.setBounds(0, 0, 155, 23);
				contentPane.add(btnIniciar);
				
				SapinhoController SapinhoController = new SapinhoController(lblSapinho1, lblSapinho2,
						lblSapinho3,lblSapinho4,lblSapinho5, btnIniciar);
				btnIniciar.addActionListener(SapinhoController);
	}
}



