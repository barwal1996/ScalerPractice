public class RotateLeftEle {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("Priniting Original Array first");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        int n=3,j;//number of rotations
        for(int i=0;i<n;i++){ //code for rotations
      
        int first;
        first =arr[0];

        for(j=0;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        arr[j]=first;


    }
    System.out.println();
    //displaying
    System.out.println("Array after left rotation: ");  
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    }
}
