package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame("Type or Die");
	JLabel label = new JLabel();
	String keyPressed;
	char currentLetter;
	
		
	void gui () {
		frame.add(label);
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		label.setOpaque(true);
		
		frame.pack();
	}
		char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(26) + 'a');
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("You Typed " + e.getKeyChar());
			if(currentLetter == e.getKeyChar()) {
				System.out.println("Correct");
				label.setBackground(Color.green);
			} else {
				System.out.println("Wrong");
				label.setBackground(Color.red);
			}
			currentLetter = generateRandomLetter();
			label.setText(String.valueOf(currentLetter));
		}
	}
	

