package sortAlgorithms;

public class Main {

    public static void main(String[] args){
        int[] unsortedArray = new int[] {8, 3, 9, 2, 11, 13, 54, 2, 0, 34};
        //print(BubbleSort.bubbleSort(unsortedArray));
        //print(Mergesort.mergeSort(unsortedArray));
        print(QuickSort.quickSort(unsortedArray, 0, unsortedArray.length -1));
    }

    public static void print(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
    }
}
