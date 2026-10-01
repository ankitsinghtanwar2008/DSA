import java.util.*;

public class PracticeQuestion {
    public static void main(String[] args) {

// Question 1

        Scanner sc = new Scanner(System.in);
        int first, second, third;

        System.out.print("Enter Your First Number: ");
        first = sc.nextInt();

        System.out.print("Enter Your Second Number: ");
        second = sc.nextInt();

        System.out.print("Enter Your Third Number: ");
        third = sc.nextInt();

        System.out.println("The Average Should be: " + (first + second + third) / 3);



// Question 2

    System.out.print("Enter the Side of an Square: ");
    int side = sc.nextInt();
    System.out.println("The Area of that Square should be: " + side*side);



// Question 3

System.out.print("Enter the cost of Pencil: ");
int Pencil = sc.nextInt();

System.out.print("Enter the cost of Pen: ");
int Pen = sc.nextInt();

System.out.print("Enter the cost of Eraser: ");
int Eraser = sc.nextInt();

double total  = Pencil + Pen + Eraser;
double gst = total * 18 / 100.0;
double finalAmount = total + gst;

System.out.println("Total Cost with 18% GST: " + finalAmount);



    }
}



