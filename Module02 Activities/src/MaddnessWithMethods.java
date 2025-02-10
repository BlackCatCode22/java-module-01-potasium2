import java.util.Scanner;

public class MaddnessWithMethods {
	public static void main(String[] args) {
		System.out.println("Enter two non-decimal integers: ");
		int valueOne = getAnIntFromTheUser(false);
		int valueTwo = getAnIntFromTheUser(true);
		
		System.out.println("The larger of the two values is " + compareTwoInts(valueOne, valueTwo));
		System.out.println("The sum of " + valueOne + " and " + valueTwo + " is " + sumTwoInts(valueOne, valueTwo));
	}
	
	static int getAnIntFromTheUser(boolean closeInput) {
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		if (closeInput)
			input.close();
		
		return userInput;
	}
	
	static int compareTwoInts(int a, int b) {
		if (a > b)
			return a;
		return b;
	}
	
	static int sumTwoInts(int a, int b) {
		return a + b;
	}
}
