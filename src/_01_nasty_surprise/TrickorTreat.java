package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrickorTreat {
void gui() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	frame.add(panel);
	panel.add(button2);
	panel.add(button1);
	frame.pack();
	frame.setVisible(true);
}

}
