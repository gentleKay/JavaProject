//定义一个简单的学生类。
package hello;

class Stu {
	String name;
	int age;
	String address;
	
	public void study() {
		System.out.println("love study!");
	}
	
	public void eat() {
		System.out.println("eat dinner!");
	}
}
//定义一个学生类Stu，并进行赋值，输出等简单操作。
package hello;

class Stu {                           //注意：Stu 只是一个定义的类 而主程序应该写在 Student 中。文件名应该也为Student.java
	String name;
	int age;
	String address;
	
	public void study() {
		System.out.println("love study!");
	}
	
	public void eat() {
		System.out.println("eat dinner!");
	}
}
public class Student{
	public static void main(String[] args) {
		Stu s = new Stu();//在堆内存 new的都在堆。
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		System.out.println("----------");
		s.name = "GSK";
		s.age = 22;
		s.address = "China";
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		System.out.println("----------");
		s.eat();
		s.study();
	}
}
