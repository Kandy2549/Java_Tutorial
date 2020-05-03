package com.kandy.generic.tut;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	
	//Making Genrics methods..kamlesh 
	
	public static <E> void printArray(E [] elements){
		
		for(E element : elements){
			System.out.println("element ="+element);
		}
		
		System.out.println("Inside Generic Methods");
		
	}
	
	
	static abstract class Shape{  
		abstract void draw(); 
		}  
	
	
	static class Rectangle extends Shape{  
		void draw(){System.out.println("drawing rectangle");}  
		} 
	
	static class Circle extends Shape{  
		void draw(){System.out.println("drawing circle");}  
		}  
	
	
	static class GenericTest{  
		//creating a method that accepts only child class of Shape  
		public static void drawShapes(List<? extends Shape> lists){  
			for(Shape s:lists){  
			s.draw();//calling method of Shape class by child class instance  
			}  
		} 
		
	}
	
	
	//Method for testing upparbound wildcard returm and method argument..
	public static <? extends Number> Number addNumberObj (List <? extends Number>  numObj )
	{
	     Double sum=0.00;
		
		  for( Number n:numObj)  
	        {  
	            sum = sum + n.floatValue();  
	        }  
		
		return sum;
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen<Integer> m=new MyGen<Integer>();  
		m.setObj(2);  
		//m.add("vivek");//Compile time error  
		System.out.println(m.getObj()); 
		
		//Printing array of any type
		Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' }; 
        Boolean [] boolArray={true,false};
  
        System.out.println( "Printing Integer Array" );  
        printArray( intArray  );   
  
       System.out.println( "Printing Character Array" );  
        printArray( charArray );
        
        System.out.println( "Printing Boolean Array" );  
        printArray( boolArray );  
        
        
        //Printing Wildcard Generic ?..Kamlesh.
        List <Rectangle> recObj=new ArrayList<Rectangle>();
        List<Circle> cirObj= new ArrayList<Circle>();
        
        recObj.add(new Rectangle());
        cirObj.add(new Circle());
        cirObj.add(new Circle());
        
        GenericTest.drawShapes(recObj);
        GenericTest.drawShapes(cirObj);
        
        //Adding Genric nubers and returning Add..Kamlesh Kumar
        
        ArrayList<Integer> l1=new ArrayList<Integer>();  
        l1.add(10);  
        l1.add(20);  
        System.out.println("displaying the sum= "+TestGenerics.addNumberObj(l1));  
          
        ArrayList<Double> l2=new ArrayList<Double>();  
        l2.add(30.0);  
        l2.add(40.0);  
        System.out.println("displaying the sum= "+TestGenerics.addNumberObj(l2));  
		
	}

}
