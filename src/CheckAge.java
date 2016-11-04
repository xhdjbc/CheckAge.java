import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userAge;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		userAge = userInput.nextInt();
		
		userInput.close();
		
		if(userAge < 18){
		
			System.out.print("\nYou're still a child! Come back when you're older...");
			
		} else if(userAge >= 18) {
			
			System.out.println("\nYou're an adult! Congratulations on making it this far!");
			
			if(userAge >= 55){
				
				System.out.println("You're also a senior citizen! Kudos to you for knowing "
						+ "how to use a program like this!\nAlso, I'm very jealous of the"
						+ " fact that you can order smaller portions at a reduced rate at "
						+ "most restaurants...");
				
			}
			
		}

	}

}
