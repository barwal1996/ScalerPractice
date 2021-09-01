import java.util.Scanner;

/*

Approach -:
1) Always print row by row
2) calculate size of row first 
3)Putting together nested loop

take one either index j<0 to n
or j=1 to <=n
for printing stars

outer loop hold for rows
inner loop hold for stars


*/

public class PatternPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        pat1(n);
        pat2(n);
        pat3(n);
        pat4(n);
        pat5(n);
        floyd(n);
        sc.close();
    }
    public static void pat1(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

    }
    public static void pat2(int n){
        for(int i =1;i<=n;i++){
            for(int j =i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

    }
    /*Right sided Triangle
    
    *
   **
  ***
 **** 
 It comprise of first decreasing pattern of space another is increasing order of stars
 */
    public static void pat3(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
         System.out.println();
            
        }
        System.out.println("----------------------------------");
    }

/*

Number Pattern program =Consists of PAttern +number 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

Pattern = Increasing Order
Number = Increasing Row number

*/
public static void pat4(int n){
    for(int i =1,p=1;i<=n;i++,p++)
    {
        for(int j=1;j<=i;j++){
            System.out.print(p+" ");//here we can print i+ but it will create confusion so will take another var
        }
        System.out.println();
    }
    System.out.println("-------------------------------------------");
}
/*

Change in column numbers
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

In this , we will take another var p=1 inside the row loop and increment it in j loop

*/
public static void pat5(int n) {
    for(int i =1;i<=n;i++){
        int p=1;
        for(int j =1;j<=i;j++){
            System.out.print(p++ +" ");
        }
        System.out.println();
    }
    System.out.println("------------------------------------");
}

/*

Floyd Triangle 
1
2 3 
4 5 6
7 8 9 10

In this , we declare and initialize var outside the loop and increment inside j loop
Every row there is different number
*/

public static void floyd(int n) {
    int p=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(p++ +" ");
        }
        System.out.println();
    }
}

}
