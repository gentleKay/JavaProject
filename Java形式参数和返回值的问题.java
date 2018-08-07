//形式参数
//类名作为形式参数
class Student {
  public void study(){
    System.out.println("Study!");
  }
}

class StudentDemo{
  public void method(Student s){  ss = new Student();    Student s = new Student();
    s.study();
  }
}
class StudentTest{
  public static void main(String[] args){
    Student s =  new Student();
    s.study();
    System.out.println("----------------");
    StudentDemo sd = new StudentDemo();
    Student ss = new Student();
    sd.method(ss);
    System.out.println("----------------");
    new StudentDemo().method (new Student());  // 匿名对象用法
  }
}
//
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
//
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
