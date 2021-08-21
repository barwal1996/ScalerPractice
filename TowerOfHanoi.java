/*
output is : 
Move the 1th disc from Ato B
Move the 2th disc from Ato C
Move the 1th disc from Bto C
Move the 3th disc from Ato B
Move the 1th disc from Cto A
Move the 2th disc from Cto B
Move the 1th disc from Ato B

*/
public class TowerOfHanoi {
    public static void main(String[] args) {
        toh("A","B","C",3);
    }
    public static void toh(String src, String dest, String helper, int n){

        //base case
        if(n==0){
            return ;
        }
        //step 1 move n-1 disc from src to helper
        toh(src,helper,dest,n-1);

        //step-2 move nth disc from src to dest
        System.out.println("Move the "+n+"th disc from "+src+" to "+dest);

        //step-3 Move n-1 disc from helper to dest
        toh(helper,dest,src,n-1);

    }
}
