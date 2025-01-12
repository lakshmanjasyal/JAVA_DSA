import java.util.*;

public class printPrime{
public static void main(String args[]){
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter lower range:");
    int a=sc.nextInt();
    System.out.print("Enter upper range:");
    int b=sc.nextInt();
    for(int i=a;i<b;i++){
    if(i>1){
    Boolean isPrime=true;
    for(int j=2;j<=Math.sqrt(i);j++){
    if(i%j==0){
    isPrime=false;
    break;
    }
    }
    if(isPrime){
    System.out.print(i+" ");}
    
    }
    }
}
}
}
