import java.util.Scanner;

// I wanted to do both Fahrenheit and Celsius cause I thought it would be more fun
// I hope this is still okay
public class TempConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Are you calculating from Fahrenheit or Celsius? (C/F): ");
		
		// Allows you to still type out "Fahrenheit" or "Celsius" and still calculate the proper value
		char tempType = input.nextLine().charAt(0);

		conversion(input, tempType);
		input.close();
	}
	
	public static void conversion(Scanner input, char tempType) {
		char[] validCharacters = {'f', 'c'};
		
		if (Character.toLowerCase(tempType) != validCharacters[0] && Character.toLowerCase(tempType) != validCharacters[1]) {
			System.out.println("You inputed an incorrect variable, please type either C or F: ");
			
			char reTemp = input.nextLine().charAt(0);
			conversion(input, reTemp);
		}
		
		System.out.println("Please enter the temperature you would like to calculate: ");
		int temperature = (int)input.nextDouble();
		
		if (Character.toLowerCase(tempType) == 'f') {
			double fahrToCel = (temperature - 32) * (5.0 / 9.0);
			fahrToCel = Math.round(fahrToCel * 100) / 100.0;
			
			System.out.println(temperature + " Fahrenheit is equivalent to roughly " + fahrToCel + " Celsius");
					
		} else if (Character.toLowerCase(tempType) == 'c') {
			double celToFahr = (temperature * (9.0 / 5.0)) + 32;
			celToFahr = Math.round(celToFahr * 100) / 100.0;
			
			System.out.println(temperature + " Celsius is equivalent to roughly " + celToFahr + " Fahrenheit");
					
		} else {
			System.out.println("edge case ??? cool, enter c or f: ");
			
			char reTemp = input.nextLine().charAt(0);
			conversion(input, reTemp);
		}
	}
}