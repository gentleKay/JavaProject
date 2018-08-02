package hello;

class fu{
	public /*final*/ void show() {
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
