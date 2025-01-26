import java.util.Scanner;

public class FavoriteNumber {
	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Favorite Number: ");
		
		int faveNumber = input.nextInt();
		System.out.println("The number " + faveNumber + " is pretty neat!");
		System.out.println("My favorite number is " + randomNumber);
		
		int squaredSum = (int)Math.pow(faveNumber + randomNumber, 2);
		System.out.println("Did you know the square of our numbers sum is " + squaredSum); // idk I got bored
		
		input.close();
	}
}