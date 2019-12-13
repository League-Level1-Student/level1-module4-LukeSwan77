package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrickorTreat implements ActionListener {
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
	button1.addActionListener(this);
	button2.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e == "button1") {
		
	}
}

}
