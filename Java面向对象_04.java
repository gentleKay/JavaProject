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
//

