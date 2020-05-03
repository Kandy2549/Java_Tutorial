package com.kandy.stackoverflow;

import java.util.ArrayList;
import java.util.Scanner;

public class SteppingStone5_Recipe {
	private String recipeName;
	private int servings;
	private ArrayList<String> recipeIngredients;
	private double totalRecipeCalories;

	//accessor/getter for recipe name
	public String getRecipeName() {
	    return recipeName;
	}
	//mutator/setter for recipe name
	public void setRecipeName(String recipeName){
	    this.recipeName = recipeName;
	}
	//accessor for servings
	public int getServings(){
	    return servings;
	}
	//mutator for servings 
	public void setServings(int servings){
	    this.servings = servings;
	}
	//accessor for recipe ingredients
	public ArrayList<String> getRecipeIngredients(){
	    return recipeIngredients;
	//mutator for recipe ingredients
	}
	public void setRecipeIngredients(ArrayList<String> recipeIngredients){
	    this.recipeIngredients = recipeIngredients;
	}
	//accessor for the total of recipe calories
	public double getTotalRecipeCalories(){
	    return totalRecipeCalories;
	}
	//mutator for Total of recipe calories
	public void setTotalRecipeCalories(double totalRecipeCalories){
	    this.totalRecipeCalories = totalRecipeCalories;
	}

	public SteppingStone5_Recipe() {
	    this.recipeName = "";
	    this.servings = 0;
	    this.recipeIngredients = new ArrayList<String>();
	    this.totalRecipeCalories = 0;
	}

	public SteppingStone5_Recipe(String recipeName, int servings, ArrayList<String> recipeIngredients, 
	double totalRecipeCalories) {
	    this.recipeName = recipeName;
	    this.servings = servings;
	    this. recipeIngredients = recipeIngredients;
	    this.totalRecipeCalories = totalRecipeCalories;
	}
	
	public void printRecipe() { //method to print all instances of the recipe 
	    double singleServingCalories = totalRecipeCalories / servings;
	    System.out.println("Recipe: " + getRecipeName());
	    System.out.println("Serves: " + getServings());
	    System.out.println("Ingredients:");

	    for(int i = 0; i < recipeIngredients.size(); ++i) {
	        System.out.println(recipeIngredients.get(i));
	    }
	    System.out.println("Total Calories per serving: " + singleServingCalories);
	}
	
	
	public static void main(String[] args) {
		
	    double totalRecipeCalories = 0;
	    ArrayList<String> recipeIngredients = new ArrayList();
	    boolean addMoreIngredients = true;
	    Scanner scnr = new Scanner(System.in);

	    System.out.println("Please enter the recipe name: ");
	    String recipeName = scnr.nextLine();

	    System.out.println("How many servings: ");
	    int servings = scnr.nextInt();

	    do {//Loop to add new ingredients until user inputs end
	        System.out.println("Please enter the ingredient name" + 
	            " or type end if you are finished entering ingredients: ");
	        String ingredientName = scnr.next();
	        if (ingredientName.toLowerCase().equals("end")) {
	            addMoreIngredients = false;
	        } else {
	                //Add the ingredient name to recipeIngredients
	                recipeIngredients.add(ingredientName);

	            System.out.println("Please enter the ingredient amount: ");
	            float ingredientAmount = scnr.nextFloat();

	            System.out.println("Please enter the ingredient Calories: ");
	            int ingredientCalories = scnr.nextInt();

	            //Add the total Calories from this ingredient
	            totalRecipeCalories = ingredientCalories * ingredientAmount;
	        }

	   } while (addMoreIngredients) ;
	    //create new object recipe1 and use method printRecipe to display all properties of recipe
	    SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, 
	        servings, recipeIngredients, totalRecipeCalories);
	    recipe1.printRecipe();
	}
}
