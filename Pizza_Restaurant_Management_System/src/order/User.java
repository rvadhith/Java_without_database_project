package order;

import java.util.Scanner;

public class User {
	private VegPizza vegPizza;
	private NonVegPizza nonVegPizza;
	
	public void order() {
		
		boolean pizzaOrderIteration = true;
		
		
		while(pizzaOrderIteration) {
			System.out.println("\nEnter the type of Pizza");
			System.out.println("1. Veg Pizza");
			System.out.println("2. Non Veg Pizza");
			
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			
			switch(choice) {
				case 1:
					vegPizza = new VegPizza();
					vegPizza.crustSelection();
					vegPizza.cheeseSelection();
					vegPizza.baseToppingSelection();;
					vegPizza.quantityOfPizza();
					System.out.println("\nWould you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj2 = new Scanner(System.in);
					int choice2 = obj.nextInt();
					
					if(choice2 == 1) {
						pizzaOrderIteration = true;
					}
					else {
						System.out.println("\nThanks for using our services. Have a great day!!!");
						System.out.println("The overall cost of your order is " + vegPizza.overallCost());
						pizzaOrderIteration = false;
					}
					break;
				case 2:
					nonVegPizza = new NonVegPizza();
					nonVegPizza.crustSelection();
					nonVegPizza.cheeseSelection();
					nonVegPizza.baseToppingSelection();
					nonVegPizza.quantityOfPizza();
					System.out.println("\nWould you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj3 = new Scanner(System.in);
					int choice3 = obj.nextInt();
					
					if(choice3 == 1) {
						pizzaOrderIteration = true;
					}
					else {
						System.out.println("\nThanks for using our services. Have a great day!!!");
						System.out.println("The overall cost of your order is " + nonVegPizza.overallCost());
						pizzaOrderIteration = false;						
					}
					break;
			}
		}		
	}
}
