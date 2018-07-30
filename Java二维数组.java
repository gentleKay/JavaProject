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
//
