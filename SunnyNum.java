import java.util.Scanner;

//Sunny num = If num given to the next num is perfect square ,then it is sunny num . eg 80
public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        checkSunny(N);
        sc.close();
    }
    static boolean checkPerfectSquare(double x){
        double sr = Math.sqrt(x);
        return ((sr- Math.floor(sr))==0);
    }
    static void checkSunny(int N){
        if(checkPerfectSquare(N + 1)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
