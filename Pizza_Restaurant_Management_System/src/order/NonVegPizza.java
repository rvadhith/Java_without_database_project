package order;

import java.util.Scanner;
import java.util.Map.Entry;

public class NonVegPizza extends VegPizza {
	
	@Override
	public void baseToppingSelection() {
		int nonvegBaseToppingCost = 0;
		String nonvegBaseToppingChoice = "";
		
		System.out.println("\nFollowing are the available types of non veg base toppings along with their price: ");
		IngredientsMap.printNonVegBaseToppingMap();
		
		Scanner sc = new Scanner(System.in);
		
		boolean nonvegBaseToppingChoicevalidation = false;
		while(!nonvegBaseToppingChoicevalidation) {
			System.out.println("\nPlease enter your choice of base topping: ");
			nonvegBaseToppingChoice = sc.nextLine();
			if(IngredientsMap.getNonVegBaseToppingMap().containsKey(nonvegBaseToppingChoice)) {
				nonvegBaseToppingCost = IngredientsMap.getNonVegBaseToppingMap().get(nonvegBaseToppingChoice);
				nonvegBaseToppingChoicevalidation = true;
			}
			else {
				nonvegBaseToppingChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + nonvegBaseToppingCost;
		System.out.println("\nBase topping chosen: " + nonvegBaseToppingChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
}
