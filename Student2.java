class Student{
 int id;
 String name;
}
class TestStudent2{
  public static void main(String args[]){
    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    Student s4=new Student();
    
    s1.id=101;
    s2.id=102;
    s3.id=103;
    s4.id=104;
    s1.name="Akash";
    s2.name="John";
    s3.name="Raj";
    s4.name="Deepak";
    System.out.println(s1.id);
    System.out.println(s1.name);
    System.out.println(s2.id);
    System.out.println(s2.name);
    System.out.println(s3.id);
    System.out.println(s3.name);
    System.out.println(s4.id);
    System.out.println(s4.name);
}
}