package First5weeks;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {

		double radius;
		radius = 20;
		double pi;
		pi = 3.14159;
		double area;
		area = radius * radius * pi;

		System.out.println("The area for the circle of radius " + radius + " is " + area);
		// The area for the circle of radius 20.0 is 1256.636

		System.out.println(" =================== ");

		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;
		System.out.println("j is " + j + " and k is " + k);
		// j is 101.0 and k is 100.0

		System.out.println(" =============== ");

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius1 = input.nextDouble();

		// Compute area
		double area1 = radius1 * radius1 * 3.14159;

		// Display results

	}

}
