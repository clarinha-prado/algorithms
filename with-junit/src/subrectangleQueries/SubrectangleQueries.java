package subrectangleQueries;

import java.util.Arrays;

public class SubrectangleQueries {
	
	private int[][] rect;
	
    public SubrectangleQueries(int[][] rectangle) {
    	rect = new int[rectangle.length][rectangle[0].length];
    	rect = rectangle;
        
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int row = row1; row <= row2; row++) {
        	for (int col = col1; col <= col2; col++) {
        		rect[row][col] = newValue;
        	}
        }
    }
    
    public int getValue(int row, int col) {
        return rect[row][col];
    }
    
    public int[][] getRect() {
    	return rect;
    }
    
    public void print() {
            // Loop through all rows
            for (int i = 0; i < rect.length; i++) {
            	System.out.print("[ ");
                // Loop through all elements of current row
                for (int j = 0; j < rect[i].length; j++) {
                    System.out.print(rect[i][j] + " ");
                }
                System.out.println("]");
            }
    }

	public static void main(String[] args) {
		int[][] input = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
		int param_2;
		
		 SubrectangleQueries obj = new SubrectangleQueries(input);
		 obj.print();
		 
		 System.out.println(obj.getValue(0,2));
		 
		 obj.updateSubrectangle(0,0,3,2,5);
		 obj.print();
		 
		 System.out.println(obj.getValue(0,2));
		 
		 System.out.println(obj.getValue(3,1));
		 
		 obj.updateSubrectangle(3,0,3,2,10);
		 obj.print();
		 
		 System.out.println(obj.getValue(3,1));
		 
		 System.out.println(obj.getValue(0,2));

	}

}
