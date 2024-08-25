import java.util.Scanner;

public class nevennos {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter upper limit:");
       int x=sc.nextInt();
       for(int i=1;i<=x;i++){
        if(i%2==0){
            System.out.println(i);
        }
       }
    //    for(; ;) {
    //     System.out.println("Apna College");
    // }


   } 
}
