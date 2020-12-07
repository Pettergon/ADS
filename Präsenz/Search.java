public class Search {

    public static void main(String[] args){
        int[] a = { 931046, 931051, 931193, 931431, 931434, 931560, 931579, 931602, 931717, 931984, 932056, 932089, 932127, 932219, 932303, 932444, 932559, 932714, 932747, 932788};
        int searchedNumber = 9317717;

        System.out.println( "(Linear) Number was found at index: "+ linearSearch(a, searchedNumber));
        System.out.println( "(Binary recursive) Number was found at index: "+ binarySearch(a, 0, a.length-1, searchedNumber));
        System.out.println( "(Binary iteratively) Number was found at index: "+ binarySearchIterative(a, searchedNumber));

    }

    public static int linearSearch(int[] a, int nr){
        for (int i = 0; i < a.length; i++){
            if(a[i] == nr){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a,int left, int right, int nr){
        int mid = (left+right)/2;
        if(a[mid] == nr){
            return mid;
        }
        if(left == right){
            return -1;
        }
        if(a[mid] < nr){
            return binarySearch(a, mid + 1, right, nr);
        }else{
            return binarySearch(a, left, mid -1 , nr);
        }
    }

    public static int binarySearchIterative(int[] a, int nr){
        int left = 0;
        int right = a.length -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == nr){
                return mid;
            }else if(a[mid] < nr){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
