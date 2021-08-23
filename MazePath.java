public class MazePath {
    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "");
    }
    //psf= path so far
    public static void mazePath(int sr,int sc, int dr, int dc, String psf) {
        
        if(sr==dr && sc ==dc){
            System.out.println(psf);
            return ;
        }
        if(sr>dr || sc>dr){
            return;
        }

        //call for horizontal path 
        mazePath(sr, sc+1, dr, dc, psf+"H");

        //call for vertical path 
        mazePath(sr+1, sc, dr, dc, psf+"V");


    }
}
