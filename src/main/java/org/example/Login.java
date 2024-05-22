package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel  {
	
	
	JLabel userNameLabel = new JLabel("Username: ");
	JTextField userNameTextField = new JTextField();
	JLabel passwordLabel = new JLabel("Password: ");
	JPasswordField passwordTextField = new JPasswordField();
	JButton login = new JButton("Login");
	JButton clear = new JButton("Clear");
	JButton exit = new JButton("Exit");
	
	public Login(){
		
		setBounds(0, 0, 600, 400);
		setVisible(true);
		setLayout(null);
		
		
		userNameLabel.setBounds(50, 25, 100, 100);
		
		userNameTextField.setBounds(150, 62, 200, 25);
		
		
		passwordLabel.setBounds(50, 75, 100, 100);
		
		passwordTextField.setBounds(150, 112, 200, 25);
		
		
		
		login.setBounds(50, 300 , 75, 25);
		
		clear.setBounds(130, 300 , 75, 25);
		
		exit.setBounds(210, 300, 75, 25);
		
		
		
		
		
		
		add(login);
		add(exit);
		add(clear);
		add(userNameLabel);
		add(passwordLabel);
		add(userNameTextField);
		add(passwordTextField);
		
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				passwordTextField.setText("");
				userNameTextField.setText("");
				
			}
		});
		
		
	}
	
	

}
