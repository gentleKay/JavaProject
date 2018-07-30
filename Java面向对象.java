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
//一个类作为 形式参数 变量 进行的调用。  
package hello;

class S {
	public void study() {
		System.out.println("love study!");
	}
}
class Stu{
	public void method(S s) {
		s.study();
	}
}
public class Student{
	public static void main(String[] args) {
		Stu stu = new Stu();
		S s = new S();
		stu.method(s);
	}
}
//匿名对象。 匿名对象调用完毕后就是垃圾，可以被垃圾回收器回收。
package hello;

class S {
	public void study() {
		System.out.println("love study!");
	}
}
class Stu{
	public void method(S s) {  // 这里的形式参数是 （引用类型）对象。
		s.study();
	}
}
public class Student{
	public static void main(String[] args) {
		S s = new S();
		s.study();
		s.study();   //这里两次的输出是同一个对此昂进行的输出。
		System.out.println("--------------");
		new S().study();
		new S().study();    //而这里的两次输出却是不同的两个对象进行的输出。
		System.out.println("--------------");
		Stu stu = new Stu();
		stu.method(s);
		System.out.println("--------------");
		new Stu().method(new S());    // 这里用到的是 匿名对象的方法。
	}
}
