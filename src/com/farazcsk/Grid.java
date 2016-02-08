package com.farazcsk;

import java.util.List;

public class Grid {
	private final int MAX_ROWS;
	private final int MAX_COLUMNS;
	private final char[][] grid;
	
	public Grid(int rows, int columns, List input) {
		MAX_ROWS = rows;
		MAX_COLUMNS = columns;
		grid = new char[MAX_ROWS][MAX_COLUMNS];
		
		for(int i = 0; i < input.size() ; i++ ) { //Iterate rows
	    	String line = (String) input.get(i);
	    	for (int k = 0;k < line.length(); k++){ // Iterate columns
	    		grid[i][k] = line.charAt(k);
	    	}
		}
	}
	
	public void print() {
		for(int i = 0 ; i < MAX_ROWS ; i++) {
			for(int k = 0 ; k < MAX_COLUMNS; k++) {
				System.out.print(grid[i][k]);
			}
			System.out.println();
		}
	}

}
