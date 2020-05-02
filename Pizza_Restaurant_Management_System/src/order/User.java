package order;

import java.util.Scanner;

public class User {
	public void order() {
		
		boolean pizzaOrderIteration = true;
		
		while(pizzaOrderIteration) {
			System.out.println("Enter the type of Pizza");
			System.out.println("1. Veg Pizza");
			System.out.println("2. Non Veg Pizza");
			
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			
			switch(choice) {
				case 1:
					VegPizza vegPizza = new VegPizza();
					vegPizza.crustSelection();
					vegPizza.cheeseSelection();
					vegPizza.baseToppingSelection();;
					vegPizza.quantityOfPizza();
					System.out.println("Would you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj2 = new Scanner(System.in);
					int choice2 = obj.nextInt();
					
					if(choice2 == 1) {
						pizzaOrderIteration = true;
					}
					else {
						System.out.println(vegPizza.qCost);
						System.out.println("Thanks for using our services. Have a great day!!!");
						pizzaOrderIteration = false;
					}
					break;
				case 2:
					NonVegPizza nonVegPizza = new NonVegPizza();
					nonVegPizza.crustSelection();
					nonVegPizza.cheeseSelection();
					nonVegPizza.baseToppingSelection();
					nonVegPizza.quantityOfPizza();
					System.out.println("Would you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj3 = new Scanner(System.in);
					int choice3 = obj.nextInt();
					
					if(choice3 == 1) {
						pizzaOrderIteration = true;
					}
					else {
						System.out.println(nonVegPizza.qCost);
						System.out.println("Thanks for using our services. Have a great day!!!");
						pizzaOrderIteration = false;						
					}
					break;
			}
		}		
	}
}
