/*
output is : 
1.q1b0q2b1
2.q1b0q2b2
3.q1b0q2b3
4.q1b1q2b0
5.q1b1q2b2
6.q1b1q2b3
7.q1b2q2b0
8.q1b2q2b1
9.q1b2q2b3
10.q1b3q2b0
11.q1b3q2b1
12.q1b3q2b2
*/
public class QueenPermutations {
    public static void main(String[] args) {
    boolean[] boxes = new boolean[4];
    queenPermutations(boxes, 0, 2, "");        
    }
    /*
    qpsf= queen places so far 
    ansf = answer so far
    tq = total queens
    boxes= total no. of boxes

    Initially , all boxes are empty so we will take False at each box ,that box is empty
    */
    static int counter = 0;
    public static void queenPermutations(boolean[] boxes,int qpsf,int tq,String ansf) {

        if(tq==qpsf){
            counter++;
            System.out.println(counter+"."+ansf);
            return ;
        }

        //making call using recursion
        for(int i =0;i<boxes.length;i++){
            if(boxes[i]==false){
                boxes[i]=true;
                queenPermutations(boxes, qpsf+1, tq, ansf+"q"+(qpsf+1)+"b"+i);
                boxes[i]= false;
            }
        }

        
    }
}
