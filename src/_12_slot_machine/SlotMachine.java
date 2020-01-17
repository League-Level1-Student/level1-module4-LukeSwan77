package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton spinButton = new JButton("Spin!");
	JLabel reel1 = new JLabel();
	JLabel reel2 = new JLabel();
	JLabel reel3 = new JLabel();
	Random ran = new Random();
	int num1;
	int num2;
	int num3;
	Icon apple;
	Icon orange;
	Icon cherry;
	SlotMachine(){
		 apple = createLabelImage("apple.png");
		 orange = createLabelImage("orange.jpeg");
		 cherry = createLabelImage("cherry.jpeg");
	}
	void run(){
		
		spin();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		spinButton.addActionListener(this);
		panel.add(spinButton);
		panel.add(reel1);
		panel.add(reel2);
		panel.add(reel3);
		frame.pack();
	}
	
	private Icon createLabelImage(String fileName) {
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return null;
	}
	Icon icon = new ImageIcon(imageURL);
	return icon;
	}
	void spin() {
		num1 = ran.nextInt(3);
		num2 = ran.nextInt(3);
		num3 = ran.nextInt(3);
		if(num1 == 1) {
			reel1.setIcon(apple);
		} else if(num1 == 2) {
			reel1.setIcon(orange);
		} else if(num1 == 0) {
			reel1.setIcon(cherry);
		} 
		if(num2 == 1) {
			reel2.setIcon(apple);
		} else if(num2 == 2) {
			reel2.setIcon(orange);
		} else if(num2 == 0) {
			reel2.setIcon(cherry);
	    } 
		if(num3 == 1) {
			reel3.setIcon(apple);
		} else if(num3 == 2) {
			reel3.setIcon(orange);
		} else if(num3 == 0) {
			reel3.setIcon(cherry);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(spinButton == buttonPressed) {
			spin();
			
			frame.repaint();
		}
	}
	
	
	}
