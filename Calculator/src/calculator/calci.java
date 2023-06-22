package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn00;
	private JButton btn8;
	private JButton btn9;
	private JButton btn5;
	private JButton btn6;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDot;
	private JButton btnEquals;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnModulas;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 453, 91);
		textField.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setBackground(new Color(192, 192, 192));
		btnBackspace.setForeground(new Color(0, 0, 0));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 30));
		btnBackspace.setBounds(10, 113, 106, 80);
		frame.getContentPane().add(btnBackspace);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Arial", Font.BOLD, 30));
		btn7.setBackground(new Color(192, 192, 192));
		btn7.setBounds(10, 204, 106, 80);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Arial", Font.BOLD, 30));
		btn4.setBackground(new Color(192, 192, 192));
		btn4.setBounds(10, 295, 106, 80);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Arial", Font.BOLD, 30));
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setBounds(10, 386, 106, 80);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Arial", Font.BOLD, 30));
		btn0.setBackground(new Color(192, 192, 192));
		btn0.setBounds(10, 477, 106, 80);
		frame.getContentPane().add(btn0);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Arial", Font.BOLD, 30));
		btnClear.setBackground(new Color(192, 192, 192));
		btnClear.setBounds(126, 113, 106, 80);
		frame.getContentPane().add(btnClear);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setForeground(Color.BLACK);
		btn00.setFont(new Font("Arial", Font.BOLD, 30));
		btn00.setBackground(new Color(192, 192, 192));
		btn00.setBounds(242, 113, 106, 80);
		frame.getContentPane().add(btn00);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Arial", Font.BOLD, 30));
		btn8.setBackground(new Color(192, 192, 192));
		btn8.setBounds(126, 204, 106, 80);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Arial", Font.BOLD, 30));
		btn9.setBackground(new Color(192, 192, 192));
		btn9.setBounds(242, 204, 106, 80);
		frame.getContentPane().add(btn9);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Arial", Font.BOLD, 30));
		btn5.setBackground(new Color(192, 192, 192));
		btn5.setBounds(126, 295, 106, 80);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Arial", Font.BOLD, 30));
		btn6.setBackground(new Color(192, 192, 192));
		btn6.setBounds(242, 295, 106, 80);
		frame.getContentPane().add(btn6);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Arial", Font.BOLD, 30));
		btn2.setBackground(new Color(192, 192, 192));
		btn2.setBounds(126, 386, 106, 80);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Arial", Font.BOLD, 30));
		btn3.setBackground(new Color(192, 192, 192));
		btn3.setBounds(242, 386, 106, 80);
		frame.getContentPane().add(btn3);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Arial", Font.BOLD, 30));
		btnDot.setBackground(new Color(192, 192, 192));
		btnDot.setBounds(126, 477, 106, 80);
		frame.getContentPane().add(btnDot);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setForeground(Color.BLACK);
		btnEquals.setFont(new Font("Arial", Font.BOLD, 30));
		btnEquals.setBackground(new Color(192, 192, 192));
		btnEquals.setBounds(242, 477, 106, 80);
		frame.getContentPane().add(btnEquals);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Arial", Font.BOLD, 30));
		btnPlus.setBackground(new Color(192, 192, 192));
		btnPlus.setBounds(358, 113, 106, 80);
		frame.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setForeground(Color.BLACK);
		btnMinus.setFont(new Font("Arial", Font.BOLD, 30));
		btnMinus.setBackground(new Color(192, 192, 192));
		btnMinus.setBounds(358, 204, 106, 80);
		frame.getContentPane().add(btnMinus);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setForeground(Color.BLACK);
		btnMultiply.setFont(new Font("Arial", Font.BOLD, 30));
		btnMultiply.setBackground(new Color(192, 192, 192));
		btnMultiply.setBounds(358, 295, 106, 80);
		frame.getContentPane().add(btnMultiply);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setForeground(Color.BLACK);
		btnDivide.setFont(new Font("Arial", Font.BOLD, 30));
		btnDivide.setBackground(new Color(192, 192, 192));
		btnDivide.setBounds(358, 386, 106, 80);
		frame.getContentPane().add(btnDivide);
		
		btnModulas = new JButton("%");
		btnModulas.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnModulas.setForeground(Color.BLACK);
		btnModulas.setFont(new Font("Arial", Font.BOLD, 30));
		btnModulas.setBackground(new Color(192, 192, 192));
		btnModulas.setBounds(358, 477, 106, 80);
		frame.getContentPane().add(btnModulas);
	}
}
