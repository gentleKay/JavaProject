// 这个是demo包
package demo;

public class Test {
	public int sum(int a,int b) {
		return a+b;
	}
}
//这个是hello包  //程序是在有主程序的地方调试编译的
package hello;

public class world {
	public static void main(String[] args) {
		demo.Test d = new demo.Test();
		System.out.println(d.sum(10, 20));
	}
}
//
