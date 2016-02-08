package com.farazcsk.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.farazcsk.Grid;

public class ReadFile {
	
	public static Grid GridFromFile(String targetFile) throws IOException {
		List<String> input = new ArrayList<String>();
		
		Reader reader = new FileReader(targetFile);
		BufferedReader br = new BufferedReader(reader);
        
		String line;
	    while ((line = br.readLine()) != null) {
	       input.add(line);
	    }
	    
	    String firstLine = input.get(0);
	    String[] sizes = firstLine.split(" ");
	    
	    int rows = Integer.parseInt(sizes[0]);
	    int columns = Integer.parseInt(sizes[1]);
	    input.remove(0);
	    
	    
	    br.close();
		return new Grid(rows, columns, input);
	}
}
