import java.util.Arrays;

public class DivideAndConquer {

    // create empty array with length 15 (any 2^n-1 goes, höhe needs to be adjusted)
    public static int[] ruler = new int[15];

    public static void main(String []args){
        Arrays.fill(ruler, 0);
        lineal(0, ruler.length-1, 4);

        //print array to see if it worked
        System.out.println(Arrays.toString(ruler));
    }

    /** Fills an Array with heights logarithmically
     *
     * Function is not supposed to accept an array so its declared outside
     * and the function is void
     *
     * @param links left boundary
     * @param rechts right boundary
     * @param höhe height
     */

    public static void lineal(int links, int rechts, int höhe){
        int mitte = (rechts + links) / 2;
        if(links == rechts) {
            ruler[links] = höhe;
            return;
        }
        lineal(links, mitte , höhe-1);
        lineal(mitte + 1, rechts, höhe-1);
        ruler[mitte] = höhe;
    }
}
