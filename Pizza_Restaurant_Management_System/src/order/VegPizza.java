package order;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map.Entry;

public class VegPizza {
	
	public int totalCost;
	ArrayList<Integer> qCost = new ArrayList<Integer>();
	
	//Crust selection
	public void crustSelection() {
		
		int crustCost = 0;
		String crustChoice = "";
		
		for( Entry<String, Integer> entry : IngredientsMap.getCrustMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
		
		Scanner sc = new Scanner(System.in);
		
		boolean crustChoicevalidation = false;
		while(!crustChoicevalidation) {
			System.out.println("Please enter your choice of crust: ");
			crustChoice = sc.nextLine();
			if(IngredientsMap.getCrustMap().containsKey(crustChoice)) {
				crustCost = IngredientsMap.getCrustMap().get(crustChoice);
				crustChoicevalidation = true;
			}
			else {
				crustChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + crustCost;
		System.out.println("Crust chosen: " + crustChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void cheeseSelection() {
		
		int cheeseCost = 0;
		String cheeseChoice = "";
		
		for( Entry<String, Integer> entry : IngredientsMap.getCheeseMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
		
		Scanner sc = new Scanner(System.in);
		
		boolean cheeseChoicevalidation = false;
		while(!cheeseChoicevalidation) {
			System.out.println("Please enter your choice of cheese: ");
			cheeseChoice = sc.nextLine();
			if(IngredientsMap.getCheeseMap().containsKey(cheeseChoice)) {
				cheeseCost = IngredientsMap.getCheeseMap().get(cheeseChoice);
				cheeseChoicevalidation = true;
			}
			else {
				cheeseChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + cheeseCost;
		System.out.println("Cheese chosen: " + cheeseChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void baseToppingSelection() {
		
		int vegBaseToppingCost = 0;
		String vegBaseToppingChoice = "";
		
		for( Entry<String, Integer> entry : IngredientsMap.getVegBaseToppingMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
		
		Scanner sc = new Scanner(System.in);
		
		boolean vegBaseToppingChoicevalidation = false;
		while(!vegBaseToppingChoicevalidation) {
			System.out.println("Please enter your choice of cheese: ");
			vegBaseToppingChoice = sc.nextLine();
			if(IngredientsMap.getVegBaseToppingMap().containsKey(vegBaseToppingChoice)) {
				vegBaseToppingCost = IngredientsMap.getVegBaseToppingMap().get(vegBaseToppingChoice);
				vegBaseToppingChoicevalidation = true;
			}
			else {
				vegBaseToppingChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + vegBaseToppingCost;
		System.out.println("Base topping chosen: " + vegBaseToppingChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void quantityOfPizza() {
		System.out.println("How many of these Pizza would you require: ");
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		totalCost = totalCost * choice;
		if(choice == 1) {
			System.out.println("You have opted for " + choice + " pizza");
		}
		else {
			System.out.println("You have opted for " + choice + " pizzas");
		}
		System.out.println("The cost of the aforementioned order is: " + totalCost);
		qCost.add(totalCost);
	}
}
