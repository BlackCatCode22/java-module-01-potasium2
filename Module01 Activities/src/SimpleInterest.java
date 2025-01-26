import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The Amount Invested: ");
		int principal = input.nextInt();
		
		System.out.println("Enter The Interest Rate (In Percent): ");
		double interestRate = input.nextDouble();
		
		System.out.println("Enter The Amount of Time Investment is Saved (In Months): ");
		int term = input.nextInt();
		
		input.close();
		
		double totalInterest = principal * (interestRate / 100.0) * (term / 12);
		double endBalance = principal + totalInterest;
		
		System.out.println("The total interest accumulated is: " + totalInterest);
		System.out.println("The end balance is: " + endBalance);
	}
}