public class Commit1{

    public static void main(String[] args){

        int[] arr = new int[5];
        arr[0]=7;
        arr[1]=5;
        arr[2]=3;
        arr[3]=1;
        arr[4]=2;
        int n = arr.length;
        for(int iter=0; iter<n-1; iter++){
            for(int j=0; j<n-iter-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       
    }

}


