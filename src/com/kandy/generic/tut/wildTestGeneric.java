package com.kandy.generic.tut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wildTestGeneric {
	
	 static void doesntCompile(Map<Integer, List<? extends Number>> map) {}
	 static <T extends Number> void compiles(Map<Integer, List<T>> map) {}
	 
	static void demo(List<? extends Number> list){};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> TestInt= new ArrayList<Integer>();

		    doesntCompile(new HashMap<Integer,List<Integer>>());
	        //compiles(new HashMap<Integer, List<Integer>>());
	        
	        
	      // List lst=new List<Integer>();

	}

}
