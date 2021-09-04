import java.util.Scanner;

public class findNthLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt(); //length of array
        
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt(); //read input from the user
        }

        System.out.println("Third Largest: "+findThirdLargest(a,7));  
        //findThirdLargest(a, n);
        System.out.println();
        sc.close();
    }
    static  int findThirdLargest(int a[],int total)
    {
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-3];
    }
}
