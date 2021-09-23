package sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {5,2,13,11,10,9,20,2};
        mergeSort(a);
        printArray(a);

    }

    private static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr) {

        mergeRecursion(arr,0,arr.length-1);
    }

    private static void mergeRecursion(int[] arr, int p, int r) {
        if(r<=p){
            return;
        }

        int q = (p + r) / 2;
        mergeRecursion(arr, p, q);
        mergeRecursion(arr, q + 1, r);
        merge(arr, p, q, r);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] a = new int[end-start+1];
        int k = 0;
        int left = start;
        int right = mid+1;

        while(left <= mid && right <= end) {
//            System.out.println("left "+  left + " right "+ right);
            if(arr[left] < arr[right]){
                a[k] = arr[left];
                left=left+1;
            }else{
                a[k] = arr[right];
                right=right+1;
            }
            k=k+1;

        }

        if(left <= mid){
            while(left<=mid) {
                a[k] = arr[left];
                left = left + 1;
                k = k + 1;
            }
        }
        else{
            while (right <= end){
                a[k] = arr[right];
                right = right + 1;
                k = k + 1;
            }
        }
        for(int i = 0 ; i < a.length;i++){
            arr[start+i] = a[i];
        }
    }
}
