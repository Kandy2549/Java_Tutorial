package com.kandy.stackoverflow;

import java.util.ArrayList;
import java.util.Scanner;

public class SteppingStone6_RecipeBox {

	
	/**
	 * @param args the command line arguments
	 */

	private ArrayList<SteppingStone5_Recipe> listOfRecipes;

	/**
	 * @param args the command line arguments
	 */
	/**
	 * @return the listOfRecipes
	 */
	public ArrayList<SteppingStone5_Recipe> getListOfRecipes() {
	    return listOfRecipes;
	}

	/**
	 * @param listOfRecipes the listOfRecipes to set
	 */
	public void setListOfRecipes(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
	    this.listOfRecipes = listOfRecipes;
	}

	public SteppingStone6_RecipeBox() {
	    this.listOfRecipes = new ArrayList();
	}

	public SteppingStone6_RecipeBox(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
	    this.listOfRecipes = listOfRecipes;
	}

	public void printAllRecipeDetails(String selectedRecipeName) {
	    for (int i = 0; i < listOfRecipes.size(); i++) {
	        if (!listOfRecipes.get(i).getRecipeName().equals(selectedRecipeName)) {
	        } else {
	            listOfRecipes.get(i).printRecipe();
	        }
	    }
	}

	public void printAllRecipeNames() {
	    for (SteppingStone5_Recipe currentRecipe : listOfRecipes) {
	        System.out.println(currentRecipe.getRecipeName());
	    }
	}

	public void addNewRecipe() {
	    // 
	    //Note: the next line only functions once the SteppingStone5_Recipe
	    //class "main" method has been replaced with:
	    //      public SteppingStone5_Recipe addNewRecipe()
	    //
	    //and the method is set to return new Recipe instead of printing it out
	    //

	    //listOfRecipes.add(new SteppingStone5_Recipe().createNewRecipe());
	}

	public static void main(String[] args) {
	    SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox();
	    Scanner menuScnr = new Scanner(System.in);
	    System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");

	    while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
	        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print  All Recipe Names\n" + "\nPlease select a menu item:");
	        int input = menuScnr.nextInt();
	        if (input == 1) {
	            myRecipeBox.addNewRecipe();
	        } else if (input == 2) {
	            System.out.println("Which recipe?\n");
	            String selectedRecipeName = menuScnr.next();
	            myRecipeBox.printAllRecipeDetails(selectedRecipeName);
	        } else if (input == 3) {
	            for (int j = 0; j < myRecipeBox.listOfRecipes.size(); j++) {
	                System.out.println((j + 1) + ": " + 
	                myRecipeBox.listOfRecipes.get(j).getRecipeName());
	            }
	        } else {
	            System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
	        }
	        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");

	     }
	  }

}
