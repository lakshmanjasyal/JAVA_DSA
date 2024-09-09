

class Shape{
    String color;
}
class Triangle extends Shape{
    public void display(){
    System.out.println(this.color);}
}
public class twoClasses {
   public static void main(String[] args) {
       Triangle t1=new Triangle();
       t1.color="Green";
        t1.display();
   } 
}
