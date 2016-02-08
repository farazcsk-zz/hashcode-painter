package com.farazcsk;
import java.io.IOException;

import com.farazcsk.utility.ReadFile;

public class Main {

	public static void main(String[] args) {		
		String targetFile = "inputs/logo.in";
		Grid targetGrid = null;
		
		try {
			targetGrid = ReadFile.GridFromFile(targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		targetGrid.print();


	}

}
