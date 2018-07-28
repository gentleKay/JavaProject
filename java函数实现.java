//两个数据相加之和
package hello;
import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(plus(x,y));
	}
	public static int plus( int a,int b) {
		return a+b;
	}
}
//键盘输入两个数，返回较大的值
package hello;
import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(max(x,y));
	}
	public static int max(int a ,int b) {
		return (a>b? a:b);
	}
}
//
