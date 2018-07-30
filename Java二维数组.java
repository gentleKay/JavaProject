//二维数组的地址初始值探索。
package hello;
//import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
	}
}
//二维数组所有值之和。
package hello;
//import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		int i,j;
		for (i=0;i<arr.length;i++)
		{
			for (j=0;j<arr[i].length;j++)
			{
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
//杨辉三角。
package hello;
import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入阶数：");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int i,j;
		for (i=0;i<arr.length;i++)
		{
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		if (n > 2)
		{
			for (i=2;i<arr.length;i++)
			{
				for (j=1;j<=i;j++)
				{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		for (i=0;i<arr.length;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
//------------------------------------------------------------------------------
//java中参数传递形式：
//基本类型：形式参数的改变对实际参数没有影响。——————————————普通的变量 a,b,c.....
//引用类型：形式参数的改变直接影响实际参数。————————————数组 int[] arr ......
//------------------------------------------------------------------------------
//加密； 将输入8位数以内的数字，进行操作赋值给数组，并且倒序输出。
package hello;
import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入密码：");
		int n = sc.nextInt();
		//int n = 123456;
		int index = 0;
		int[] arr = new int[8];
		int i,j,k;
		while(n > 0)
		{
			arr[index] = n%10;
			index++;
			n /= 10;
		}
		System.out.print("加密后的密码:");
		for (i=0;i<index;i++)
		{
			System.out.print(arr[i]);
		}
		sc.clode();
	}
}
//利用函数进行编写，其中要注意的是：数组在函数中的返回值类型应该为 String 字符串，利用＋ 号相连接。
package hello;
import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入密码：");
		int n = sc.nextInt();
		String result = jiami(n);
		System.out.print("加密后的密码:"+result);
		sc.close();
	}
	public static String jiami(int n) {
		int index = 0;
		int i;
		String s = "";
		int[] arr = new int[8];
		while(n > 0)
		{
			arr[index] = n%10;
			index++;
			n /= 10;
		}
		
		for (i=0;i<index;i++)
		{
			s += arr[i];
		}
		return s;
	}
}
