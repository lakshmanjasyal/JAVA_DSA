class Student{
    String name;
    String father_Name;
    String roll_No;
    String marks;

    public void printDeatils(){
        System.out.println("Name:"+this.name);
        System.out.println("Father's Name:"+ this.father_Name);
        System.out.println("Roll Number: "+this.roll_No);
        System.out.println("Marks: "+this.marks);
    }
     Student(){
        System.out.println("Constructor called");
     }
}

public class classStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        // Student s2=new Student();
        s1.name="Lakshman Narayan Jasyal";
        s1.father_Name="I am father";
        s1.roll_No="65";
        s1.marks="90%";
        s1.printDeatils();
        
    }
}
