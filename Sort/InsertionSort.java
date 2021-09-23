package sort;

public class InsertionSort {


    public static void main(String[] args) {
        int[] a = {5,2,3,1};
       //printArray(a);
        insertionSort(a);
        printArray(a);

    }

    private static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        for(int i = 1 ; i < arr.length; i++){
            int element = arr[i];
            int j = i-1;
            while ( j>=0 && element < arr[j] ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =  element;
        }
        //return arr;
        }
}

/*

4 7 2 3 9 10 20
4 7 2 3 9 10 20
4 2 7 3 9 10 20
2 4 7 3 9 10 20
2 4 3 7 9 10 20
2 3 4 7 9 10 20

 */