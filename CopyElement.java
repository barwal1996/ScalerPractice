public class CopyElement {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};

        int[] arr2 = new int[arr1.length];

        //copying elements 
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];

        }
        //displaying
        System.out.println("Elements in arr1 ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(i+" ");
        }
        System.out.println("");

        //arr2 elements
        System.out.println("Elements in arr2 ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(i+" ");
        }

    }
}
