package com.kandy.scjp.tut;

public class Bicycle {
	
	    private int cadence;
	    private int gear;
	    private int speed;
	    private int id;
	    protected static int numberOfBicycles = 0;  //Class variable declaration and initialization..Kamlesh
	        
	    public Bicycle(int startCadence, int startSpeed, int startGear){
	        gear = startGear;
	        cadence = startCadence;
	        speed = startSpeed;

	        // increment number of Bicycles
	        // and assign ID number
	        id = ++numberOfBicycles;
	    }

	    // new method to return the ID instance variable
	    public int getID() {
	        return id;
	    }

		@Override
		public String toString() {
			return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
		}
	    
	    
	    
		public static int x = 7; 
	    public int y = 3;

}
