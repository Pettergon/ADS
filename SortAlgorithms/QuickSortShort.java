package sortAlgorithms;

public class QuickSortShort {

    public static int[] quickSort(int[] a, int left, int right){

        if(left < right) {
            int pivotElement = a[right];
            int pivotIndex = left -1 ;

            for(int i = left; i <= right; i++){

                if(a[i] <= pivotElement){
                    pivotIndex++;
                    int temp = a[i];
                    a[i] = a[pivotIndex];
                    a[pivotIndex] = temp;
                }
            }
            quickSort(a, left, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, right);
        }
        return a;
    }
}
