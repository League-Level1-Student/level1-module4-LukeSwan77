package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	Random ran = new Random();
	int score = 0;
	Date gameStart = new Date();
	
	JButton moleButton;
	void run() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(600,800);
		
		drawButton(ran.nextInt(27));
	}
	
	void drawButton(int random) {
			 
				for (int i = 0; i < 27; i++) {
					JButton button = new JButton();
					button.setPreferredSize(new Dimension(150, 75));
					button.addActionListener(this);
					panel.add(button);
					if(i == random) {
					moleButton = button;
					moleButton.setText("Mole!");
					}
				}
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(moleButton == buttonPressed) {
			score++;
		} else {
			speak("You Missed");
		}
		frame.dispose();
		run();
		if(score == 10) {
			endGame(gameStart, score);
		}
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
}
