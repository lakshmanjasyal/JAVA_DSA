
// import java.util.Scanner;

// public class simplecalculator {
//    public static void main (String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter 1st digit:");
//     float x=sc.nextFloat();
//     System.out.print("Enter 2nd digit:");
//     float y=sc.nextFloat();
//     System.out.println("Enter the operation you would like to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
//     int a=sc.nextInt();
//     switch(a){
//        case 1: System.out.print("Addition:"+ x+ "+" + y + "="+ (x+y));
//        break;
//        case 2: System.out.print("Subtraction:"+ x+ "-" + y + "="+ (x-y));
//        break;
//        case 3: System.out.print("Multiplication:"+x+ "*" + y + "="+ (x*y));
//        break;
//        case 4: if(y!=0){
//        System.out.print("Division:" +x + "/" + y + "="+ (x/y));
//        }
//        else{
//         System.out.print("Not Possible:Divide by zero!");
//        }
//        break;
//        case 5: System.out.print("Modulus:" + x+ "%" + y + "="+ (x%y));
//        break;
//        default:System.out.print("Invalid Input");
//     }
//     sc.close();
//    }
       

// }

import java.util.Scanner;

public class simplecalculator {
   public static void main (String[] args) {
       try(Scanner sc = new Scanner(System.in)){
       System.out.print("Enter 1st digit:");
       float x = sc.nextFloat();  // Use nextFloat() instead of nextInt() for float
       System.out.print("Enter 2nd digit:");
       float y = sc.nextFloat();
       System.out.println("Enter the operation you would like to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
       int a = sc.nextInt();

       switch (a) {
           case 1 -> System.out.print("Addition: " + x + " + " + y + " = " + (x + y));
           case 2 -> System.out.print("Subtraction: " + x + " - " + y + " = " + (x - y));
           case 3 -> System.out.print("Multiplication: " + x + " * " + y + " = " + (x * y));
           case 4 -> {
               if (y != 0) {
                   System.out.print("Division: " + x + " / " + y + " = " + (x / y));
               } else {
                   System.out.print("Not Possible: Divide by zero!");
               }
           }
           case 5 -> System.out.print("Modulus: " + x + " % " + y + " = " + (x % y));
           default -> System.out.print("Invalid Input");
       }
   }
}
}

