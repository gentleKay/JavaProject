/*
Scanner类：
常用的两个方法：
   public int nextInt():获取一个int类型的值；
   public String nextLine():获取一个String类型的值。
*/
//简单的使用Scanner类。
package common_object;

import java.util.Scanner;

public class DemoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {                    // 加入 if {} else {} 语句 使程序更加的完善。
			int a = sc.nextInt();
			System.out.println("a = "+ a);
		}else {
			System.out.println("输入有误！");
		}
	}
}
//有一个注意事项。
/*先获取一个数值在获取一个字符串，会出现问题。
   主要原因：换行符号的问题。
      解决:
          A.先获取一个数值后，在创建新的键盘录入对象。
          B.把所有的数据都先按字符串获取，然后要什么，你就对应转换成什么。
*/
package common_object;

import java.util.Scanner;

public class DemoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//System.out.println("a = "+ a + ",b = " + b);
		System.out.println("---------------");
		//String s1 = sc.nextLine();
		//String s2 = sc.nextLine();
		//System.out.println("s1 = "+s1+",s2 = "+s2);
		System.out.println("---------------");
		//String s1 = sc.nextLine();
		//int a = sc.nextInt();
		//System.out.println("s1 = "+s1+",a = " +a);
		System.out.println("---------------");
		int a = sc.nextInt();                        	/*-=---------------------------------------
		String s1 = sc.nextLine();			/*先获取一个数值在获取一个字符串，会出现问题。
		System.out.println("a = "+a+",s1 = " +s1);	/*----------------------------------------
	}
}
