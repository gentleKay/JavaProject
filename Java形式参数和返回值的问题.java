//***形式参数***
//类名作为形式参数
class Student {
  public void study(){
    System.out.println("Study!");
  }
}

class StudentDemo{
  public void method(Student s){  //ss = new Student();    Student s = new Student();
    s.study();
  }
}
class StudentTest{
  public static void main(String[] args){
    Student s =  new Student();    // 利用Student类进行study函数的使用。
    s.study();
    System.out.println("----------------");
    StudentDemo sd = new StudentDemo();
    Student ss = new Student();    //利用StudentDemo类进行输出study。
    sd.method(ss);
    System.out.println("----------------");
    new StudentDemo().method (new Student());  // 匿名对象用法
  }
}
//抽象名作为形式参数
package hello;

abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p) {
		p.study();
	}
}

class Stu extends Person{
	public void study() {
		System.out.println("study!");
	}
}

class Student{
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Stu();
		pd.method(p);
	} 
}
//接口作为形式参数
package hello;

interface Love{
	public abstract void love();
} 

class LoveDemo{
	public void method(Love l) {
		l.love();
	}
}

class LoveTest implements Love{
	public void love() {
		System.out.println("Love!");
	}
}

class Student{
	public static void main(String[] args) {
		LoveDemo ld = new LoveDemo();
		Love l = new LoveTest();
		ld.method(l);
	} 
}
//***返回值类型***
//类名作为返回值
class Stu{
	public void study() {
		System.out.println("Study!");
	}
}

class StuDemo{
	public Stu getStu() {
		//Stu s = new Stu();
		//return s;
		return new Stu();
	}
}

class Student {
	public static void main(String[] args) {
		StuDemo sd = new StuDemo();   // 利用StuDemo类来进行调用函数输出。
		Stu s = sd.getStu();
		s.study();
	}
}
//抽象类作为返回值
abstract class Person{
	public abstract void study();
		//System.out.println("Study!")

}

class PersonDemo{
	public Person getPerson() {
		//Person p = new Stu();
		//return p;
		return new Stu();
	}
}

class Stu extends Person{
	public void study() {
		System.out.println("Study!");
	}
}
class Student {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();  // 利用PersonDemo类来进行调用函数输出。
		Person p = pd.getPerson();
		p.study();
	}
}
//接口作为返回值
interface Jump{
	public abstract void jump();
}

class JumpDemo{
	public Jump getJump() {
		//Person p = new Stu();
		//return p;
		return new Dog();
	}
}

class Dog  implements Jump{
	public void jump() {
		System.out.println("can jump!");
	}
}
class Student {
	public static void main(String[] args) {
		JumpDemo jd = new JumpDemo();  // 利用JumpDemo类来进行调用函数输出。
		Jump j = jd.getJump();
		j.jump();	
	}
}
