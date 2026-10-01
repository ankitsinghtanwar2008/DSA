public class Recursion {


                                        // Decreasing Order
    public static void printDec(int n){
        if(n ==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }


                                        // Increasing Order
    public static void printInc(int n){
        if(n ==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

                                    // Factorial of an Number
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }


                                   // Sum of N Numbers
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int sn1 = sum(n-1);
        int s = n + sn1;
        return s;
    }



                                // Fabonaci Series
    public static int fabo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fabo(n-1);
        int f2 = fabo(n-2);
        int f = f1 + f2;
        return f;
    }
    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.print(fabo(n));
        for(int i=0;i<=n;i++){
            System.out.print(fabo(i) + " ");
        }
    }
}
