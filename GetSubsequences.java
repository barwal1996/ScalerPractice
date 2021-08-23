import java.util.ArrayList;
/*
output : [, a, b, ab, c, ac, bc, abc]
*/
public class GetSubsequences {
    public static void main(String[] args) {
     System.out.println(gss("abc"));   
    }
    public static ArrayList<String> gss(String str){

        if(str.length()==0){
            ArrayList<String> br = new ArrayList<String>();
            br.add("");
            return br;

        }
        char ch = str.charAt(0);
        
        String ros = str.substring(1); //rest of string 
        ArrayList<String> RecAns = gss(ros); //recursion calling it and storing it into Recursive Answer Recans


        ArrayList<String> myRes = new ArrayList<String>();
        for(int i =0;i<RecAns.size();i++){
            String s1 = RecAns.get(i);
            myRes.add(s1); //ch is not coming
            myRes.add(ch+s1); //ch is coming
        }
        return myRes;
    }
}
