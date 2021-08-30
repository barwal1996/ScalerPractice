import java.util.Scanner;

/*
Given a string A of lowercase English alphabets, find and return a string which is the longest 
subsequence of vowels in the string A.

Input 1:
   abcdye
Output 1:
    ae


*/

public class subsequenceVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String f= scan.next();
       String fs = vowelIt(f);
       System.out.println(fs); 
       scan.close();
    }
    public static String vowelIt(String A){
        String str = "";
        char[] s= A.toCharArray();

        for(int i =1;i<=A.length();i++){
            if(isVowel(s[i])){
                str +=s[i];
            }
        }
        return str ;
    }
    static boolean isVowel( char c){
        return (c == 'a' || c == 'e' || c == 'i'
        || c == 'o' || c == 'u');
    }


}
