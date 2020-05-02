package order;


import java.util.LinkedHashMap;

public class IngredientsMap {
	public static LinkedHashMap<String, Integer> getCrustMap() {
		LinkedHashMap<String, Integer> crust = new LinkedHashMap<String, Integer>();
		crust.put("Wheat thin crust", 100);
		crust.put("Thick crust", 110);
		crust.put("Classic hand tossed", 120);
		
		return crust;
	}
	
	public static LinkedHashMap<String, Integer> getCheeseMap() {
		LinkedHashMap<String, Integer> cheese = new LinkedHashMap<String, Integer>();
		cheese.put("Single cheese", 15);
		cheese.put("Extra cheese", 30);
		cheese.put("No cheese", 0);
		
		return cheese;
	}
	
	public static LinkedHashMap<String, Integer> getVegBaseToppingMap() {
		LinkedHashMap<String, Integer> vegBaseTopping = new LinkedHashMap<String, Integer>();
		vegBaseTopping.put("Paneer", 50);
		vegBaseTopping.put("Capsicum", 30);
		vegBaseTopping.put("Corn", 40);
		
		return vegBaseTopping;
	}
	
	public static LinkedHashMap<String, Integer> getNonVegBaseToppingMap() {
		LinkedHashMap<String, Integer> nonvegBaseTopping = new LinkedHashMap<String, Integer>();
		nonvegBaseTopping.put("Chicken Sausage", 70);
		nonvegBaseTopping.put("BBQ Chicken", 80);
		nonvegBaseTopping.put("Chicken Salami", 90);
		
		return nonvegBaseTopping;
	}
}
