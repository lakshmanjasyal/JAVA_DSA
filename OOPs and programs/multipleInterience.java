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

class EquiTriangle extends Triangle{
    public void areaE(int a){
        System.out.println((Math.sqrt(3)*a*a)/4);
    }
}

public class multipleInterience {
    public static void main(String[] args) {
        EquiTriangle t1=new EquiTriangle();
        t1.areaS();
        t1.areaT(10, 10);
        t1.areaE(10);
    }
    
}
