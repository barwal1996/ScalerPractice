import java.util.Scanner;

public class RecursionPrintDecreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //printDecreasing(n);
        printIncreasing(n);
    }
    public static void printDecreasing(int n){

        if(n==1){ 
            // set up a base condition so recursion stops here and it will not print any more number after 1
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        printDecreasing(n-1);// we are callin this function repeatedly within itself= recursion
    }
    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        //pre area
        printIncreasing(n-1);
        //post area
        System.out.println(n);
        /*all no. gets stored in stack when func return 0 it will return to function itsel
        and it comes to no.1 from there it starts printing available no. present at stack.
        */
    }
}
