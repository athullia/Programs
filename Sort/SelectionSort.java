package sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {4, 7, 2, 3, 9, 10, 20};

        printArray(a);
        selectionSort2(a);
        printArray(a);

    }

    private static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        int min;
        int temp = 0, index = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            swapped = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                    swapped = true;
                }
            }
            if (swapped) {
                temp = arr[i];
                arr[i] = min;
                arr[index] = temp;
            }

        }
    }

    public static void selectionSort2(int[] arr) {
        int min;
        int temp = 0, index = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }
    }
}