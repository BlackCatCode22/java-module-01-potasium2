import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int leftHandOperand = input.nextInt();
		int rightHandOperand = input.nextInt();
		
		int additionResult = leftHandOperand + rightHandOperand;
		int subtractionResult = leftHandOperand - rightHandOperand;
		int multiplicationResult = leftHandOperand * rightHandOperand;
		
		// I love ints not automatically being treated as floats or doubles when doing divison, its really cool!
		double divisonResult = Math.round(leftHandOperand * 10.0 / rightHandOperand * 10.0) / 100.0;
		
		System.out.println(leftHandOperand + " + " + rightHandOperand + " = " + additionResult);
		System.out.println(leftHandOperand + " - " + rightHandOperand + " = " + subtractionResult);
		System.out.println(leftHandOperand + " x " + rightHandOperand + " = " + multiplicationResult);
		System.out.println(leftHandOperand + " / " + rightHandOperand + " = " + divisonResult);
	}
}