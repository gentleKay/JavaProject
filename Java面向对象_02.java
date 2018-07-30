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
