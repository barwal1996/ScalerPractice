import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        //pat1(5);
        //pat2(5);
        pat3(5);
        //pat4(5);
        pat5(5);
        //Scanner s = new Scanner(System.in);
        
    }
    public static void pat1(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    for printing pattern 
    1
    2 3
    4 5 6
    7 8 9 10
    */
    public static void pat2(int n)
    {
        int val=1;
        for(int i=1;i<=n;i++)
        {
             for(int j =1;j<=i;j++)
             {
                 System.out.print(val+" ");
                 val++;
             }
             System.out.println();
        }
    }
/*

*****
****
***
**
*

*/
    public static void pat3(int n){
        int stars = n;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars--;
        }
    }
    /*
    print 
    1 
    1 2
    1 2 3 
    1 2 3 4
    */
    public static void pat4(int n){
        //int val = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {   
                if(i==j)
                {
                    System.out.print(j);//used to avoid the space at the last element of each row
                }
                else
                    System.out.print(j+" ");
                //val++;
                
            }
            
            System.out.println();
           // val++;
        }
    }
/*
Full pryamid

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/
        public static void pat5(int n){
            //   int k =n-1;
               for(int i =1;i<=n;i++){
                   for(int j=n-i;j>=1;j--){
                       System.out.print(" ");
                   }
                   for(int l = 1;l<=i;l++)
                   {
                       System.out.print("* ");
                       
                   }
                   System.out.println();
               }
    }
}
        
    

