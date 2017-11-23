import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;


public class Calculator {

	private JFrame frame;
	private JTextField textField;
	//private JTextField textField1;
	
	double firstnumber;
	double secondnumber;
	double rest;
	
	String operator, format;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		//textField1 = new JTextField();
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		panel.add(textField);
		textField.setColumns(19);
		
		JButton Clear = new JButton("C");
		Clear.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		JButton button_backspace = new JButton("\u232b");
		button_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0) {
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backspace = str.toString();
				}
				textField.setText(backspace);
			}
		});
		panel.add(button_backspace);
		panel.add(Clear);
		//------------1----------------------
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_1.getText();
				textField.setText(number);
			}
		});
		panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_2.getText();
				textField.setText(number);
			}
		});
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_3.getText();
				textField.setText(number);
			}
		});
		panel.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_4.getText();
				textField.setText(number);
			}
		});
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_5.getText();
				textField.setText(number);
			}
		});
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_6.getText();
				textField.setText(number);
			}
		});
		panel.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_7.getText();
				textField.setText(number);
			}
		});
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_8.getText();
				textField.setText(number);
			}
		});
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_9.getText();
				textField.setText(number);
			}
		});
		panel.add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_0.getText();
				textField.setText(number);
			}
		});
		panel.add(button_0);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		panel.add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		panel.add(button_minus);
		
		JButton button_multiplu = new JButton("*");
		button_multiplu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		
		JButton button_equals = new JButton("=");
		button_equals.setBackground(SystemColor.desktop);
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnumber = Double.parseDouble(textField.getText());
				
				switch(operator) {
				case "+": rest = firstnumber + secondnumber;
				if(firstnumber % 1 ==0 && secondnumber % 1 ==0 ) {
					format = String.format("%.0f",rest);
					textField.setText(format);
				}else {
					format = String.format("%.2f",rest);
					textField.setText(format);
					}
				break;
				
				case "-": rest = firstnumber - secondnumber;
				if(firstnumber % 1 ==0 && secondnumber % 1 ==0 ) {
					format = String.format("%.0f",rest);
					textField.setText(format);
				}else {
					format = String.format("%.2f",rest);
					textField.setText(format);
					}
				break;
				
				case "/": rest = firstnumber / secondnumber;
				if(rest % 1 ==0 ) {
					format = String.format("%.0f",rest);
					textField.setText(format);
				}else {
					format = String.format("%.2f",rest);
					textField.setText(format);
					}
				break;
				
				case "*": rest = firstnumber * secondnumber;
				if(firstnumber % 1 ==0 && secondnumber % 1 ==0 ) {
					format = String.format("%.0f",rest);
					textField.setText(format);
				}else {
					format = String.format("%.2f",rest);
					textField.setText(format);
					}
				break;
				case "%": rest = firstnumber % secondnumber;
					format = String.format("%.0f", rest);
					textField.setText(format);
					break;
				}
			}
		});
		panel.add(button_equals);
		panel.add(button_multiplu);
		
		JButton button_divid = new JButton("/");
		button_divid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		panel.add(button_divid);
		
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot = textField.getText() + button_dot.getText();
				textField.setText(dot);
			}
		});
		
		JButton button_div = new JButton("%");
		button_div.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			} 
		});
		panel.add(button_div);
		panel.add(button_dot);
		
		JButton button_NP = new JButton("+/-");
		button_NP.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_NP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(textField.getText());
				ops*=-1;
				textField.setText(String.valueOf(ops));
			} 
		});
		panel.add(button_NP);
	}

}
