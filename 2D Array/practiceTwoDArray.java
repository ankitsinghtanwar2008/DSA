import java.util.*;
public class practiceTwoDArray {

    public static void count(int matrix[][],int transpose[][],int n,int m){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Elements of Matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    // Question 1

    //     int count = 0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j] == 7){
    //             count++;
    //         }
    //     }
    // }
    //     System.out.print("Total Count: " + count);


    // Question 2


        // int sum = 0;
        // for(int j=0;j<matrix[0].length;j++){
        //     sum += matrix[1][j];
        // }
        // System.out.print("The sum should be: " + sum);



    // Question 3
        
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            transpose[j][i] = matrix[i][j];
        }
      }

      System.out.println("The transpose Matrix: ");

      for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[0].length;j++){
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
      }
                

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Enter Row: ");
        n = sc.nextInt();
        System.out.print("Enter Column: ");
        m = sc.nextInt();
        int matrix[][] = new int[n][m];
        int transpose[][] = new int[m][n];
        count(matrix,transpose,n,m);
    }
}
