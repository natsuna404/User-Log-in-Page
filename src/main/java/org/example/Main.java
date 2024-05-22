package org.example;

import java.awt.*;
import javax.swing.*;

public class Main {
	
	public static Screen screenState = Screen.Login;
	
	
	public static Login loginScreen = new Login(Color.WHITE);
	public static Login editProfile = new Login(Color.RED);
	public static LandingPage welcomeScreen = new LandingPage(Color.YELLOW);
	
	public static JFrame window = new JFrame("Login");
	
	public ProfileManager profileManager = new ProfileManager("resources/profile.txt");
	
	public static void main(String[] args) {
		
		window.setFocusable(true);
		window.setResizable(false);
		window.setVisible(true);
		window.setLayout(null);
		window.setSize(600, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		window.add(loginScreen);
		window.add(editProfile);
		window.add(welcomeScreen);
		
		ChangeScreen(screenState);
		
	}
	

	public static void ChangeScreen(Screen nextScreen){

		screenState = nextScreen;

		if (screenState == Screen.Login) {
			loginScreen.setVisible(true);
			editProfile.setVisible(false);
			welcomeScreen.setVisible(false);
		}else if(screenState == Screen.EditProfile){
			loginScreen.setVisible(false);
			editProfile.setVisible(true);
			welcomeScreen.setVisible(false);
		}else if(screenState == Screen.Welcome){
			loginScreen.setVisible(false);
			editProfile.setVisible(false);
			welcomeScreen.setVisible(true);
		}
	}
}