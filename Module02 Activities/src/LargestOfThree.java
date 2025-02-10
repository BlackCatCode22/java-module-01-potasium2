import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three non-decimal integers: ");
		
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		int valueThree = input.nextInt();
		
		int largest;
		if (valueTwo > valueOne) {
			largest = valueTwo;
			if (valueThree > valueTwo) {
				largest = valueThree;
			}
		} else {
			largest = valueOne;
			if (valueThree > valueOne) {
				largest = valueThree;
			}
		}
		
		System.out.println("The largest of the three values is " + largest);
		input.close();
	}
}
