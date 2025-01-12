import java.util.*;
import java.io.*;
class Reverse{
 public int max;
 public char a[];
 public int top;
 public Reverse(int s){
 max=s;
 a=new char[max];
 top=-1;
 }
 public boolean isFull(){
return (top==max-1);}
public boolean isEmpty(){
return (top==-1);}
public void push(char item){
a[++top]=item;}
public char pop(){
char temp;
temp=a[top];
top--;
return temp;
}
}
class reverse{
public static void main(String[] args){
char d;
Scanner sc=new Scanner(System.in);
String c=new String();
int n;
System.out.println("Enter string:");
c=sc.nextLine();
n=c.length();
Reverse ob=new Reverse(n);
for(int i=0;i<n;i++){
if(ob.isFull()==false)
ob.push(c.charAt(i));}

System.out.println("Reversed String:");
for(int i=0;i<n;i++){
if(ob.isEmpty()==false){
d=ob.pop();
System.out.print(d);
}}}}
