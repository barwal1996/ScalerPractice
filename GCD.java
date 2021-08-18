public class GCD {
    public static void main(String[] args) {
        int ans = gcd(180, 48);
        System.out.print(ans);
    }
    public static int gcd(int divisor , int dividend)
    {
      int   rem= dividend%divisor;
        while(rem!=0){
            dividend=divisor;
            divisor=rem;
            rem = dividend%divisor;
        }
        return divisor;
    }
}
