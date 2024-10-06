public class clearbits {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int change= ~(bitMask);
        int newNum=change & n;
        // 
        System.out.println(newNum);
    }    
}
