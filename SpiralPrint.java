import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        int[][] arr = {
            {11,12,13,14},
            {21,22,23,24},
            {31,32,33,34},
            {41,42,43,44}
        };
        spiralPrint(arr);
    }
     public static void spiralPrint(int[][] arr) {
        int minr=0; //left
        int maxr= arr.length-1; //bottom
        int minc= 0; //right
        int maxc= arr[0].length-1; //top

        int tne = arr.length*arr[0].length;  //row * col = total no. of ele

        while(tne>0){
            //left wall 
            for(int i = minr;i<=maxr;i++){
                System.out.print(arr[i][minr]+" ");
                tne--;
            }
            minc++;

            //bottom wall 
            for(int i =minc;i<=maxc;i++){
                System.out.print(arr[maxr][i]+" ");
                tne--;
            }
            maxr--;
            //right wall
            for(int i=maxr;i>=minr;i++){
                System.out.print(arr[i][maxc]+" ");
                tne--;
            }
            maxc--;

            //top wall
            for(int i=maxc;i>=minc;i++){
                System.out.print(arr[minr][i]+" ");
                tne--;
            }
            minr++;
        }

    }
}
