package order;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;

public class Admin {
	public void adminPanel() throws IOException {
		System.out.println("1. View Ingredients and Prices");
		System.out.println("2. Change the price of ingredients");
		System.out.println("3. Update Ingredients");
		System.out.println("4. Delete Ingredients");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			viewIngredientsAndPrice();
			break;
		case 2:
			ingredientsPriceChange();
			break;	
		}		
	}
	
	public void ingredientsPriceChange() throws IOException {
		System.out.println("Select the ingredients for which the price is to be changed");
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
			int updatedPrice = 0;
			for( Entry<String, Integer> entry : IngredientsMap.getCrustMap().entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue());
			}
			System.out.println("Enter the crust for which the price should be modified: ");
			crustKey = br.readLine();
			System.out.println("Enter the new price: ");
			updatedPrice = Integer.parseInt(br.readLine()); 
			//IngredientsMap.getCrustMap().replace(crustKey, updatedPrice);
			IngredientsMap map = new IngredientsMap();
			map.getCrustMap().replace(crustKey, updatedPrice);
			for( Entry<String, Integer> entry : IngredientsMap.getCrustMap().entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue());
			}
			System.out.println(IngredientsMap.getCrustMap().get(crustKey));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void viewIngredientsAndPrice() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the ingredients to be viewed");
		System.out.println("1. Crust");
		System.out.println("2. Cheese");
		System.out.println("3. Veg base topping");
		System.out.println("4. Non Veg base topping");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			for( Entry<String, Integer> entry : IngredientsMap.getCrustMap().entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue() );
			}
			adminPanel();
			break;
		case 2:
			for( Entry<String, Integer> entry : IngredientsMap.getCheeseMap().entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue() );
			}
			adminPanel();
			break;
		case 3:
			for( Entry<String, Integer> entry : IngredientsMap.getVegBaseToppingMap().entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue() );
			}
			adminPanel();
			break;
			
		case 4:
			for( Entry<String, Integer> entry : IngredientsMap.getNonVegBaseToppingMap().entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue() );
			}
			adminPanel();
			break;
		}
	}
}
