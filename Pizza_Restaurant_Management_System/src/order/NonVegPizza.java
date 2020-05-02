package order;

import java.util.Scanner;
import java.util.Map.Entry;

public class NonVegPizza extends VegPizza {
	
	@Override
	public void baseToppingSelection() {
		int nonvegBaseToppingCost = 0;
		String nonvegBaseToppingChoice = "";
		
		for( Entry<String, Integer> entry : IngredientsMap.getNonVegBaseToppingMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
		
		Scanner sc = new Scanner(System.in);
		
		boolean nonvegBaseToppingChoicevalidation = false;
		while(!nonvegBaseToppingChoicevalidation) {
			System.out.println("Please enter your choice of cheese: ");
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
		System.out.println("Base topping chosen: " + nonvegBaseToppingChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
}
