public class RotateAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k =3;
        rotate(arr, k);
    }
    public static void reverse(int[] arr, int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void display(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int[] arr, int k){
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        display(arr);
    }
}
