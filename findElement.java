//import java.lang.*;
import java.util.*;

public class findElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int j=0;j<t;j++)// this loop running for test cases
        {
            int n = s.nextInt();
       
       
        int[] arr = new int[n];  

        for(int i=0; i<n; i++)  
            {  
            //reading array elements from the user   
                arr[i]=s.nextInt();  
            } 
            int ele = s.nextInt();
            int idx = findElement1(arr,ele);
        if(idx==-1){
            System.out.println(0) ;
            
        }
        else
            System.out.println(1);
        }
        s.close();
        
     //   
        
    }
    public static int findElement1(int[] arr,int ele){
        boolean isFound = false;
        int idx = -1;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==ele){
                isFound = true;
                idx = i;
            }
        }
        return idx;
    }
}