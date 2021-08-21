/*
print diamong pattern 
        *
    *   *   *
*   *   *   *   *
    *   *   *
        *
*/

public class Diamond {
    public static void main(String[] args) {
        //diamond(5);
        //fullDiamond(6);
        halfDiamond(7);
    }
    public static void diamond(int n)
    {
        int st = 1;
        int sp =n/2;
        int row = 1;
        while(row<=n)
        {
            int cp = 1; //counter
            while(cp<=sp){
                System.out.print("  "); //used for printing space 
                cp++; // it will go to another row for another space
            }
            int ct=1;
            while(ct<=st){
                //loop for printing stars
                System.out.print("* ");
                ct++;
            }

            if(row<=n/2){
                st = st+2;
                sp= sp-1;
            }
            else
                {
                    st=st-2;
                    sp=sp+1;
                }
                row++;
                System.out.println();
        }
    }
    public static void  fullDiamond(int n) {
        int k =n-1;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<=k-1;j++){
                System.out.print(" ");
            }
            for(int f=0;f<=i;f++){
                System.out.print("* ");
            }
            k--;
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            for(int l=0;l<=i-1;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void halfDiamond(int n){
        int k = n-1;
        
        for(int i =0;i<=n-1;i++){
           
            for(int j=i;j>=n;j--)
            {
                System.out.print(" ");
            }
            for(int f = 0;f<=i;f++){
                System.out.print("*");
            }
            k=k-1;
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=n;j--){
                System.out.print(" ");
            }
            for(int l=0;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
