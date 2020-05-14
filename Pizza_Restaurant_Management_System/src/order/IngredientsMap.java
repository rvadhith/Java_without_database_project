package order;


import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class IngredientsMap {
	
	public static LinkedHashMap<String, Integer> crustMap = new LinkedHashMap<String, Integer>() {{ 
        put("Wheat thin crust", 100); 
        put("Thick crust", 110); 
        put("Classic Hand Tossed", 120); 
    }};
    
    public static LinkedHashMap<String, Integer> getCrustMap() {
    	return crustMap;
    }
    
    public static void printCrustMap() {
    	for( Entry<String, Integer> entry : getCrustMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> cheeseMap = new LinkedHashMap<String, Integer>() {{ 
        put("Single cheese", 15); 
        put("Extra cheese", 30); 
        put("No cheese", 0); 
    }};
    
    public static LinkedHashMap<String, Integer> getCheeseMap() {
    	return cheeseMap;
    }
	
    public static void printCheeseMap() {
    	for( Entry<String, Integer> entry : getCheeseMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> vegBaseToppingMap = new LinkedHashMap<String, Integer>() {{ 
        put("Paneer", 50); 
        put("Capsicum", 30); 
        put("Corn", 40); 
    }};
    
    public static LinkedHashMap<String, Integer> getVegBaseToppingMap() {
    	return vegBaseToppingMap;
    }
    
    public static void printVegBaseToppingMap() {
    	for( Entry<String, Integer> entry : getVegBaseToppingMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> nonVegBaseToppingMap = new LinkedHashMap<String, Integer>() {{ 
        put("Chicken Sausage", 70); 
        put("BBQ Chicken", 80); 
        put("Chicken Salami", 90); 
    }};
    
    public static LinkedHashMap<String, Integer> getNonVegBaseToppingMap() {
    	return nonVegBaseToppingMap;
    }
    
    public static void printNonVegBaseToppingMap() {
    	for( Entry<String, Integer> entry : getNonVegBaseToppingMap().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
}
