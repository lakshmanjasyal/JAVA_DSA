
public class print1to5 {
        public static void printNum(int n){
            if(n==0||n==6){ return;}
            System.out.print(n+" ");
            printNum(n+1);
        }
        public static void main(String[] args) {
            printNum(1);
        }    
}
