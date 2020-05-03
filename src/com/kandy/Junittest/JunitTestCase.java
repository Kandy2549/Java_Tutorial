package com.kandy.Junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import test.kamlesh.pack.Calculation;

public class JunitTestCase {
	
	 @Test  
	    public void testFindMax(){  
	        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  

}
