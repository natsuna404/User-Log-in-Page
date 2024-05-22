package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ProfileManager {
	
	
	public static String currentUserNameLoggedIn = "";
	public static String currentPasswordLoggedIn = "";
	
	private File currentFile;
	private String fileContext = "";
	
	private static String currentStringFile = "";
	private static String filePath;
	
	public static Map<String, String> profiles = new HashMap<>();
	
	
	public ProfileManager(String filePath) {
		
		ProfileManager.filePath = filePath;
		currentFile = new File(ProfileManager.filePath);
		
		
		ReadJsonFile();
	}
	
	
	public static void ReadJsonFile(){
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(new File(filePath));
			File jsonFile = new File(filePath);
			
			JsonNode userNodes = node.get("users");
			
			profiles = mapper.readValue(jsonFile, HashMap.class);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println(profiles);
		
	}
	
	
	
	public static boolean canLogin(String username, String password){
		
		if(profiles.containsKey(username) && profiles.get(username).equals(password)){
			return true;
		}else{
			return false;
		}
	
	}
	
	public static void changeProfile(String username, String password){
		
		profiles.remove(currentUserNameLoggedIn);
		profiles.put(username, password);
		currentUserNameLoggedIn = username;
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(new File(filePath));
			
			mapper.writeValue(new File(filePath), profiles);
			
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
	
	}
	
	
}
