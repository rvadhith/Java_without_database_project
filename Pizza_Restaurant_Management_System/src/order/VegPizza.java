package order;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map.Entry;

public class VegPizza {
	
	public int totalCost;
	static ArrayList<Integer> qCost = new ArrayList<Integer>();
	
	
	//Crust selection
	public void crustSelection() {
		
		int crustCost = 0;
		String crustChoice = "";
		
		System.out.println("\nFollowing are the available types of crust along with their price: ");
		IngredientsMap.printCrustMap();
		
		Scanner sc = new Scanner(System.in);
		
		boolean crustChoicevalidation = false;
		while(!crustChoicevalidation) {
			System.out.println("\nPlease enter your choice of crust: ");
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
		System.out.println("\nCrust chosen: " + crustChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void cheeseSelection() {
		
		int cheeseCost = 0;
		String cheeseChoice = "";
		
		System.out.println("\nFollowing are the available choice of cheese along with their price: ");
		IngredientsMap.printCheeseMap();
		
		Scanner sc = new Scanner(System.in);
		
		boolean cheeseChoicevalidation = false;
		while(!cheeseChoicevalidation) {
			System.out.println("\nPlease enter your choice of cheese: ");
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
		System.out.println("\nCheese chosen: " + cheeseChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void baseToppingSelection() {
		
		int vegBaseToppingCost = 0;
		String vegBaseToppingChoice = "";
		
		System.out.println("\nFollowing are the available types of veg base toppings along with their price: ");
		IngredientsMap.printVegBaseToppingMap();
		
		Scanner sc = new Scanner(System.in);
		
		boolean vegBaseToppingChoicevalidation = false;
		while(!vegBaseToppingChoicevalidation) {
			System.out.println("\nPlease enter your choice of base topping: ");
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
		System.out.println("\nBase topping chosen: " + vegBaseToppingChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void quantityOfPizza() {
		System.out.println("\nHow many of these Pizza would you require: ");
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		totalCost = totalCost * choice;
		if(choice == 1) {
			System.out.println("\nYou have opted for " + choice + " pizza of this type");
		}
		else {
			System.out.println("\nYou have opted for " + choice + " pizzas of this type");
		}
		System.out.println("\nThe cost of the aforementioned order is: " + totalCost);
		qCost.add(totalCost);
	}
	public int overallCost() {
		int overallCost = 0;
		int i;
		
		for (i = 0; i < qCost.size(); i++) {
			overallCost +=  qCost.get(i);
		}
             
		return overallCost;
	}
}
