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
