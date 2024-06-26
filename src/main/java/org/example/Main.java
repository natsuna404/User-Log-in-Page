package org.example;

import java.awt.*;
import javax.swing.*;

public class Main {

	
	public static Screen screenState = Screen.Login;
	
	
	public static Login loginScreen;
	public static EditProfile editProfile;
	public static LandingPage welcomeScreen;
	
	public static JFrame window = new JFrame("Login");
	public static ProfileManager profileManager;
	
	
	public static void main(String[] args) {
		
		profileManager = new  ProfileManager("src/main/java/org/example/profiles.json");
		
		loginScreen = new Login();
		editProfile = new EditProfile();
		welcomeScreen = new LandingPage();
		

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
			welcomeScreen.SetMessage();
			welcomeScreen.setVisible(true);
		}
	}
}