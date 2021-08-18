public class isArmstrong {
    public static void main(String[] args) {
        boolean bool = isArmstrong(153);
        System.out.print(bool);        
    }
    public static  boolean isArmstrong(int n){
        int dup = n;
        int sum=0;
        while(n!=0)
        {
            int rem = n%10;
            sum=(int)(sum+ Math.pow(rem,3));
            n=n/10;
        }
        if(sum==dup){
            return true;
        }else{
            return false;
        }
        
    }
}
