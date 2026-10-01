import java.util.*;
public class twoDArray {

    // Creation of 2D Array

    public static void spiral(int marks[][],int n,int m){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Digits: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                marks[i][j] = sc.nextInt();
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }



    // Spiral  Matrix


        // int SR = 0;
        // int SC = 0;
        // int ER = marks.length-1;
        // int EC = marks[0].length-1;

        // while(SR <= ER && SC <= EC){
        //     for(int j=SC;j<=EC;j++){
        //         System.out.print(marks[SR][j] + " ");
        //     }

        //     for(int i=SR+1;i<=ER;i++){
        //         System.out.print(marks[i][EC] + " ");
        //     }

        //     for(int j=EC-1;j>=SC;j--){
        //         if(SR == ER){
        //             break;
        //         }
        //         System.out.print(marks[ER][j] + " ");
        //     }

        //     for(int i=ER-1;i>=SR+1;i--){
        //         if(SC == EC){
        //             break;
        //         }
        //         System.out.print(marks[i][SC] + " ");
        //     }
        //     SR++;
        //     SC++;
        //     ER--;
        //     EC--;
        // }
        // System.out.println();


    // Diagonal Sum 

        int sum = 0;
        // for(int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[0].length;j++){
        //         if(i==j){
        //             sum += marks[i][j];
        //         }
        //         else if(i+j==marks.length-1){
        //             sum += marks[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);



    // Diagonal Sum More Optimize Way

        // for(int i=0;i<marks.length;i++){
        //     sum += marks[i][i];

        //     if(i != marks.length-i-1){
        //         sum += marks[i][marks.length-i-1];
        //     }
        // }
        // System.out.println(sum);
    
    }


    // Search in Sorted Matrix


    public static boolean search(int marks[][],int n,int m,int key){
        int row = 0,col = marks[0].length-1;

        while(row<marks.length && col >= 0){
            if(marks[row][col] == key){
                System.out.print("Found at: " + row + "," + col);
                return true;
            }
            else if(key < marks[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return  false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Row of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter Your Column Digit: ");
        int m = sc.nextInt();
        int marks[][] = new int[n][m];
        int key = 7;
        spiral(marks,n,m);
        search(marks, n, m, key);
    }
}
