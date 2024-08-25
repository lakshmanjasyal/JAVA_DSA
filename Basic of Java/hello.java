class hello{
    public static void main(String[] args){
    
        int n=15;
        counting(n);
    }
    public static void counting(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        
    }
}