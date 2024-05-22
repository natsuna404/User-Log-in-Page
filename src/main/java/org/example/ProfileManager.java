package org.example;

import java.io.File;
import java.io.IOException;

public class ProfileManager {
	
	
	public File currentFile;
	public String fileContext;
	
	public ProfileManager(String filePath){
		
		
		try {
			File currentFile = new File(filePath);
			if (currentFile.createNewFile()) {
				System.out.println("File created: " + currentFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	
	}
	
	
}
