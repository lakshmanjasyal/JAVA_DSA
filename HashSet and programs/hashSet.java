
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int n=sc.nextInt();

        //Insertion
        System.out.println("Enter the elements in HashSet:");
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        //Print all elements
        System.out.println(set);

        //Searching the element
        System.out.print("Enter the element to search:");
        int k=sc.nextInt();
        if(set.contains(k)){
            System.out.print(k+" is found...");
        }
        if(!set.contains(k)){
            System.out.print(k+" is not in set...");
        }


        //Deleting the element
        System.out.print("Enter the element to delete:");
        int l=sc.nextInt();
            set.remove(l);
            // if(!set.contains(l)){
            //     System.out.print("Doesn't contain "+l);
            // }
         System.out.println(set);


         //Printing size of set
         System.out.println("Size of the set is: "+ set.size());


         //printing is there any next element or not
         Iterator it = set.iterator();
         while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
 
 
        //isEmpty
        if(!set.isEmpty()) {
            System.out.println("set is not empty");
        }
 

    }
}