// 私有变量。 只能在定义的那个类中进行调用，但在其他的类中不能调用，若要调用的话，一定要写一个public 函数。
package hello;

class Stu{
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
}
public class Student{
	public static void main(String[] args) {
		Stu stu = new Stu();
		stu.setName("GSK");
		stu.setAge(22);
		System.out.println(stu.getName()+" "+stu.getAge());
	}
}
//this:是当前类的对象引用，简单的记，它就代表当前类的一个对象。
//注意： 谁调用了这个方法，在该方法内部的 this 就代表谁。
//this的场景：解决局部变量  隐藏成员变量。
package hello;

class Stu{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
public class Student{
	public static void main(String[] args) {
		Stu stu = new Stu();
		stu.setName("GSK");
		stu.setAge(22);
		System.out.println(stu.getName()+" "+stu.getAge());
	}
}
// 私有变量，必须要用函数 且用 参数 进行调用。
package hello;
import java.util.Scanner;
class Dome{
	private int Long;
	private int Wide;
	
	public int Perimeter(int Long,int Wide) {
		return 2*(Long+Wide);
	}
	public int Area(int Long,int Wide) {
		return Long*Wide;
	}
}
public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入长：");
		int L = sc.nextInt();
		System.out.print("请输入宽：");
		int W = sc.nextInt();
		Dome d = new Dome();
		//d.Long = L;
		//d.Wide = W;
		int P = d.Perimeter(L,W);
		int S = d.Area(L,W);
		System.out.println("周长："+ P);
		System.out.println("面积："+ S);
	}
}
//键盘输入长宽，计算它的周长和面积，要用面向对象的方法。
package hello;
import java.util.Scanner;
class Dome{
	int Long;
	int Wide;
	
	public int Perimeter() {
		return 2*(Long+Wide);
	}
	public int Area() {
		return Long*Wide;
	}
}
public class Student{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入长：");
		int L = sc.nextInt();
		System.out.print("请输入宽：");
		int W = sc.nextInt();
		Dome d = new Dome();
		d.Long = L;
		d.Wide = W;
		int P = d.Perimeter();
		int S = d.Area();
		System.out.println("周长："+ P);
		System.out.println("面积："+ S);
	}
}
//Math类中的一个函数random， public static double random(): 返回带正号的 double 值，该值 大于等于 0.0 且小于1.0.
package hello;

public class Student{
	public static void main(String[] args) {
		int i;
		for (i=0;i<100;i++)
		{
			double d = Math.random();
			System.out.println(d);
		}
	}
}
// 猜随机数游戏。
package hello;
import java.util.Scanner;
public class Student{
	public static void main(String[] args) {
		int number = (int)(Math.random()*100)+1;  // 强制类型转化。
		while(true) {
			System.out.println("请输入你猜的数字：");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n > number) {
				System.out.println("你猜的大了！");
			}else if (n < number) {
				System.out.println("你猜的小了！");
			}else {
				System.out.println("恭喜你，猜对了！");
				break;
			}
		}
	}
}
