package test.kamlesh.pack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MaxProductArray {

	static int setPropertiesforArray(String messg){
		int val =0;
		boolean stat=false;
		System.out.println(messg);
		Scanner sc=new Scanner(System.in);		
		val=sc.nextInt();
		stat= arraySizeValidation(val);
		if(stat)
			return val;
		else 
			return 0;
	}
	
	static boolean arraySizeValidation(int val){
	   boolean stat = false;
    	if(val > 3 && val <9){	
    	stat=true;
		} else {
			System.out.println("Please enetr size of Array between 3 or 9 only.");
			MaxProductArray.setPropertiesforArray("Enter Size of Array");
			 stat=false;
		}
    	return stat;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int MAX_SIZE_ARRY=setPropertiesforArray("Enter Size of Array");
		//Array intArray= new arr
		 String[] frasi ={"ChiHaRobaInMareNonHaNulla","TuttiIPiuGrandiPensieriSonoConcepitiMentreSiCammina"};

		 try (PrintWriter pw = new PrintWriter( new FileOutputStream(new File("E:\\kandy.txt"), true))) {
               
                int count = 0;
                String temp="";
		        for (String frase : frasi) {
		            pw.print(frase + ". ");
		            if(count==0)
		            temp=(frasi.length-count)+"";
		            else
		             temp=temp+","+(frasi.length-count);
		            count++;
		            System.out.println(count);
		          //  temp=frasi.length-count;
		        }
		        pw.print("\n" + temp);
		        pw.close();

		    } catch (IOException e) {
		        //System.out.println("Error writing into the outputFile: " + outputFile);
		        e.printStackTrace();
		    }
		
	}
	
	
}
