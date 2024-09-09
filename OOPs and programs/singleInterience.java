

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
public class singleInterience {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.areaS();
        t1.areaT(10, 10);
    }    
}
