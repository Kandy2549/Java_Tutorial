package test.kamlesh.pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LembdaTest {
	
	
	public interface Sayable{
		//public String say();
		public String say(String Name);
	}
	
	
	//Class Product for testing compareable through lambda expression..Kamlesh 
	
	public static class Product{
		int id;
		String name;
		Float price;
		
		Product(int id,String name,float price){
			super();
			this.id=id;
			this.name=name;
			this.price=price;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Sayable sb=(name)->{return "Hello I am new to lambda expression "+name; };
        
        System.out.println(sb.say("Kamlesh Kumar"));
        
        List<String> list= new ArrayList<String>();
        list.add("Kamlesh Kumar");
        list.add("Vishal");
        list.add("Mithu");
        list.add("Bittu");
        list.add("Vishal");
        list.add("Vikash");
        
        
        list.forEach(
                
        		(n)->{System.out.println(n);}
        		);
	
	// Running Thread without lambda expression..Kamlesh Kumar
        Runnable r1=new Runnable() {
    		@Override
    		public void run() {
    			// TODO Auto-generated method stub
    			
    			System.out.println("Thread 1 is running.Witout Lambda Expression");
    			
    		}
    	};
    	
    	Thread t1=new Thread(r1);
    	t1.start();
    	
    	
    	//Running Thread with lambda expression ..Kamlesh
    	
    	Runnable r2=()->System.out.println("Thread 1 is running.With Lambda Expression");
    	Thread t2=new Thread(r2);
    	t2.start();
    	
    	
    	//Testing Compareable from above defined object product..Kamlesh
    	
    	List<Product> proLIst= new ArrayList<Product>();
    	
    	proLIst.add(new Product(1, "HP", 25000f));
    	proLIst.add(new Product(2, "Dell", 20000f));
    	proLIst.add(new Product(3, "Lenovo", 12000f));
    	proLIst.add(new Product(4, "Micromax", 8000f));
    	
    	//Listing With Lembda expression..Kamlesh
    	
    	proLIst.forEach(
    			(n)->{System.out.println(n.name);}
    			);
    	
    	
    	//TODO Sorting using lambda expression..Kamlesh
    	
          Collections.sort(proLIst,(P1,P2)->{
        	  return P1.name.compareTo(P2.name);  
        	  });
          
          for(Product p:proLIst){  
              System.out.println(p.id+" "+p.name+" "+p.price);  
          } 
          
          
          //Filtering Data from list.
          
          // using lambda to filter data  
          Stream<Product> filtered_data = proLIst.stream().filter(p -> p.price > 20000);  
            
          // using lambda to iterate through collection  
          filtered_data.forEach(  
                  product -> System.out.println(product.name+": "+product.price)  
          );  
	}
	
	
	
}

