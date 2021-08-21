import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            System.out.print(1);
        else
            System.out.print(0);
        }
        sc.close();
    }
    
}
