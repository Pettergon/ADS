public class Fibonacci {

    public static int durchlaufe = 0;

    public static void main(String[] args){
        long startzeit = System.nanoTime();

        //Gewünschte Funktion auskommentieren (immer die erste die ist cooler)

        System.out.println(fibonacciIterativ(30));
        //System.out.println(fibonacci(30));

        System.out.println("Iterations: " + durchlaufe);
        System.out.println("Time in nanoseconds: " + new Long(System.nanoTime() -startzeit));
    }

    /** die langsame blöde rekursionsfibonaccifunktion
     *
     * @param n
     * @return n-te fibonacci zahl
     */
    public static int fibonacci(int n){
        if (n == 0 || n== 1 ){
            durchlaufe++;
            return n;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }


    /** Die coole schnelle iterativfibonaccifunktion
     *
     * @param n
     * @return n-te fibonacci zahl
     */
    public static int fibonacciIterativ(int n){
        int a = 1;
        int b = 1;
        int c = 1;
        if(n<=1){
            return n;
        }
        for (int i=3; i <= n; i++){
            durchlaufe++;
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
