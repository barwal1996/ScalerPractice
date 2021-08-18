class CheckPrime{
    public static void main(String[] args) {
        
//        boolean bool = isprime1(137);
        printPrimes(100);    
        //System.out.println(bool);
    }
    public static boolean isPrime(int n){

        for(int cnt = 2;cnt<=n-1;cnt++)
        {
            if(n%cnt==0)
            {
                return false;
            }
        }
        return true;
    }
    //As we can see computation can be reduced to half as prime no. not divisible by no greater than its half.
    public static boolean isprime1(int n)
    {
        for(int cnt=2;cnt<=n/2;cnt++)
        {
            if(n%cnt==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n){ //print prime numbers from i to n.
        for(int i=2;i<=n;i++){
            int cnt =2;
            boolean isPrime = true;

            while(cnt*cnt <=i){
                if(i%cnt==0){
                    isPrime=false;
                    
                }
                cnt++;
            }
            if(isPrime==true){
                System.out.println(i);
            }
        }
    }
}