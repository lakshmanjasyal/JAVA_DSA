class Student{
    String name;
    int age;

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class parametrizedConsturctor {
   public static void main(String[] args) {
       Student s1=new Student("Aman", 12);
       s1.display();
   } 
}
