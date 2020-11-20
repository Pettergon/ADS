public class Ggt {

    public static void main (String[] args){
        int a = 45;
        int b = 15;

        System.out.println("Recursive: " + euclidRecursive(a, b));
        System.out.println("Iterative: " + euclidIterative(a, b));
    }

    public static int euclidRecursive(int a, int b){
        if(b == a){
            return a;
        }else{
            if(a == 0){
                return b;
            }else{
                if(a > b){
                    return euclidRecursive(a - b, b);
                }else{
                    return euclidRecursive(a, b - a);
                }
            }
        }
    }

    public static int euclidIterative(int a, int b){
        if(a == 0){
            return b;
        }else{
            while(b != 0){
                if(a > b){
                    a = a - b;
                }else{
                    b = b - a;
                }
            }
            return a;
        }
    }
}
