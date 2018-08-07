// 这个是demo包
package demo;

public class Test {
	public int sum(int a,int b) {
		return a+b;
	}
}
//这个是hello包  //程序是在有主程序的地方调试编译的
package hello;
import demo.Test;  // 这里可以用到关键字 import； 导入包 demo.Test.  //格式：包.类名
public class world {
	public static void main(String[] args) {
		//demo.Test t = new demo.Test();
		//System.out.println(t.sum(10, 20));
		System.out.println("-------------");
		Test t = new Test();
		System.out.println(t.sum(10, 20));
	}
}
//
