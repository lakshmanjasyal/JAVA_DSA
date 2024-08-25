
import java.util.Scanner;

public class hollowbutterfly {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=5;
     // Upper half
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        if(j==1||j==i){System.out.print("*");}
        else{System.out.print(" ");}
        }
        int spaces=(5-i)*2;
        for(int j=1;j<=spaces;j++){System.out.print(" ");}
        for(int j=1;j<=i;j++){
            if(j==1||j==i){System.out.print("*");}
        else{System.out.print(" ");}
        }
        System.out.println();
}
        //LOWER HALF 
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            if(j==1||j==i){System.out.print("*");}
            else{System.out.print(" ");}
            }
            int spaces=(5-i)*2;
            for(int j=1;j<=spaces;j++){System.out.print(" ");}
            for(int j=1;j<=i;j++){
                if(j==1||j==i){System.out.print("*");}
            else{System.out.print(" ");}
            }
            System.out.println();
    
         }
            
   } 
}
