public class reverseNumber {
    public static void main(String[] args) {
        int ans = revNum(1234);
        System.out.print(ans);
    }
    public static int revNum(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int rem = n%10;
            rev= rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
