public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = {
            {11,12,13,14},
            {21,22,23,24},
            {31,32,33,34},
            {41,42,43,44}
        };
        wavePrint(arr);
    }
    public static void wavePrint(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
            for(int row = 0;row<arr.length;row++)
            

                {
                System.out.print(arr[row][col]+" ");
            }
        }
            else{
                for(int row=arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
        }
    }

