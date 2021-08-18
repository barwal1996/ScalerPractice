class FunctionDemo{
    public static void main(String[] args) {
        func1(); //call a function method
        //add(3, 4);
        int c = add1(3, 4);
        System.out.print(c);
    }

    public  static void func1() //function declaration
     {
        System.out.println("Hi , function1");
    }
    public static void add(int a,int b)
    {
        int c = a +b;
        //local variable - value of variable is limited to this method body only
        System.out.print(c);
    }
    public static int add1(int a,int b) {
        return a+b;
    }
    
}