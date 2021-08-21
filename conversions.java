public class conversions {
    public static void main(String[] args) {
        decToBin(25);
        binToDec(101001);
        decToOct(210);
        octTodec(421);
        int ans = anyToany(205, 8, 2);
        System.out.println(ans);
    }
    public static int decToBin(int dec){
        int rem =0;int pow =1;
        int bin=0;
        while(dec!=0){
            rem = dec%2;              // take mode from  db(destination base)
            bin = bin +rem*pow;        // update the bin value 
            pow=pow*10;                 // update the power  by multiplying  it with source base
            dec=dec/2;              //divide given no. by db
        }
        System.out.print(bin);
        return bin;
    }
    public static int binToDec(int bin){
        int dec=0; int pow=1; //sb =2 db=10
        while(bin!=0){
            int rem = bin%10;
            dec = dec+rem*pow;
            pow=pow*2;
            bin=bin/10;
        }
        System.out.print(dec);
        return dec;
    }
    public static int decToOct(int dec){
        int oct = 0;int pow=1;
        while(dec!=0){
            //sb =10 db =8
            int rem = dec%8;
            oct = oct + rem*pow;
            pow=pow*10;
            dec=dec/8;
        }
        System.out.println(" "+oct);
        return oct;
    }
    public static int octTodec(int oct){
        int dec =0;int pow=1;
        while(oct!=0){
            int rem = oct%10;
            dec = dec +rem*pow;
            pow=pow*8;
            oct = oct/10;
        }
    System.out.println(" "+dec);        
        return dec;
    }
    // convert octal to binary
    public static int anyToany(int num,int sb,int db){
        int dec = anyToDec(num,sb);
        int ans  = DecToany(dec,db);

        //System.out.println(ans);
        return ans;
    }
    public static int anyToDec(int num , int sb){
        int dec = 0;int pow=1;
        //sb -> given  db = 10
        while(num!=0){
            int rem = num%10;
            dec = dec +rem*pow;
            pow=pow*sb;
            num= num/10;
        }
        return dec;    
    }
    public static int DecToany(int num, int db){
        int ans =0;int pow = 1;
        while(num!=0){
            int rem = num %db;
            ans = ans+rem*pow;
            pow = pow*10;
            num = num/db;
        }
        return ans;
    }
}
