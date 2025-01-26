import java.util.Scanner;

public class CharDetails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Letter, Number or Symbol: ");
		
		String character = input.nextLine();
		input.close();
		
		System.out.println("The Unicode value of the given character '" + character.charAt(0) + "' is " + character.codePointAt(0));
	}
}