public class Pascal {
    public static void main(String[] args) {
        pascalTriangle(5);
    }
    public static void pascalTriangle(int n)
    {
        for(int row = 0;row<n;row++)
        {
            int val = 1;
            for(int col= 0;col<=row;col++){
                System.out.print(val+" ");
                val= val*(row-col)/(col+1);
            }
            System.out.println();
        }
    }
}
