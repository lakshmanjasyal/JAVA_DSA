
import java.util.Scanner;


public class prime {
    public static void printPrime(int n){
       if(n<=1){
        System.out.print(n+" is not a Prime");
        return;
    }
       boolean isPrime=true;
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%2==0){
            isPrime=false;
            break;
        }
       }
       if(isPrime){System.out.print(n+" is Prime");}
       else{System.out.print(n+" is not Prime");}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int x=sc.nextInt();
        printPrime(x);
    } 
}
