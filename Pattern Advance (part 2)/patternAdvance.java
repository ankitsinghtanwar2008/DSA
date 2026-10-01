import java.util.*;
public class patternAdvance{

// Print Hollow rectangle
    public static void hollow(int rows,int column){
        for(int i =1;i<=rows;i++){
            for(int j=1;j<=column; j++){
                if(i==1 || j ==1 || i == rows || j == column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


// Inverted & Rotared Half-pyramid
    public static void inverted(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



// Inverted Half-Pyramid with Numbers
    public static void number(int rows){
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }



// Floyd's Triangle
    public static void floyd(int rows){
        int counter = 1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }



// 0-1 Triangle
    public static void triangle(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }



// Butterfly Pattern
    public static void butterfly(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }




// solid Rhombus
    public static void rhombus(int rows){
        for(int i=1;i<rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        

// // Hollow Rhomnus
    public static void hollow_rhombus(int rows,int column){
        for(int i=1;i<rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=column;j++){
                if(i==1 || i==rows || j==1  || j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



// Diamond Pattern
    public static void diamond(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            } 
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows;i>0;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            } 
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no. of Column: ");
        int column = sc.nextInt();
        hollow(rows, column);
        inverted(rows);
        number(rows);
        floyd(rows);
        triangle(rows);
        butterfly(rows);
        rhombus(rows);
        hollow_rhombus(rows, column);
        diamond(rows);
    }
}