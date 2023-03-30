import java.util.Scanner;

public class bigger1IN2Int {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入两个整数：a,b,c（以空格隔开）");
		/*比较两个数的大小*/
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max;
		if(a >= b && a>=c){
			System.out.println("最大值为"+a);
		}
		else if(b>=c&& b>=a){
			System.out.println("最大值为"+b);
		}
		else if(c>=a&& c >=b) {
			System.out.println("最大值为"+c);
			
		}
		else
			System.out.println("error");
		
	 }
}
