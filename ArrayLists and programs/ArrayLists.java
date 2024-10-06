
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // Adding elements
        list.add(9);
        list.add(1);
        list.add(3);
        System.out.println(list);

        // get elements
        int element=list.get(0);
        System.out.println(element);

        // add el in between
        list.add(2,7);
        System.out.println(list);

        // set elements
        list.set(0,6);
        System.out.println(list);

        // delete elements
        list.remove(3);
        System.out.println(list);

        // size
        int size=list.size();
        System.out.println(size);

        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
