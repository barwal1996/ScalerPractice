public class RightShiftEle {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int n=3,last,j;
        System.out.println("Displaying Original array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       
        for(int i=0;i<n;i++){
            last=arr[arr.length-1]; //here last points to the last element of array
            for(j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1]; //replace current ele with the previous ele
            }
            arr[0]=last;
        }
        System.out.println();
        System.out.println("element after rotation ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
