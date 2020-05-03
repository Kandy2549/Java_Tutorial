package test.kamlesh.pack;

public class Main {
	  public static class Age {
	        public int years = 1;

	        public Age(int y) {
	            years = y;
	        }

	        public void print() {
	            System.out.println(years);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Age four = new Age(4); 
		  four.years++;
	     // age++;
	      four.print();
	}

}
