import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();
        int sum=0;//for decimal or fraction value take sum as double
        double sum1=0;
        // x^1 +x^2+ x^3 +.. +N in this case take int x= sc.nextInt()
        for(int i=1,a=1;i<=n;i++,a++)
            {
                 sum1=sum1+ Math.pow(x,a);
            }
            System.out.print(sum1+" ");
            System.out.println("-------------------------");
     /*
            1/10 +2/9 +3/8 +.. N
            here we take two var a = numerator b =demoninator
            typecast a/b into double ,, because if int/int it will truncate the decimal values
     */

            for(int i=1,a=1,b=10;i<=n;i++,a++,b--){
                sum1=sum1+ (double)a/b;
            }
            System.out.print(sum1+ " ");
            sc.close();
        
    
/*

Geometric Series = In this every number is divided by the fix number 
2  4  8  16 ... N

*/

 System.out.println("Geometric Series ");
        for(int i=1,k=2;i<=n;i++,k*=2){
            sum = sum +k;
        }
        System.out.print(sum+ " ");


        }
}
