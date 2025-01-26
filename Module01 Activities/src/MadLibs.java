import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Name: ");
		String descriptiveName = input.nextLine();
		
		System.out.println("Enter an Adjective: ");
		String descriptiveAdjective = input.nextLine();
		
		System.out.println("Enter an Occupation: ");
		String descriptiveOccupation = input.nextLine();
		
		System.out.println("Enter Some Landscape: "); // <- Rough Wording
		String descriptiveTerrain = input.nextLine();
		
		System.out.println("Enter a Place: ");
		String descriptivePlace = input.nextLine();
		
		System.out.println("Enter Two Items: ");
		String descriptiveItem1 = input.nextLine();
		String descriptiveItem2 = input.nextLine();
		
		System.out.println("The case of the missing " + descriptiveItem1 + " Part 1"); // I'm only doing this short section
		System.out.println("It was a " + descriptiveAdjective + " morning when Detective " + descriptiveName + ", received a call about a missing " + descriptiveItem1 + ".");
		System.out.println("The owner of the " + descriptiveItem1 + " was a wealthy " + descriptiveOccupation + ", who lived in a huge " + descriptivePlace + " at the edge of the " + descriptiveTerrain + ".");
		System.out.println("Detective " + descriptiveName + " grabbed their trusty " + descriptiveItem2 + " and set off to solve the case.");
	}
}