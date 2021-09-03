import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

ISBN num = It is a 10 digit number. to check given num is ISBN or not
1. Take a ten-digit ISB number from the user.
2. Check whether the user entered a ten-digit number or not because if the number is not a 
ten-digit number, it can't be an ISBN.
3. Find each digit's sum by multiplying each digit from left to right by 1, 2, 3,…….,10.
4. Find the remainder of the sum with 11. If the remainder is equal to 0, the number is an ISBN 
else, not an ISBN.

*/
public class checkISBNnum {
    public static void main(String[] args) {
        long n1,n2;
        try {
            //create BufferedReader class object to get input from user  
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter first 10 digit ISBN number");  
            n1= Long.parseLong(br.readLine());

            System.out.println("Enter second 10 digit ISBN number");  
            n2=Long.parseLong(br.readLine());

            if(checkISBNum(n1)){
                System.out.println(n1 + " is a valid ISBN number");   
            }
            else
            System.out.println(n1 + " is not a valid ISBN number");  
            
            if (checkISBNum(n2))   
            System.out.println(n2 + " is a a valid ISBN number");   
        else  
            System.out.println(n2 + " is not a valid ISBN number");  
              
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error in reading data");
        }

    }
    static boolean checkISBNum(long n){
        int sum =0;
        int i,t,intNumber,digit;
        String strNum;
        strNum=""+n;  //adding space to number(n)
        while(strNum.length()!=10){
            return false;
        }
        for(i=0;i<strNum.length();i++){
            intNumber = Integer.parseInt(strNum.substring(i, i+1)); //Convert str to Int
            digit=i+1;
            t=digit*intNumber;
            sum=sum+t;


        }
        if(sum%11==0){
            return true;
        }
        return false;
    }
}
