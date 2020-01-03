package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame frame = new JFrame("Chuckle Clicker");
	JPanel panel = new JPanel();
	JButton jokeButton = new JButton("Joke");
	JButton punchlineButton = new JButton("Punchline");
public void gui() {
	frame.add(panel);
	panel.add(jokeButton);
	panel.add(punchlineButton);
	frame.setVisible(true);
	jokeButton.addActionListener(this);
	punchlineButton.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(jokeButton == buttonPressed) {
		JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
	}
	if(punchlineButton == buttonPressed) {
		JOptionPane.showMessageDialog(null, "To get to the other side");
	}
}
}
