package order;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Admin {
	public void adminPanel() throws IOException {
		System.out.println("\n");
		System.out.println("1. View Ingredients and Prices");
		System.out.println("2. Change the price of ingredients");
		System.out.println("3. Add Ingredients");
		System.out.println("4. Delete Ingredients");
		System.out.println("5. Logout");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			viewIngredientsAndPrice();
			break;
		case 2:
			ingredientsPriceChange();
			break;	
		case 3:
			ingredientsAddition();
			break;
		case 4:
			ingredientsDeletion();
			break;
		case 5:
			Options option = new Options();
			option.homeScreen();
			break;
		}		
	}
	

	public void ingredientsPriceChange() throws IOException {
		System.out.println("\nSelect the ingredients for which the price is to be changed");
		System.out.println("1. Crust");
		System.out.println("2. Cheese");
		System.out.println("3. Veg base topping");
		System.out.println("4. Non Veg base topping");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String crustKey = "";
			int newCrustCost = 0;
			
			IngredientsMap.printCrustMap();
			
			System.out.println("\nEnter the crust for which the price should be modified: ");
			crustKey = br.readLine();
			System.out.println("Enter the new price: ");
			newCrustCost = Integer.parseInt(br.readLine());
			IngredientsMap.crustMap.replace(crustKey, newCrustCost);
			System.out.println("\nThe modified cost of " + crustKey + " is " + IngredientsMap.getCrustMap().get(crustKey));
			adminPanel();
			break;
		case 2:
			String cheeseKey = "";
			int newCheeseCost = 0;
			
			IngredientsMap.printCheeseMap();
			
			System.out.println("\nEnter the cheese for which the price should be modified: ");
			cheeseKey = br.readLine();
			System.out.println("Enter the new price: ");
			newCheeseCost = Integer.parseInt(br.readLine());
			IngredientsMap.cheeseMap.replace(cheeseKey, newCheeseCost);
			System.out.println("\nThe modified cost of " + cheeseKey + " is " + IngredientsMap.getCheeseMap().get(cheeseKey));
			adminPanel();
			break;
		case 3:
			String vegBaseToppingKey = "";
			int newVegBaseToppingCost = 0;
			
			IngredientsMap.printVegBaseToppingMap();
			
			System.out.println("\nEnter the veg base topping for which the price should be modified: ");
			vegBaseToppingKey = br.readLine();
			System.out.println("Enter the new price: ");
			newVegBaseToppingCost = Integer.parseInt(br.readLine());
			IngredientsMap.vegBaseToppingMap.replace(vegBaseToppingKey, newVegBaseToppingCost);
			System.out.println("\nThe modified cost of " + vegBaseToppingKey + " is " + IngredientsMap.getVegBaseToppingMap().get(vegBaseToppingKey));
			adminPanel();
			break;
		case 4:
			String nonVegBaseToppingKey = "";
			int newNonVegBaseToppingCost = 0;
			
			IngredientsMap.printNonVegBaseToppingMap();
			
			System.out.println("\nEnter the non veg base topping for which the price should be modified: ");
			nonVegBaseToppingKey = br.readLine();
			System.out.println("Enter the new price: ");
			newNonVegBaseToppingCost = Integer.parseInt(br.readLine());
			IngredientsMap.nonVegBaseToppingMap.replace(nonVegBaseToppingKey, newNonVegBaseToppingCost);
			System.out.println("\nThe modified cost of " + nonVegBaseToppingKey + " is " + IngredientsMap.getNonVegBaseToppingMap().get(nonVegBaseToppingKey));
			adminPanel();
			break;
		}		
	}
	
	public void ingredientsAddition() throws IOException {
		System.out.println("Select the ingredients to which addition is to made");
		System.out.println("1. Crust");
		System.out.println("2. Cheese");
		System.out.println("3. Veg base topping");
		System.out.println("4. Non Veg base topping");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String crustKey = "";
			int newCrustCost = 0;
			
			IngredientsMap.printCrustMap();
			
			System.out.println("\nEnter the new crust type: ");
			crustKey = br.readLine();
			System.out.println("Enter the price for new crust type: ");
			newCrustCost = Integer.parseInt(br.readLine());
			IngredientsMap.crustMap.put(crustKey, newCrustCost);
			System.out.println("\nThe crust type " + crustKey + " has been added with the price of " + IngredientsMap.getCrustMap().get(crustKey));
			adminPanel();
			break;
		case 2:
			String cheeseKey = "";
			int newCheeseCost = 0;
			
			IngredientsMap.printCheeseMap();
			
			System.out.println("\nEnter the new cheese type: ");
			cheeseKey = br.readLine();
			System.out.println("Enter the new price: ");
			newCheeseCost = Integer.parseInt(br.readLine());
			IngredientsMap.cheeseMap.put(cheeseKey, newCheeseCost);
			System.out.println("\nThe cheese type " + cheeseKey + " has been added with the price of " + IngredientsMap.getCheeseMap().get(cheeseKey));
			adminPanel();
			break;
		case 3:
			String vegBaseToppingKey = "";
			int newVegBaseToppingCost = 0;
			
			IngredientsMap.printVegBaseToppingMap();
			
			System.out.println("\nEnter the new veg base topping: ");
			vegBaseToppingKey = br.readLine();
			System.out.println("Enter the new price: ");
			newVegBaseToppingCost = Integer.parseInt(br.readLine());
			IngredientsMap.vegBaseToppingMap.put(vegBaseToppingKey, newVegBaseToppingCost);
			System.out.println("\nThe veg base topping " + vegBaseToppingKey + " has been added with the price of " + IngredientsMap.getVegBaseToppingMap().get(vegBaseToppingKey));
			adminPanel();
			break;
		case 4:
			String nonVegBaseToppingKey = "";
			int newNonVegBaseToppingCost = 0;
			
			IngredientsMap.printNonVegBaseToppingMap();
			
			System.out.println("\nEnter the new non veg base topping: ");
			nonVegBaseToppingKey = br.readLine();
			System.out.println("Enter the new price: ");
			newNonVegBaseToppingCost = Integer.parseInt(br.readLine());
			IngredientsMap.nonVegBaseToppingMap.put(nonVegBaseToppingKey, newNonVegBaseToppingCost);
			System.out.println("\nThe nonveg base topping " + nonVegBaseToppingKey + " has been added with the price of " + IngredientsMap.getNonVegBaseToppingMap().get(nonVegBaseToppingKey));
			adminPanel();
			break;
		}		
	}
	
	public void ingredientsDeletion() throws IOException {
		System.out.println("Select the ingredient from which deletion has to be done");
		System.out.println("1. Crust");
		System.out.println("2. Cheese");
		System.out.println("3. Veg base topping");
		System.out.println("4. Non Veg base topping");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String crustKey = "";
			
			IngredientsMap.printCrustMap();
			
			System.out.println("\nEnter the crust type to be deleted: ");
			crustKey = br.readLine();
			IngredientsMap.crustMap.remove(crustKey);
			System.out.println("\nThe crust type " + crustKey + " has been deleted");
			adminPanel();
			break;
		case 2:
			String cheeseKey = "";
			
			IngredientsMap.printCheeseMap();
			
			System.out.println("\nEnter the cheese type to be deleted: ");
			cheeseKey = br.readLine();
			IngredientsMap.cheeseMap.remove(cheeseKey);
			System.out.println("\nThe cheese type " + cheeseKey + " has been deleted");
			adminPanel();
			break;
		case 3:
			String vegBaseToppingKey = "";
			
			IngredientsMap.printVegBaseToppingMap();
			
			System.out.println("\nEnter the veg base topping to be deleted: ");
			vegBaseToppingKey = br.readLine();
			IngredientsMap.vegBaseToppingMap.remove(vegBaseToppingKey);
			System.out.println("\nThe veg base topping " + vegBaseToppingKey + " has been deleted");
			adminPanel();
			break;
		case 4:
			String nonVegBaseToppingKey = "";
			
			IngredientsMap.printNonVegBaseToppingMap();
			
			System.out.println("\nEnter the non veg base topping to be deleted: ");
			nonVegBaseToppingKey = br.readLine();
			IngredientsMap.nonVegBaseToppingMap.remove(nonVegBaseToppingKey);
			System.out.println("\nThe nonveg base topping " + nonVegBaseToppingKey + " has been deleted");
			adminPanel();
			break;
		}		
	}
	
	
	public void viewIngredientsAndPrice() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nSelect the ingredients to be viewed");
		System.out.println("1. Crust");
		System.out.println("2. Cheese");
		System.out.println("3. Veg base topping");
		System.out.println("4. Non Veg base topping");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			IngredientsMap.printCrustMap();
			adminPanel();
			break;
		case 2:
			IngredientsMap.printCheeseMap();
			adminPanel();
			break;
		case 3:
			IngredientsMap.printVegBaseToppingMap();
			adminPanel();
			break;
			
		case 4:
			IngredientsMap.printNonVegBaseToppingMap();
			adminPanel();
			break;
		}
	}
}
