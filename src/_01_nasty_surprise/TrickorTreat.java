package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TrickorTreat implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Trick");
	JButton button2 = new JButton("Treat");
	Dimension button = new Dimension(300,200);
void gui() {
	
	frame.add(panel);
	frame.setSize(700,300);
	button1.setPreferredSize(button);
	button2.setPreferredSize(button);
	panel.add(button2);
	panel.add(button1);
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(button1 == buttonPressed) {
		showPictureFromTheInternet("https://www.wired.com/images_blogs/photos/uncategorized/2008/03/04/puppy.jpg");
	} else if (button2 == buttonPressed) {
		showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5VQmwfdLrzUU-8BG0xdXl9tO0VgQc69PwnfIeCVkt7ThMiCDF&s");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}
//hi