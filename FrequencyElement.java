public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,4,5,3,5,6};
        int[] fr = new int[arr.length];

        int visited = -1;

        for(int i=0;i<arr.length;i++){
            int count =1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]= visited;
                }

            }
            if(fr[i]!=visited){
                fr[i]=count;
            }

        }
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited){

                            System.out.print(" "+arr[i]+"  |  "+fr[i]+" ");
        }
        System.out.println("---------------------------------------");  
        }
    }
}
