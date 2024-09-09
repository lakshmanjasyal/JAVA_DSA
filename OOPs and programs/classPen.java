class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }
    public void printdetails(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class classPen {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="RED";
        p1.type="Gorilla";
        p1.write();
        p1.printdetails();
        System.out.println();
        Pen p2=new Pen();
        p2.color="Green";
        p2.type="Chimpanzee";
        p2.write();
        p2.printdetails();
    }
}
