public class SortArrAscending {
    public static void main(String[] args) {
        int[] arr= new int[]{4,3,2,1,5};
        //print original array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    //sorting elements in ascending order
    int temp=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }



    System.out.println("Displaying element in ascending order");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

        //sorting elements in Descending Order
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    System.out.println("Displaying element in Descending order");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
