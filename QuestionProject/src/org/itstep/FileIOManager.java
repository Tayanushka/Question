package org.itstep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileIOManager {
	public static final String FILE_PATH = "D://testFile.txt";
	public void writeToFile(List<Question> questions, List<ChoiceResponse> choices) {
		String textToWrite ="";
		for (Question question : questions) {
			textToWrite += "Q:"+ question.getQuestion() + "\n";
			
			for (ChoiceResponse choiceResponse : choices) {
				if(question.isWithChoice()) {
					for(String answer: choiceResponse.getResponses()) {
					textToWrite += "   A:" + answer + "\n";}
					
				} 
				else {
					textToWrite += "   A:____________________\n";
					}
					
				}
			}
			
		try { 
			File file = new File(FILE_PATH);
			FileWriter writer = new FileWriter(FILE_PATH);
		writer.write(textToWrite);
			
		}	
		catch(IOException e){
			e.printStackTrace();
		}
		}
		
	
public String readFromFile() {
	String textFromFile = "";
	int oneByte = -1;
	try {
		FileReader reader = new FileReader(FILE_PATH);
		while ((oneByte = reader.read())!=-1) {
			textFromFile += String.valueOf((char)oneByte);
			
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
		return null;
	}

}
