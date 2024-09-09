class Shape{
    public void areaS(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void areaT(int l,int h){
        System.out.println((l*h)/2);
    }
}

class Circle extends Shape{
    public void areaC(int r){
        System.out.println(3.14*r*r);
    }
}

public class hierarchialInheriatance {
   public static void main(String[] args) {
       Circle c1=new Circle();
       c1.areaS();
       c1.areaC(10);
    System.out.println();

    Triangle t1=new Triangle();
    t1.areaS();
    t1.areaT(10,10);

   } 
}
