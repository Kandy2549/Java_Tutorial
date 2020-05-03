package test.kamlesh.pack;

import java.util.ArrayList;

public class ArraySortTestr {
	
	public static ArrayList<Integer> bubbleSort (ArrayList<Integer> ar){

	    for(int i = 0 ; i < ar.size()-1 ; i++){
	        int indexMax = i;            
	        for(int j = 1 ; j < ar.size() ; j++){
	            if(ar.get(indexMax) > ar.get(j)){
	                indexMax = j;
	            }
	    }
	        if(indexMax != i){
	            int temp = ar.get(i);
	            ar.set(i, ar.get(indexMax));
	            ar.set(indexMax, temp);
	        }
	} 
	    return ar;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	ArrayList<Integer> testArray=new ArrayList<Integer>();
		testArray.add(10);
		testArray.add(20);
		testArray.add(5);
		testArray.add(8);
		System.out.println(testArray);
		System.out.println(ArraySortTestr.bubbleSort(testArray));*/
		
		ArrayList<String> testArray1=new ArrayList<String>();
		testArray1.add("kickstart");
		System.out.println(testArray1.get(0).contentEquals("start"));
		
	}

}
