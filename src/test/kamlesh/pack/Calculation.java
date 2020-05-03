package test.kamlesh.pack;

public class Calculation {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
        	System.out.println("Max>>."+max);
        	System.out.println("Array >>>>"+arr[i]);
            if(max<arr[i])  
            	System.out.println("Max found...");
                max=arr[i];  
        }  
        return max;  
    }  
}
