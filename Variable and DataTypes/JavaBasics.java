import java.util.*;

// BoilerPlate Code
public class JavaBasics{
    public static void main(String[] args) {
        System.out.println("Ankit Singh");


// Data Types in Java
    int a = 10;
    byte b = 21;
    char ch = 'A';
    boolean c = false;
    float price  = (float) 50.5;  
    double rate = 1000.5666;
    short n = 240;

// Input in Java
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(input);  

    int number = sc.nextInt();
    System.out.println(number);
    

// Type Casting
    char x = 'a';
    char y = 'b';
    System.out.println((int)a);
    System.out.println((int)b);

// Type Promotion in expressions
    System.out.println(a-b);



    }
}