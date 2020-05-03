package com.kandy.scjp.tut;

public class StringTestTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String third = "Baeldung";
		String fifth = "Baeldung";
		String fourth = new String("Baeldung"); 
	
		System.out.println(third == fifth); // == to Operator returns true because both object refrencing towards same reference from string pool
		System.out.println(third.equals(fourth)); // .equals method return true because its campare object and contents that why its return true
		System.out.println(third == fourth); // False

	}

}
