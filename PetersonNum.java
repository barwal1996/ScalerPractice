//Peterson Number = Sum of factorials of digits is equal to the number itself 

import java.util.Scanner;

public class PetersonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=  sc.nextInt();

        int f =1;
        int temp = n;
        int sum=0;
        while(n!=0){
            f=1;
            int digit = n%10;

            for(int i=1;i<=digit;i++){
                f=f*i;
               
            }
            sum= sum+f;
            n=n/10;
        }
        if(sum==temp){
            System.out.print("Peterson number found");
        }
        else{
            System.out.print("Not found");
        }
        sc.close();
    }
}
