//for 循环水仙花数
package hello;
import java.util.Scanner;
public class world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x; int a,b,c;int i=0;
		for (x=100;x<1000;x++)
		{
			a = x%10;     //个位
			b = x/10%10;  //十位
			c = x/100%10; //百位
			if (x == (a*a*a + b*b*b + c*c*c))
			{
				System.out.println(x);
				i++;
			}
		}System.out.println(i);
	}
}
//--------------------------------------------
//
