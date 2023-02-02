public class Commit2 {
    public static void main(String[] args){

        int[] arr = new int[5];
        arr[0]=7;
        arr[1]=5;
        arr[2]=3;
        arr[3]=1;
        arr[4]=2;
        int n = arr.length;
        int min;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       
    }
}
