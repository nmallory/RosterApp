
import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RosterApp {	
	
public static void main(String[] args) {
		
		//Create scanner
		Scanner console = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		//variables
		String choice ="yes";
		
		 //Declare an array that allocates 20 indexes for student name
	
		String[] studentArray = new String[20];
		
		studentArray[0] = "Nicole";
		studentArray[1] = "Armani";
		studentArray[2] = "Yasmine";
		studentArray[3] = "Tyler";
		studentArray[4] = "Daniel";
		studentArray[5] = "Dominique B";
		studentArray[6] = "David";
		studentArray[7] = "Dominique E";
		studentArray[8] = "Zalika";
		studentArray[9] = "Jennifer";
		studentArray[10] = "Johnny";
		studentArray[11] = "Kevin";
		studentArray[12] = "Mikhil";
		studentArray[13] = "Elle";
		studentArray[14] = "Clark";
		studentArray[15] = "Seth";
		studentArray[16] = "Kim D";
		studentArray[17] = "Ryan";
		studentArray[18] = "Jeseekia";
		studentArray[19] = "Tricia";
	
		 //Declare an array that allocates 20 indexes for student hometown
		String[] studentHometown = new String[20];
		
		studentHometown[0] = "Detroit";
		studentHometown[1] = "Detroit";
		studentHometown[2] = "Detroit";
		studentHometown[3] = "Monroe";
		studentHometown[4] = "Hamtramck";
		studentHometown[5] = "Detroit";
		studentHometown[6] = "Detroit";
		studentHometown[7] = "Detroit";
		studentHometown[8] = "Detroit";
		studentHometown[9] = "Detroit";
		studentHometown[10] = "Detroit";
		studentHometown[11] = "Detroit";
		studentHometown[12] = "Detroit";
		studentHometown[13] = "Detroit";
		studentHometown[14] = "Detroit";
		studentHometown[15] = "Detroit";
		studentHometown[16] = "Detroit";
		studentHometown[16] = "Detroit";
		studentHometown[18] = "Detroit";
		studentHometown[19] = "Detroit";
	
		 //Declare an array that allocates 20 indexes for favorite food 
		String[] studentFood = new String[20];
		
		studentFood[0] = "Mexican";
		studentFood[1] = "Salmon";
		studentFood[2] = "Pizza";
		studentFood[3] = "Tacos";
		studentFood[4] = "Chinese";
		studentFood[5] = "Pizza";
		studentFood[6] = "Steak";
		studentFood[7] = "Shrimp";
		studentFood[8] = "Pasta";
		studentFood[9] = "Italian";
		studentFood[10] = "Thai";
		studentFood[11] = "Tacos";
		studentFood[12] = "Chicken";
		studentFood[13] = "Salmon";
		studentFood[14] = "Pizza";
		studentFood[15] = "Salad";
		studentFood[16] = "Ice Cream";
		studentFood[17] = "Cheeseburgers";
		studentFood[18] = "Lasagna";
		studentFood[19] = "Mashed Potatoes";
		
	
		//Welcome message
		
		System.out.println("Welcome to our Java Class");
		do{
		// Prompt user to ask about a particular user
			
			System.out.println("Which student would you like to learn more about? (enter a number 1-20):");
			int number  = console.nextInt( );
			
		//Validate number entered to make sure it is within the array index
		if(number < 0 || number > studentArray.length){
			System.out.println("That student does not exist. Please try again. (enter a number 1-20:)");
			continue;
		}
			
		while(studentArray.length > 1) {
			System.out.println("Student "  + number + " is " + studentArray[number]);
			break;
			
		}
		
		while (studentHometown.length >1) {
		
			System.out.println("What would you like to know about " + studentArray[number] + "? (enter 'hometown' or 'favorite food'):");
			
			String input = sc.nextLine();
		
			
			//Validate input to ensure that hometown or favorite food is entered
			/*if(number < 0 || number > studentArray.length){
				System.out.println("TThat data does not exist. Please try again. (enter 'hometown' or 'favorite food':)");
				continue;
			}*/
			
			System.out.println(studentArray[number] + " is from " + studentHometown[number]);
		
			break;
			
		}
		
		while (studentFood.length >1) {
			System.out.println("Would you like to know more? (enter 'y' or 'n'):");
	
			String input = sc.nextLine();
			
			System.out.println(studentArray[number] + " loves " + studentFood[number]);
			
			break;
			
		}
		System.out.println("Would you like to find out about another student? (enter 'y' or 'n'):");

		String input = sc.nextLine();
		
	
		}while(!choice.equalsIgnoreCase("y"));
			
	}
}
				
		
		


		