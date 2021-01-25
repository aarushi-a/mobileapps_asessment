import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Robot {
	
//Methods required: taking order (from Table), delivering order (chef), bring food (table)
// Running tab for each table 

	 public static void main(String[] args){

	//create menu
		 Hashtable <String, Integer> menu = new Hashtable<String, Integer >();   //integer is the price
			
		 menu.put("padthai", 11);
		 menu.put("redcurry", 9);
		 menu.put("whiterice", 4);
		 menu.put("friedrice", 10);
		 menu.put("icedtea", 4);
		 
		  
	      Scanner scanner = new Scanner(System.in);
	
	   //greet customers and take order 
	   System.out.println("Hello! Welcome to Aarushi's Cafe!");
	   System.out.println("Would you like to see a Menu? Respond Y or N ");
	      
	   String see_menu = scanner.next();
	      if (see_menu.contains("Y")){
	    	  System.out.println(menu);
	      }
	      else {
	    	  System.out.println("Okay, you may leave then :( ");
	    	  System.exit(0);
	      }
	        
	   System.out.println("Enter in the food you would like to order one by one, and enter 'done' once done");
	   String food = scanner.next();
	   ArrayList<String> order = new ArrayList<>();
		order.add(food);
	   
		while (!food.equals("done")) {
		  food = scanner.next();
		order.add(food);
	   }

		System.out.println("Thanks for your order, I'll be back soon! ");
		
	//to calculate total
	
	//
	
	
}
}
