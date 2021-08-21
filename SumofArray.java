import java.util.*;
public class SumofArray {



    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();int sum =0;
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++)  
            {  
            //reading array elements from the user   
                arr[i]=s.nextInt();  
                sum=sum+arr[i];
            } 
            System.out.println(sum);
    }
}

