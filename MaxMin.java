public class MaxMin {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,443,2,5};
        int max = MaxMin(arr);
        System.out.println(max);

        int min = Min(arr);
        System.out.println(min);
    }
    public static int MaxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        return max;

    }
    public static int Min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
