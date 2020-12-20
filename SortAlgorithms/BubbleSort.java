package sortAlgorithms;

public class BubbleSort {

    /** Sorting an array by looping through the unsorted rest of the array
     *  for each element and swapping the element i with the element i+1 if
     *  i+1 is smaller than i.
     *  This pushes the largest element to the back of the unsorted array
     *  and the array starts being sorted at the end
     *  O(n²)
     *
     * @param a unsorted array
     * @return  sorted array
     */
    public static int[] bubbleSort(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j+1]){
                    // swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
