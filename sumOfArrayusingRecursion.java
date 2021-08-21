import java.util.Scanner;

public class sumOfArrayusingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sum=calcSum(arr, n-1);
        System.out.println(sum);

    }
    public static int calcSum(int [] arr, int length){
        if(length==-1){
            return 0;
        }
        return arr[length]+ calcSum(arr, length-1);
    }
}


// import java.lang.*;
// import java.util.*;

// public class Main {
//      // recursive function
//      public static int calculate_sum(int arr[], int length)
//     {
//         // base condition - when reached -1 index return 0
//         if (length == -1) 
//         {
//             return 0;
//         }
//         // Call the function recursively to calculate the sum
//         return arr[length] + calculate_sum(arr,length - 1);
        
//     }
//     //Driver Code
//     public static void main(String[] args)
//     {
//         //Create an instance of the Scanner Class
//         Scanner sc=new Scanner(System.in);
//        // System.out.println("Enter the array size: ");
//         int n=sc.nextInt();
//         int total_sum = 0;
//         //Array Creation and Initialization
//         int arr[] = new int[n];
//       // System.out.println("Enter the array elements: ");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         // call function to calculate sum
//         total_sum = calculate_sum(arr, n-1);
//         System.out.println(total_sum);
//     }
// }
   
