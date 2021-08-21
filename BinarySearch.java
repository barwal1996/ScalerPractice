public class BinarySearch {
    public static void main(String[] args) {
     int[] arr = {2,3,4,6,23,56};
     //binarySearch(arr,3);
     System.out.println(binarySearch(arr, 3));   
    }
    public static int binarySearch(int[] arr,int x){
        int l =0;int r= arr.length-1;
        while(l<=r){
            int mid = l+ (r-l)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

        return -1;
    }
}
