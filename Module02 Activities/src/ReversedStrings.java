import java.util.Scanner;

public class ReversedStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string of text: ");
		
		String userInput = input.nextLine();
		input.close();
		
		String reversedInput = "";
		for (int i = 1; i < userInput.length() + 1; i++) {
			reversedInput += userInput.charAt(userInput.length() - i);
		}
		
		System.out.println("The reverse of " + userInput + " is " + reversedInput);
	}
}
