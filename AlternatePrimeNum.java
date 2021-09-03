import java.util.Scanner;

public class AlternatePrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        alternativePrime(num);
        sc.close();
    }
    static int checkPrime(int n){
        int i,flag=0;

        for(i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
            if(flag==0){
                return 1;
            }
            else 
                return 0;
        
    }
    static void alternativePrime(int num){
        int temp=2;
        //if the value of temp variable is odd, we do not print the prime number  
//if the value of temp variable is even, we print the prime number  
        for(int n=2;n<=num-1;n++){
            if(checkPrime(n)==1){
                if(temp%2 ==0)
                System.out.print(n+" ");
                temp++;
            }
        }

    }
}
