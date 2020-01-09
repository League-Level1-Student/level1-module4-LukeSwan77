package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	int result;
	int num1;
	int num2;
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	JLabel output = new JLabel();
	JButton addButton = new JButton();
	JButton subtractButton = new JButton();
	JButton multiplyButton = new JButton ();
	JButton divideButton = new JButton();
	void run() {
		
		frame.add(panel);
		panel.add(input1);
		panel.add(input2);
		panel.add(output);
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		frame.setVisible(true);
		output.setPreferredSize(new Dimension(100, 25));
		input1.setPreferredSize(new Dimension(100, 25));
		input2.setPreferredSize(new Dimension(100, 25));
		addButton.setPreferredSize(new Dimension(75, 25));
		subtractButton.setPreferredSize(new Dimension(75, 25));
		multiplyButton.setPreferredSize(new Dimension(75, 25));
		divideButton.setPreferredSize(new Dimension(75, 25));
		addButton.setText("+");
		subtractButton.setText("-");
		multiplyButton.setText("*");
		divideButton.setText("/");
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		
		frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(addButton == buttonPressed) {
			add();
			output.setText(" = " + result + "");
		} else if (subtractButton == buttonPressed) {
			subtract();
			output.setText(" = " + result + "");
		} else if (multiplyButton == buttonPressed) {
			multiply();
			output.setText(" = " + result + "");
		} else if (divideButton == buttonPressed) {
			divide();
			output.setText(" = " + result + "");
		}
	}
	
	int add() {
		num1 = Integer.parseInt(input1.getText());
		num2 = Integer.parseInt(input2.getText());
		result = num1 + num2;
		return result;
	}
	int subtract() {
		num1 = Integer.parseInt(input1.getText());
		num2 = Integer.parseInt(input2.getText());
		result = num1 - num2;
		return result;
	}
	int multiply() {
		num1 = Integer.parseInt(input1.getText());
		num2 = Integer.parseInt(input2.getText());
		result = num1 * num2;
		return result;
	}
	int divide() {
		num1 = Integer.parseInt(input1.getText());
		num2 = Integer.parseInt(input2.getText());
		result = num1 / num2;
		return result;
	}
	
	
}
