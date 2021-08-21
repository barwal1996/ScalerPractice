import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // capture size of array 
        int[] arr = new int[n];//declare and inititalize an array
        for(int i = 0;i<n;i++){ //take input from user
            arr[i] = sc.nextInt();
            
        }
        //displaying input from the user
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

        System.out.println("2nd method");
        //Method 2 to print input of an array 
        //Enhance  loop 
        int[] arr1= {1,2,3,4,5};
        System.out.println(arr1.length);

        for(int ele:arr1){
            System.out.println(ele);
        }
    }
}
