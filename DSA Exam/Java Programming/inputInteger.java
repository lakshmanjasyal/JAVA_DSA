import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputInteger{
public static void main(String args[])throws Exception{

InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.print("Enter the number:");
int n=Integer.parseInt(br.readLine());
if(n%2==0){
System.out.println(n+" is even");}
else{
System.out.println(n+" is odd");}
}
}
