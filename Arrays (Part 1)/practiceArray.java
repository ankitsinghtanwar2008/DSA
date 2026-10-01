import java.util.*;
public class practiceArray {
    public static void pairs(int number[]){
        int tp = 0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print(curr + number[j]);
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {9,8,7,6,5};
        pairs(number);
    }
}
