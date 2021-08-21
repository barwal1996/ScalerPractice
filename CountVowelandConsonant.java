        
        //import java.lang.*;
        import java.util.*;
public class CountVowelandConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        
        for(int j=0;j<t;j++)// this loop running for test cases
        {
            String  str = sc.next();
            int vCount = 0, cCount = 0;    
             str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
                
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                
                vCount++;    
            }    
             
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                
                cCount++;    
            }    
        }    
        System.out.println(vCount+" "+cCount);    
        
        //sc.close();    
    }    
}   
    




    
}
