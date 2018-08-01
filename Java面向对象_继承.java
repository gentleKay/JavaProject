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
// 利用继承写,学生，老师类并进行操作。
package hello;

class Person{
	private String name;
	private int age;
	public Person() {}
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

class Teacher extends Person{
	public Teacher() {}
}
class Stu extends Person{
	public Stu() {}
}

public class Demo{
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("GSK");
		t.setAge(22);
		System.out.println("姓名："+t.getName());
		System.out.println("年龄："+t.getAge());
		Stu s = new Stu();
		s.setName("gsk");
		s.setAge(18);
		System.out.println("姓名："+s.getName());
		System.out.println("年龄："+s.getAge());
	}
}
