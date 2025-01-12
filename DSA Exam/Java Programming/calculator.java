import java.util.*;

public class calculator{
public static void main(String args[]){
try (Scanner sc = new Scanner(System.in)) {
	while(true){
	System.out.print("Enter first number:");
	int a=sc.nextInt();
	System.out.print("Enter second number:");
	int b=sc.nextInt();
	
	System.out.println("Enter the operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Stop");
	int k=sc.nextInt();
	
	switch(k){
	case 1 -> System.out.println(a+"+"+b+"="+(a+b));
	case 2 -> System.out.println(a+"-"+b+"="+(a-b));
	case 3 -> System.out.println(a+"*"+b+"="+(a*b));
	case 4 -> System.out.println(a+"/"+b+"="+(a/b));
	case 5 -> System.out.println(a+"%"+b+"="+(a%b));
	case 6 -> {
		System.out.println("Exiting...");
		System.exit(0);
	}
	default -> System.out.println("Invalid Input!");
	}
	}
}
}
}

