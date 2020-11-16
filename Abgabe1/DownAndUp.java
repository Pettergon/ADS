public class DownAndUp {

        public static void main(String []args){
            
            //change this number to test
            int number = 4;
            
            down_and_up(number);
        }

    /** Function that counts from x to zero and back up again with recursion
     *
     * @param x
     */
    public static void down_and_up(int x){
            System.out.print(x + " ");
            if(x > 0){
                down_and_up(x-1);
                System.out.print(x + " ");
            }
        }
}
