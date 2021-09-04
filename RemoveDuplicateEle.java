import java.util.*;
public class RemoveDuplicateEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements in array ");
        int n = sc.nextInt();

        System.out.println("Taking element from user");
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int j=0;
        
        // the function will modify the array a[]
        // such that the starting j elements 
        // will be having all unique elements 
        // and no element will be appearing more than
        // once
        j = duplicateEle(a, n);
        System.out.println("Array without duplciate elements are");

        // printing array elements
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
    static int duplicateEle(int a[],int n){
        if(n==0 || n==1){
            return n;
        }
        int j=0;
        // check if the ith element is not equal to 
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element 
        // will only be added once in the array
        for(int i=0;i<n-1;i++){  //here n-1 for removing the IndexOutOfBoundException
            if(a[i]!=a[i+1]){
                a[j++]=a[i];
                
            }
        }
        a[j++]=a[n-1];

        

        return j; 
    }
}
