//Object类的方法：
//public int hashCode(): 代码1
package common_object;

public class Demo extends Object{

}

package common_object;

public class DemoTest {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.hashCode());   //1887400018
		Demo d2 = new Demo();
		System.out.println(d2.hashCode());  //285377351
	}
}
//public final Class getclass(): 代码2
package common_object;

public class Demo extends Object{

}

package common_object;

public class DemoTest {
	public static void main(String[] args) {
		Demo d = new Demo();
		Class c = d.getClass();
		System.out.println(c.getName());   //common_object.Demo
		String str = new Demo().getClass().getName();
		System.out.println(str);  //common_object.Demo
	}
}
// public String toString(): 代码3-1
package common_object;

public class Demo extends Object{

}

package common_object;

public class DemoTest {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.hashCode());   //1887400018
		System.out.println(d.getClass().getName());  //common_object.Demo
		System.out.println("-----------------------");
		System.out.println(d.toString());   //common_object.Demo@707f7052
		//toString() 方法的值等价于
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//就等于
		//this.getClass().getName() + '@' + Integer.toHexString(this.hashCode())
		System.out.println("-----------------------");
		System.out.println(d.getClass().getName() + '@' + Integer.toHexString(d.hashCode()));
		System.out.println(d.toString());
		//common_object.Demo@707f7052
		//common_object.Demo@707f7052
	}
}
// 方法重写toString()方法： 代码3-2
package common_object;

public class Demo extends Object{
	private String name;
	private int age;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", age=" + age + "]";
	}
	
}
package common_object;

public class DemoTest {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.hashCode());   //1887400018
		System.out.println(d.getClass().getName());  //common_object.Demo
		System.out.println("-----------------------");
		System.out.println(d.toString());   //Demo [name=null, age=0]
		//toString() 方法的值等价于
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//就等于
		//this.getClass().getName() + '@' + Integer.toHexString(this.hashCode())
		System.out.println("-----------------------");
		System.out.println(d.getClass().getName() + '@' + Integer.toHexString(d.hashCode()));
		System.out.println(d.toString());
		//common_object.Demo@707f7052
		//Demo [name=null, age=0]
	}
}
//public boolean equals(Object obj):  此方法已经重写了。
package common_object;

public class Demo extends Object{
	private String name;
	private int age;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
		//另一种表示方法：
		//格式：对象名 instanceof 类名
		//表示：判断对象名是否是该类名一个对象
		//if (!(obj instanceof Demo))
		//	return false;
			return false;
		Demo other = (Demo) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
package common_object;

public class DemoTest {
	public static void main(String[] args) {
		Demo d1 = new Demo("白",21);
		Demo d2 = new Demo("黑",20);
		System.out.println(d1.equals(d2));
	}
}
