import java.util.Scanner;
public class bigger1IN2Int {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("请依次输入两个整数：a,b（以空格隔开）");
	/*比较两个数的大小*/
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int max;
	if(a >= b){
		max = a;
	}
	else {
		max = b;
	}
	System.out.println("最大值为: "+max);
 }
}

