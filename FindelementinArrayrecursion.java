import java.util.Scanner;

public class FindelementinArrayrecursion {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int j=0;j<t;j++){//loop for test cases
            int n = sc.nextInt();
            int[] arr = new int[n];
             for(int i=0;i<n;i++)
             {
            arr[i] = sc.nextInt();
             }
             int x=sc.nextInt();
             
             int res = findElement(arr,0,x);
             System.out.println(res);
             
        }
    }
    public static int findElement(int[] arr,int idx,int x){
        if(idx==arr.length){
            return 0;
        }
        int f = findElement(arr,idx+1,x);
        if(f==1){
            return 1;
        }
        else {
            if(arr[idx]==x){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}