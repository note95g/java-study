import java.util.Scanner;

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		final double pi = 3.14159;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * pi;
		System.out.println("The area for radius " + 
		radius + " is " + area);

	}

}
