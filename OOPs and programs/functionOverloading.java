class Student{
    String name;
    int age;

    public void display(String name){
        System.out.println(this.name);
    }
    public void display(int age){
        System.out.println(this.age);
    }
    public void display(String name,int age){
        System.out.println(this.name+" "+this.age);
    }
}
public class functionOverloading {
   public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Lakshman Narayan Jasyal";
    s1.age=20;

    s1.display(s1.name);
    s1.display(s1.age);
    s1.display(s1.name,s1.age);
   }
}
