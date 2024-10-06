import java.util.*;
public class reverseStack{
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        Stack<Integer> temp = new Stack<>();
        for (Integer value : s) {
            temp.push(value);
        }

        System.out.print("Before reversing: ");
        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
        System.out.println();

        // Now reverse the original stack
        reverse(s);

        System.out.print("After reversing: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    

    }
}