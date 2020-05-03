package com.kandy.designPattern.FP.tut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	
	public static void main(String args[])throws IOException{  
	      GetPlanFactory planFactory = new GetPlanFactory();  
	      System.out.println("Our Plan Type Are- ");  
	      System.out.println("*******************************************************");  
	     
	      System.out.println("DOMESTICPLAN");  
	      System.out.println("COMMERCIALPLAN");  
	      System.out.println("INSTITUTIONALPLAN"); 
	      System.out.println("*******************************************************");  
	        
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName=br.readLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
	  
	      Plan p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	           
	        }  
	
	
}
