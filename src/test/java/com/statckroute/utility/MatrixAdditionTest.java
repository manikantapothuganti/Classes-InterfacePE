package com.statckroute.utility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrixAdditionTest {
	 MatrixAddition add;
	    int[][] mat1;
	    int[][] mat2;
	    
	    @Before
	    public void setup() {
	         mat1= new int[][]{{2,2},{4,4},{5,5}};
	         mat2= new int[][]{{9,9},{7,7},{4,4}};
	         add=new MatrixAddition();
	    }
	    @Test(expected=IllegalArgumentException.class)
	    public void inputSizeMatrixCheck() {
	        int[][] mat1={{1,2,6},{3,3},{5,6}};
	        int[][] mat2={{5,6},{22,6},{3,3},{4,4}};
	        add.additionFunction(mat1, mat2);
	    }
	    @Test
	    public void additionTest() {
	        int[][] expectedMatrix={{11,11},{11,11},{9,9}};
	        
	        assertArrayEquals(expectedMatrix,add.additionFunction(mat1, mat2));
	    }
	

}
