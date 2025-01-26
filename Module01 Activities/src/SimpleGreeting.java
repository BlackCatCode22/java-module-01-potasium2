import java.util.Scanner;

public class SimpleGreeting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		
		String name = input.nextLine();
		input.close();
		
		System.out.println("Hello, " + name + ", it's lovely to meet you!");
	}
}