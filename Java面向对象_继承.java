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
//猫，狗，动物之间的继承关系。
package hello;

class Animal{
	private String name;
	private int age;
	private String color;
	public Animal() {}
	
	public Animal(String name,int age,String color) {	//----------------------------------------
		this.name = name;				//与上面的 学生，老师，人类 类的成员变量的赋值
		this.age = age;					//有一点区别。 这里用的是带参的构造函数。
		this.color = color;				//而上面是带参的成员函数。
	}							//----------------------------------------
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void eat() {
		System.out.println("吃饭！");
	}
}

class Cat extends Animal{
	public Cat() {}
	public Cat(String name,int age,String color) {			//---------------------------------------------------
		super(name,age,color);					//如果用的是 带参构造函数 那么 在子类中就要多出这几句语句
	}								//---------------------------------------------------
	public void play() {
		System.out.println("猫玩！");
	}
}

class Dog extends Animal{
	public Dog() {}
	public Dog(String name,int age,String color) {			//---------------------------------------------------
		super(name,age,color);					//如果用的是 带参构造函数 那么 在子类中就要多出这几句语句
	}								//---------------------------------------------------
	public void look() {
		System.out.println("狗看门!");
	}
}

public class Student{
	public static void main(String[] args) {
		Cat c = new Cat("小白",2,"白色");
		Dog d = new Dog("小黑",3,"黑色");
		System.out.println(c.getName()+","+c.getAge()+","+c.getColor());
		c.eat();
		c.play();
		System.out.println("---------------------");
		System.out.println(d.getName()+","+d.getAge()+","+d.getColor());
		d.eat();
		d.look();
	}
}
