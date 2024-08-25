package selectionsort;

public class selectionSort {

    public void printarr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void selectMin(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            // Find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[minindex]) {
                    minindex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = ar[minindex];
            ar[minindex] = ar[i];
            ar[i] = temp;
        }
    }

}
