package test.kamlesh.pack;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		int temp=1;
		Scanner sc;
	    System.out.println("Eneter your Number :");
		while(x < 6){
			sc= new Scanner(System.in);
			int Y =Integer.parseInt(sc.nextLine());
			temp=temp*Y;
			x++;
		}
		System.out.println("Product :"+temp);

	}

}
