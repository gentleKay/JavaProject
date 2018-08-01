// Java中的继承只能是 单继承 不能是多继承。
package hello;
//import java.util.Scanner;
class Father{}
class Mothrt{}
class Son extends Father{}
//class Son extends Mother{}  //因为Son 已经继承了Father类了，所以Son类将不能再继承Mother类。
public class Student{
	public static void main(String[] args) {
		Son s = new son;
	}
}
//简单的一个继承。
package hello;

class Phone{
	public void call_1() {
		System.out.println("Call Phone!");
	}
}
class NewPhone extends Phone{
	public void call_2() {
		System.out.println("Call NewPhone!");
	}
}
public class Student{
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call_1();
		np.call_2();
	}
}
