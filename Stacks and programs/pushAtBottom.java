import java.util.*;
public class pushAtBottom{
    public  void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(data, s);
        s.push(top);
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

       pushAtBottom obj=new pushAtBottom();
      obj.pushBottom( 9 , s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}