//final 关键字
package hello;

class fu{
	public /*final*/ void show() {  //final 关键字 在子类中这样就不能函数重写父类中的函数了 
		System.out.println("1");
	}
}

class zi extends fu {
	public void show() {
		System.out.println("2");
	}
}

public class Student{
	public static void main(String[] args) {
		zi z = new zi();
		z.show();
	}
}
// 多态。 猫，狗，动物类的案例演示。
package hello;

class Animal{
	public Animal() {}
	public void eat() {
		System.out.println("吃饭！");
	}
}

class Cat extends Animal{
	public Cat() {}
	public void eat() {
		System.out.println("吃鱼！");
	}
	public void play() {
		System.out.println("猫玩！");
	}
}

class Dog extends Animal{
	public Dog() {}
	public void eat() {
		System.out.println("吃肉！");
	}
	public void look() {
		System.out.println("狗看门!");
	}
}

public class Student{
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		//a.look();  这个是错误的，子类可以用父类的函数，但是父类不能访问使用子类的函数
		System.out.println("----------");
		Dog d = (Dog)a;
		d.eat();
		d.look();
		System.out.println("----------");
		a = new Cat();
		a.eat();
		System.out.println("----------");
		Cat c =(Cat)a;
		c.eat();
		c.play();
		System.out.println("----------");
		//Dog dd = (Dog)a; 
		// 这个 对象a 是 猫类的，并不是动物类，所以这句语法有错误。
	}
}
//利用抽象类进行 猫，狗，动物类的操作
package hello;

abstract class Animal{
	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public abstract void eat();
}

class Cat extends Animal{
	public Cat() {}
	public Cat(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("猫吃鱼！");
	}
}

class Dog extends Animal{
	public Dog() {}
	public Dog(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("狗吃肉！");
	}
}
public class Demo{
	public static void main(String[] args) {
		Cat c = new Cat("Tom",2);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		c.eat();
		System.out.println("------------");
		Dog d = new Dog("Hirg",3);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		d.eat();
	}
}
//关于老师类的一个测试
package hello;

abstract class Teacher{
	private String name;
	private int age;
	public Teacher() {}
	public Teacher(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public abstract void teach();
}
class BasicTeacher extends Teacher{
	public BasicTeacher() {}
	public BasicTeacher(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println("基础班老师！");
	}
}

class JobTeacher extends Teacher{
	public JobTeacher() {}
	public JobTeacher(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println("就业班老师！");
	}
}

public class Student{
	public static void main(String[] args) {
		Teacher t = new BasicTeacher("xiao余",35);    //利用一个抽象定义对象并直接给 下面的继承的类，节约内存空间。
		//BasicTeacher bt = new BasicTeacher("xiao余",35);
		System.out.println(t.getName());
		System.out.println(t.getAge());
		t.teach();
		System.out.println("-----------");
		t = new JobTeacher("lao余",45);      // 利用一个抽象定义对象并直接给 下面的继承的类，节约内存空间。
		//JobTeacher jt = new JobTeacher("lao余",45);
		System.out.println(t.getName());
		System.out.println(t.getAge());
		t.teach();
	}
}
// 接口以猫，狗，动物 为例子来进行操作编程。
package hello;

interface Jump{
	public static void jump() {}
}

abstract class Animal{
	private String name;
	private int age;
	
	public Animal() {}
	
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
	public abstract void eat();
}

class Cat extends Animal{
	public Cat() {}

	public void eat() {
		System.out.println("猫吃鱼！");
	}
}

class Dog extends Animal{
	public Dog() {}

	public void eat() {
		System.out.println("狗吃肉！");
	}
}
class JumpCat extends Cat implements Jump{
	public void jump() {
		System.out.println("猫跳高！");
	}
}

class JumpDog extends Dog implements Jump{
	public void jump() {
		System.out.println("狗跳高！");
	}
}

public class Student{
	public static void main(String[] args) {
		JumpCat jc = new JumpCat();
		jc.setName("Tom");
		jc.setAge(3);
		System.out.println(jc.getName());
		System.out.println(jc.getAge());
		jc.eat();
		jc.jump();
		System.out.println("---------");
		Cat c = new Cat();
		c.setName("Yii");
		c.setAge(2);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		c.eat();
		// 狗类就不在这里一一 举例了。
	}
}
//
