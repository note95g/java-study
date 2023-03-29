import java.util.Scanner;

public class mathGame {

	public static void main(String[] args) {
		int num1 = (int)System.currentTimeMillis()% 10;
		int num2 = (int)System.currentTimeMillis()*7 % 10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(num1 + "+" +num2+ " = ?");
		int answer = input.nextInt();
		if (answer == (num1 + num2))
			System.out.println("RIGHT!");
		else
			System.out.println("WRONG！！！");
		
		

	}

}
