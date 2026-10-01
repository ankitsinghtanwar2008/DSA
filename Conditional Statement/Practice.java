
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// Find Even and Odd
    int a = 12;
    if(a%2==0){
        System.out.println("Yes Even");
    }else{
        System.out.println("Yes Odd");
    }


// Find the tax According to Income
        System.out.println("Enter Your Income First: ");
        double income = sc.nextDouble();
        int tax;
        if(income<500000){
            System.out.println("You don't need to pay tax% 😊 ");
            tax = 0;
        }else if(income>500000 && income < 1000000){
            System.out.println("You Should pay 20% of tax from your income ");
            tax = (int) (income*0.2);
        }else{
            System.out.println("You Should Pay 30% of tax from your income ");
            tax = (int) (income * 0.3);
        }
        System.out.println("Total tax Should be: " + tax);


// Check if a Student is Pass or Fail
    System.out.println("Enter Your Marks here: ");
    float marks = sc.nextFloat();
    if(marks<=33){
        System.out.println("Sorry, You are fail.");
    }else{
        System.out.println("Congractulation, You are Pass.");
    }


// Making a Calculator
    System.out.println("Multiplication Press 1");
    System.out.println("Dividation Press 2");
    System.out.println("Addition Press 3");
    System.out.println("Subtraction Press 4");
    int number = sc.nextInt();
    System.out.println("Enter Your First Digit for Doing Progress: ");
    int number1 = sc.nextInt();
    System.out.println("Enter Your Second Value for Doing Progress: ");
    int number2 = sc.nextInt();
    switch(number){
        case 1: System.out.println(number1*number2);
                    break;
        case 2: System.out.println(number1/number2);
                    break;
        case 3: System.out.println(number1+number2);
                    break;
        case 4: System.out.println(number1-number2);
                    break;
        default: System.out.println("Sorry, Incorrect input!!");
    }


    }
}
