import java.util.Scanner;
public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number fo seconds: ");
		int secs = input.nextInt();
		int remsecs = secs % 60;
		int mins = secs/60;
		int hrs = mins /60;
		System.out.println(secs + " is " + hrs +":" + mins +":" + remsecs);

	}

}
