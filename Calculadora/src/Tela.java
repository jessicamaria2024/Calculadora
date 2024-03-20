import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(128, 128, 128));
		frmCalculadora.getContentPane().setForeground(new Color(128, 128, 255));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 280, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 14));
		txtField.setBounds(10, 11, 244, 43);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
				
			}
		});
		btnc.setForeground(new Color(0, 255, 255));
		btnc.setFont(new Font("Arial", Font.BOLD, 15));
		btnc.setBounds(193, 65, 51, 29);
		frmCalculadora.getContentPane().add(btnc);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					selecionar = String.format("%.0f",resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					selecionar = String.format("%.0f",resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					selecionar = String.format("%.0f",resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("/")) {
					resultado = numero1/numero2;
					selecionar = String.format("%.0f",resultado);
					txtField.setText(selecionar);
				}
				
			}
		});
		btnigual.setForeground(new Color(0, 255, 255));
		btnigual.setFont(new Font("Arial", Font.BOLD, 28));
		btnigual.setBounds(132, 221, 51, 29);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 17));
		btn9.setBounds(132, 102, 51, 29);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 17));
		btn6.setBounds(132, 142, 51, 29);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 17));
		btn8.setBounds(71, 102, 51, 29);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 15));
		btn0.setBounds(10, 221, 51, 29);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 17));
		btn7.setBounds(10, 102, 51, 29);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnponto.setForeground(new Color(0, 255, 255));
		btnponto.setFont(new Font("Arial", Font.BOLD, 30));
		btnponto.setBounds(71, 221, 51, 29);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 17));
		btn5.setBounds(71, 142, 51, 29);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 17));
		btn4.setBounds(10, 142, 51, 29);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 17));
		btn3.setBounds(132, 182, 51, 29);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 17));
		btn2.setBounds(71, 182, 51, 29);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 17));
		btn1.setBounds(10, 182, 51, 29);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setForeground(new Color(0, 255, 255));
		btndiv.setFont(new Font("Arial", Font.BOLD, 25));
		btndiv.setBounds(193, 221, 51, 29);
		frmCalculadora.getContentPane().add(btndiv);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setForeground(new Color(0, 255, 255));
		btnmult.setFont(new Font("Arial", Font.BOLD, 22));
		btnmult.setBounds(193, 181, 51, 29);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setForeground(new Color(0, 255, 255));
		btnsoma.setFont(new Font("Arial", Font.BOLD, 25));
		btnsoma.setBounds(193, 141, 51, 29);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setForeground(new Color(0, 255, 255));
		btnsub.setFont(new Font("Arial", Font.BOLD, 35));
		btnsub.setBounds(193, 101, 51, 29);
		frmCalculadora.getContentPane().add(btnsub);
	}
}
