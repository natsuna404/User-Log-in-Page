package org.example;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LandingPage extends JPanel {
	
	JLabel msg = new JLabel("WELCOME");
	JButton editP = new JButton("Edit Profile");
	JButton log_out = new JButton("Log out");
	
	public LandingPage(Color color) {
		
		setBounds(0, 0, 600, 400);
		setVisible(true);
		setLayout(null);
		setBackground(color);
		
		
		msg.setBounds(260,10,500,10);	
		editP.setBounds(20,310,100,25);
		log_out.setBounds(470,310,100,25);
		
		add(msg);
		add(editP);
		add(log_out);
		
		editP.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.ChangeScreen(Screen.EditProfile);
				
			}
			
		});
		log_out.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.ChangeScreen(Screen.Login);
				
			}
		});
		
	}
		
	
}
