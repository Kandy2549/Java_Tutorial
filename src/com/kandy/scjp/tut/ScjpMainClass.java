package com.kandy.scjp.tut;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScjpMainClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4950998071495051590L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Point p= new Point(10,20);
		//System.out.println("1st Var ="+ p.x+"   2nd Var="+p.y);
		List<Bicycle> byobjcoll= new ArrayList<Bicycle>();
		Bicycle by1=new Bicycle(10, 5, 2);
		Bicycle by2=new Bicycle(11, 6, 3);
		Bicycle by3=new Bicycle(12, 7, 4);
		Bicycle by4=new Bicycle(13, 8, 5);
		Bicycle by5=new Bicycle(15, 9, 6);
		
		byobjcoll.add(by1);
		byobjcoll.add(by2);
		byobjcoll.add(by3);
		byobjcoll.add(by4);
		byobjcoll.add(by5);

		for(int i=0;i<byobjcoll.size();i++){
	    System.out.println("List="+byobjcoll.get(i));}
		
		 System.out.println("ID="+Bicycle.numberOfBicycles);
		 
		 
		 Bicycle a = new Bicycle(10, 5, 2);
		 Bicycle b = new Bicycle(11, 6, 3);
		 a.y = 5;
		 b.y = 6;
		 a.x = 1;
		 b.x = 2;
		 System.out.println("a.y = " + a.y);
		 System.out.println("b.y = " + b.y);
		 System.out.println("a.x = " + a.x);
		 System.out.println("b.x = " + b.x);
		 System.out.println("Bicycle.x = " + Bicycle.x);
	}
	
	 

}
