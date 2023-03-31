import java.util.Scanner;

public class mathGame2 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println(num1 + " - " + num2 +" =? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if((num1-num2)== answer) 
			System.out.println("RIGHT "+num1+"-"+num2 +"="+answer);
			else 
				System.out.println("WRONG "+num1+"-"+num2 +"="+(num1-num2));
			
		

	}

}
