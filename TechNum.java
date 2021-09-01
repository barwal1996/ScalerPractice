import java.util.Scanner;

public class TechNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // checkTechNum(n);
        if(checkTechNum(n))
      System.out.println(n+" is a"
		    + " tech number");
      else
      System.out.println(n+" is not a"
	      	  + " tech number");
        sc.close();
    }
    static boolean checkTechNum(int n){
        int num ,firstHalf,secondHalf;
        int sum=0;int count=0;
        num = n;

        while(num!=0){
             num/=10;
             count++;
        }
        if(count%2 !=0)
            return false;

        //calculate halves
        firstHalf = n/(int)Math.pow(10, count/2);
        secondHalf = n%(int)Math.pow(10,count/2);

        sum=firstHalf+secondHalf;

        if(sum*sum == n)
            return true;
        
        return false;
    }
}
