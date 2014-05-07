import java.util.Scanner;

public class swithStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				
		Scanner input = new Scanner(System.in);		
		
		int option;			
	    String monthString;
	  		
		System.out.print("Hungry \n"); 
		System.out.print("Get in Line\n"); 
		System.out.print("Buy Lunch \n"); 
		
		System.out.print("Are you Thirsty? Please enter 1 if yes otherwise enter 2 ");
		option = input.nextInt();
		
		  switch (option) {
	       case 1:  monthString = "Buy a Coke";
	                break;
	       case 2:  monthString = "Get a Water";
	                break;	
	       default: monthString = "invalid number";
	       break;                  
	                	
	       }
	       System.out.println(monthString);
	       
	       System.out.print("Eat Lunch\n "); 
			System.out.print("Return Tray \n"); 
			System.out.print("Leave \n"); 
	   }

}


		
		
		
		
		
