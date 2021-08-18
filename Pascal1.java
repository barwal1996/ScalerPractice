import java.util.Scanner;

/*print pascal triangle 
1 0 0 0 0
1 1 0 0 0
1 2 1 0 0
1 3 3 1 0
1 4 6 4 1
*/
public class Pascal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
      //  f.solve(A[][]);
      int d[][] = solve(f);// how we call matrix function
    }
    public static int[][] solve(int A){
        int[][] res = new int[A][A];
        if(A==0)
            return res;
        res[0][0]=1;
        for(int i = 0;i<A;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    res[i][j]=1;
                }
                else
                    res[i][j]= res[i-1][j] + res[i-1][j-1];
            }
        }
        return res;
    }
}
