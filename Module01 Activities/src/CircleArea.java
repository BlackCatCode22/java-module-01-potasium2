import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		
		int radius = input.nextInt();
		double circleArea = Math.PI * Math.pow(radius, 2);
		double approximateArea = Math.round(circleArea * 100) / 100.0; // Round to two decimals so there aren't up to 10^-15 levels of precision
		
		System.out.println("The area of a circle with the given radius: " + radius + " is roughly " + approximateArea);
		input.close();
	}
}