class nthFib{
    public static void main(String[] args) {
        int ans = nthfib(4);
        System.out.print(ans);
    }
    public static int nthfib(int n){
        int a=0;
        int b =1;
        
        int i=1;
        while(i<=n)
            {
                int c = a+b;
                a=b;
                b=c;
                i++;
            }        return a;
    }
}