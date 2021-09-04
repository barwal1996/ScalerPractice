/*

Print element at even position
Loop through the array by incrementing value of i by 2  
        for (int i = 1; i < arr.length; i = i+2) {  

Print element ar odd position
Loop through the array by incrementing value of i by 2  
        for (int i = 0; i < arr.length; i = i+2) {  

*/
public class DuplicateEle {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,2,4,6,32,1};
        System.out.println("Printing Duplicate element from array");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate ELements are "+arr[j]+" ");
                }
            }
        }
    }
}
