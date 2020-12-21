package sortAlgorithms;

public class QuickSort {

    /** Choose a pivot element. (Taking last element of array for convenience)
     * loop through all elements except the last one (since its our pivot element)
     * if we find a number smaller than the pivot element,
     * we know it needs to be on the left side of the pivot element.
     * So we swap it with the element at the current pivot index
     * (indicates smallest index with larger element than pivot element once it deviates from current index)
     * and increase the pivot index by 1. Therefore it is on the left side of the pivot element,
     * which is exactly what we want, so we can repeat the process for the left and right side
     *
     * @param a unsorted array
     * @param left left array boundary
     * @param right right array boundary
     * @return sorted array
     */
    public static int pivot(int[] a, int left, int right){

        // take the right most element of the current array as pivot element
        int pivotElement = a[right];

        // set initial pivot point to the beginning of the current array
        int pivotIndex = left;

        for(int i = left; i < right; i++){

            if(a[i] < pivotElement){

                // swaps element and pushes it to the left side of the final pivot index
                int temp = a[i];
                a[i] = a[pivotIndex];
                a[pivotIndex] = temp;
                // increase pivot index
                pivotIndex++;
            }
        }
        // swap pivot element with element at pivot point, since pivot index is final now
        // this element is now sorted (pivot element at pivot point)
        // all elements of left partial array are smaller and all right elements are bigger
        int temp = a[pivotIndex];
        a[pivotIndex] = a[right];
        a[right] = temp;

        // return pivot point
        return pivotIndex;
    }

    /** Sorting an array of Integers by choosing a pivot element,
     *  placing it in the correct spot and repeating the process of the partial array
     *  to the left and right of said element
     *  O(nlogn)
     *
     * @param a unsorted array
     * @param left left boundary of array (starts with 0 and changes in recursion)
     * @param right right boundary of array (starts with a.length -1 and changes in recursion)
     * @return sorted array
     */
    public static int[] quickSort(int[] a, int left, int right){

        // exit condition for recursion as soon as left = right we are at the smallest array possible
        if(left < right) {

            // get the pivot element
            int pivot = pivot(a, left, right);

            // now that pivot element is sorted repeat for partial arrays on left and right
            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
        return a;
    }
}
