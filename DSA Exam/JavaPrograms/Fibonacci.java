import java.util.*;

public class Fibonacci{

	public static void main(String[] args){ 
	
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Limit ");
	int n = sc.nextInt();
	int f1=0;
	int f2=1;
	
	System.out.println(f1);
	System.out.println(f2);
	
	for(int i=2;i<n;i++){
		f2=f2+f1;
		f1=f2;
		System.out.println(f2);
		
		}	
		
	}
}
