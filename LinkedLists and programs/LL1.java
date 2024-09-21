import java.util.*;

public class LL1 {
    
    public static void main(String[] args) {
        
    
    LinkedList<String> list=new LinkedList<String>();

    list.addFirst("a");
    list.addFirst("is");
    System.out.println(list);

    list.addFirst("This");
    list.addLast("list");
    System.out.println(list);

    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" -> ");
    }
    System.out.println("Null");

    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    list.remove(1);
    System.out.println(list);
    }
}
