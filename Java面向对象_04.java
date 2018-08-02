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
