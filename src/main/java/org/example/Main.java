package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	
	public static int screenState = 0;
	
	public static Login loginScreen = new Login();
	
	public static JFrame window = new JFrame("Login");
	
	public static void main(String[] args) {
		
	
		window.setVisible(true);
		window.setLayout(null);
		window.setSize(600, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		window.add(loginScreen);
		
	}
	
//
//	public static void ChangeScreen(int screen){
//
//		screenState = screen;
//
//		if (screenState == 0) {
//			loginScreen.setVisible(true);
//		}else if(screenState == 1){
//			loginScreen.setVisible(false);
//		}else if(screenState == 2){
//			loginScreen.setVisible(false);
//		}
//	}
}