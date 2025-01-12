import java.util.*;
class stackUsingArray{
     static class overStack{
	private int max;
	private int[] arr;
	private int top;
	public overStack(int size){
		max=size;
		arr=new int[max];
		top=-1;
}

// Check Full
public boolean isFull(){
return top==max-1;}
//Check Empty
public boolean isEmpty(){
return top==-1;
}

//Push method
public void push(int data){
if(isFull()){
System.out.println("Stack is full,cannot push");
}

top++;
arr[top]=data;
System.out.println("Pushed:"+data);

}
//Pop method
public int pop(){
if(isEmpty()){System.out.println("Stack is empty,cannot pop");  return -1;}
else{
int temp=arr[top];
top--;
System.out.println("Popped:"+temp);
return temp;}
}

// Peek method
public int peek(){
if(isEmpty()){
System.out.println("Stack is empty");
return -1;
}
else{
return arr[top];}
}
// Display method
public void Display(){
if(isEmpty()){
System.out.println("Stack is empty");}
else{
System.out.println("Stack elements:");
for(int i=0;i<=top;i++) {
System.out.println(arr[i]+ " ");
}
System.out.println();
}}
}

//Main method
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the size of stack:");
int n=sc.nextInt();
overStack stack=new overStack(n);
while(true){
System.out.print("Choose an operation:\n1.Push\n2.Pop\n3.Peek\n4.Display Stack");
System.out.print("\nEnter the choice");
int choice=sc.nextInt();
switch(choice){
case 1: System.out.print("Enter number to push:");
	int data=sc.nextInt();
	stack.push(data);
	break;
case 2: stack.pop();
	break;
case 3: int peekedValue=stack.peek();
	if(peekedValue!=-1){
	System.out.println("Top element:"+peekedValue);}
	break;
case 4: stack.Display();
	break;
default:System.out.println("Invalid choice!");}}

}
}





















