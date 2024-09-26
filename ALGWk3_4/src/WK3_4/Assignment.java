package WK3_4;
import java.util.ArrayList;
import java.util.List;

// Created By: Nicolas Delgado
// I did get outside help in order to repeatedly display the outputs as I was stuck on it

public class Assignment {
	public static List<List<Integer>> location(int[] [] grid, int row, int col) {
		List<List<Integer>> result = new ArrayList<>();
	    int rows = grid.length;
	    int cols = grid[0].length;
	    List<Integer> currentResult = new ArrayList<>();
	    
	     	while (row < rows && col < cols) {
	            currentResult.add(grid[row][col]);
	            result.add(new ArrayList<>(currentResult)); // stores copies of the robots trajectorys

	        Integer downNeighbor = (row + 1 < rows) ? grid[row + 1][col] : null; // Shifts Down by 1
	        Integer rightNeighbor = (col + 1 < cols) ? grid[row][col + 1] : null; // Shifts Right by 1

	        if (downNeighbor != null && rightNeighbor != null) { // This determines whether to go down or right based off each variable
	             if (downNeighbor < rightNeighbor) {
	                  row++; // Down
	            } else {
	                  col++; // Right
	            }
	            } else if (downNeighbor != null) {
	                row++; // Down
	            } else if (rightNeighbor != null) {
	                col++; // Right
	            } else {
	                break; // No open spaces
	            }
	        }
	        return result;
	    }
	public static void main(String[] args) {
		int[][] grid = { // Main array
	        {27, 4, 29, 35, 6, 33}, // 27 = (0,0)
	        {12, 22, 3, 15, 17, 0},
	        {8, 9, 10, 16, 1, 34},
	        {11, 18, 21, 20, 7, 14},
	        {19, 23, 31, 26, 24, 25},
	        {13, 28, 5, 30, 32, 2}, // 2 = (5,5)

	       };
	 List<List<Integer>> result = location(grid, 0, 0); // Starts off at the top left off the array
	 for (int i = 0; i < result.size(); i++) { // this for loop continuously prints each "Step" that the robot takes
		 System.out.println("Output " + (i + 1) + ": " + result.get(i)); // Reads from the copies of the robots trajectory that we previously made
	 }
	    }
	}