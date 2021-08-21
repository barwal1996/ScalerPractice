//import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class printArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        //int idx;
        printArray(arr,0);
    }
    public static void printArray(int [] arr , int idx){

        if(idx==arr.length){
            return;
        }
        //printArray(arr, idx+1); // pre -area will give element of array in reverse order
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1); // this will give element in the order they are inserted.
    }
}
