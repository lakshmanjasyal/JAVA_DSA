public class setBits {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNum=bitMask |n;
        System.out.println(newNum);
    }
}

