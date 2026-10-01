
import java.util.*;
public class function{

// function to get Product
    public static int product(int a, int b){
    int m = a*b;
    return m;
}



// function to find an factorial
    public static int factorial(int a){
        int factorial = 1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        return factorial;
    }


// Binomial Coefficant
    public static int binomial(int a,int b){
        int factN = factorial(a);
        int factR = factorial(b);
        int factNR = factorial(a-b);

        int bino = factN/(factR*factNR);
        return bino;
    }


// Check if a nuber is Prime or Not
    public static boolean  isPrime(int a){
        boolean isPrime = true;
        if(a==2){
            isPrime = true;
        }else{
            for(int i=2;i<=a-1;i++){
                if(a % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
}


// Check if a nuber is Prime or Not by Second Optimise Method  (But this code is not confirmlly Sure that it's always correct!!)
    public static boolean isPrime1(int b){
        boolean isPrime = true;
        if(b==2){
            isPrime = true;
        }else{
            for(int i=2;i<Math.sqrt(b);i++){
                if(b % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }




// Print all prime number in a Range
    public static void check(int b){
        for(int i=2;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


// Convert from Binary to Decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("The decimanl of " + myNum + " is :" + dec);
    }




// Convert from Decimal to Binary
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("The Binary of " + myNum + " is :" + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = product(a, b);
        System.out.println("Product : " + product);
        
        System.out.println("Factorial : " + factorial(a));
        System.out.println("The Binomail : " + binomial(a, b));
        System.out.println(isPrime(a));
        check(20);
        binToDec(111);
        decToBin(56);

    }
}