//多态，继承，抽象运用在面向对象中。
//乒乓球运动员和教练，篮球运动员和教练。
//乒乓球打国际赛要学习英语口语。
package hello;

interface StudyEnglish{
	public static void StudyEnglish() {}
}

abstract class Person{
	private String name;
	private int age;
	public Person() {}
	
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
	
	public void sleep() {
		System.out.println("时间到啦，该睡觉啦！");
	}
}

abstract class SportsMan extends Person{
	public SportsMan() {}
	
	public abstract void studysport();
}

abstract class Coach extends Person{
	public Coach() {}
	
	public abstract void teachsport();
}

class PingPong extends SportsMan implements StudyEnglish{
	public void eat() {
		System.out.println("乒乓运动员吃猪肉！");
	}
	
	public void studysport() {
		System.out.println("锻炼乒乓球技术！");
	}
	
	public void StudyEnglish() {
		System.out.println("乒乓运动员学习口语！");
	}
}

class Basketball extends SportsMan{
	public void eat() {
		System.out.println("篮球运动员吃牛肉！");
	}
	
	public void studysport() {
		System.out.println("锻炼篮球技术！");
	}
}

class PpCoach extends Coach implements StudyEnglish{
	public void eat() {
		System.out.println("乒乓教练吃米饭！");
	}
	
	public void teachsport() {
		System.out.print("乒乓教练教乒乓技术！");
	}
	
	public void StudyEnglish() {
		System.out.println("乒乓教练学习口语！");
	}
}

class BsCoach extends Coach{
	public void eat() {
		System.out.println("篮球教练吃面！");
	}
	
	public void teachsport() {
		System.out.println("篮球教练教篮球技术！");
	}
}

class Student{
	public static void main(String[] args) {
		//乒乓球运动员
		PingPong pp = new PingPong();
		pp.setName("张继科");
		pp.setAge(22);
		System.out.println("乒乓球运动员:"+pp.getName()+",年龄:"+pp.getAge());
		pp.eat();
		pp.StudyEnglish();
		pp.studysport();
		pp.sleep();
		System.out.println("-----------------");
		//篮球运动员
		Basketball b = new Basketball();
		b.setName("Jordon");
		b.setAge(23);
		System.out.println("篮球运动员:"+b.getName()+"，年龄:"+b.getAge());
		b.eat();
		b.studysport();
		b.sleep();
		System.out.println("-----------------");
		//乒乓球教练
		PpCoach pc = new PpCoach();
		pc.setName("水尽");
		pc.setAge(45);
		System.out.println("乒乓教练:"+pc.getName()+",年龄:"+pc.getAge());
		pc.eat();
		pc.StudyEnglish();
		pc.teachsport();
		pc.sleep();
		System.out.println("-----------------");
		//篮球教练
		BsCoach bc = new BsCoach();
		bc.setName("华");
		bc.setAge(43);
		System.out.println("篮球教练:"+bc.getName()+",年龄:"+bc.getAge());
		bc.eat();
		bc.teachsport();
		bc.sleep();
		System.out.println("-----------------");
	} 
}

