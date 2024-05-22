package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ProfileManager {
	
	

	private File currentFile;
	private String fileContext = "";
	private String FilePath;
	
	public Map<String, String> profiles = new HashMap<>();
	
	
	public ProfileManager(String filePath) {
		
		FilePath = filePath;
		currentFile = new File(FilePath);
		
		
		try{
			ReadFile();
		}catch (Exception e){
			System.out.println(e);
		}
		
	}
	
	
	public void ReadFile() throws IOException {
		
		BufferedReader myReader = new BufferedReader(new FileReader(currentFile));
		String st;
		
		while ((st = myReader.readLine()) != null) {
			if(st.contains("username: ")){
				fileContext = fileContext.concat(st);
			}
			
			if(fileContext.contains("username: ") && st.contains("password")){
				profiles.put(fileContext.substring(9), st.substring(9));
				fileContext = "";
			}
		}
		
		System.out.println(profiles);
	}
	
	
}
