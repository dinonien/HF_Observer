package Gui;

import java.awt.*;
import javax.swing.*;

public class SwingObserver {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserver beispiel = new SwingObserver();
		beispiel.go();
	}

	public void go() {
		frame = new JFrame();

		JButton button = new JButton("Should I do it?");
		
		// Without lambdas
		//button.addActionListener(new AngelListener());
		//button.addActionListener(new DevilListener());
		
		// With lambdas
		button.addActionListener(event -> 
			System.out.println("Don't do it, you might regret it!")
		);
		button.addActionListener(event ->
			System.out.println("Come on, do it!")
		);
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
		}
		
}

