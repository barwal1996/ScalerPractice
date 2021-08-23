import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>(); //created an object of Arraylist
        //adding an element into arraylist
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);

        //printing an element into arraylist
        System.out.println(arrlist);

        for(int i =0;i<arrlist.size();i++){
            System.out.println(arrlist.get(i));//this will print element present at index i 
        }

        //for -each loop
        for(int ele:arrlist){
            System.out.print(ele+" ");
            System.out.println();
        }


        //adding more elements dynamically 
        arrlist.add(60);
        arrlist.add(70);
        System.out.print(arrlist+" ");
        System.out.println();
        //adding an element at ith index
        arrlist.add(2, 100);
        System.out.print(arrlist+" ");
        System.out.println();
        //output is [10, 20, 100, 30, 40, 50, 60, 70]

        //updating values in arrlist 
        //this can be done using set properties
        arrlist.set(3, 69);
        System.out.print(arrlist+" "); //output : [10, 20, 100, 69, 40, 50, 60, 70]
        System.out.println();

        //removing an element from arrlist
        arrlist.remove(4);
        System.out.print(arrlist+" ");// output : [10, 20, 100, 69, 50, 60, 70]
        

    }

}
