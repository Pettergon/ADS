package sortAlgorithms;

public class QuickSort {

    // TODO: Comments

    public static int pivot(int[] a, int left, int right){

        // take the right most element
        int point = a[right];
        int index = left - 1;

        for(int i = left; i < right; i++){

            if(a[i] < point){
                index++;
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
        int temp = a[index + 1];
        a[index + 1] = a[right];
        a[right] = temp;

        return index + 1;
    }

    public static int[] quickSort(int[] a, int left, int right){

        if(left < right) {

            int pivot = pivot(a, left, right);

            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
        return a;

    }
}
