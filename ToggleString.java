public class ToggleString {
    public static void main(String[] args) {
        String s = "aBCdeF";
        String res =toggle(s);
        System.out.println(res);
    }
    public static String toggle(String s){
        //construct String builder because string is immutable so to change its nature we use this
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i); //store index of char
            if(ch>='a'&&ch<='z'){
                ch= (char)(ch-'a'+'A') ; //typecasting int into char
            }
            else{
                ch=(char)(ch-'A'+'a');
            }
            sb.setCharAt(i, ch);//basically it sets the character each time after updating 
        }
        return sb.toString();//convert stringbuilder intro string (coz strings are immutable)
    }
}
