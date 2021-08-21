public class ReverseString {
    public static void main(String[] args) {
        String s= "Amit";
        String res = reverseString(s);
        System.out.println(res);
    }
    
    public static String  reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l=0; int r= s.length()-1;
        while(l<=r){
            char lchar = sb.charAt(l);
            char rchar = sb.charAt(r);

            //swapping
            sb.setCharAt(l,rchar);
            sb.setCharAt(r,lchar);
            l++;
            r--;

        
    }
    return sb.toString();
}
}

