

public class arrays{

// Linear Search
    // public static int Linear(int marks[],int target){
    //     for(int i=0;i<marks.length;i++){
    //         if(marks[i]==target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


// Largest Number
    // public  static int largest(int marks[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0;i<marks.length;i++){
    //         if(largest < marks[i]){
    //             largest = marks[i];
    //         }
    //     }
    //     return largest;
    // }

// Smallest Number
    // public static int smallest(int marks[]){
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i=0;i<marks.length;i++){
    //         if(smallest>marks[i]){
    //             smallest = marks[i];
    //         }
    //     }
    //     return smallest;
    // }



// Binary Search
    // public static int binary(int marks[], int target){
    //     int start = 0;
    //     int end = marks.length -1;
    //     while(start<=end){
    //         int mid = (start + end)/2;

    //         if(marks[mid]==target){
    //             return mid;
    //         }
    //         if(marks[mid]<target){
    //             start = mid + 1;
    //         }else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }



// Reverse an Array
    // public static void reverse(int marks[]){
    //     int first = 0, last = marks.length -1;
    //     // swap
    //     int temp = marks[last];
    //     marks[last] = marks[first];
    //     marks[first] = temp;

    //     first++;
    //     last--;
    // }



// Pairs in an Array
    // public static void pairs(int marks[]){
    //     int tp =0;
    //     for(int i=0;i<marks.length;i++){
    //         int curr = marks[i];
    //         for(int j=i+1;j<marks.length;j++){
    //             System.out.print("(" + curr + "," + marks[j] + ")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.print("Total pairs: " + tp);
    // }



// print SubArray
    public static void subArray(int marks[]){
        int ts = 0;
        for(int i=0;i<marks.length;i++){
            int start = i;
            for(int j=i;j<marks.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(marks[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArray: " + ts);
    }



    public static void main(String[] args) {
    int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};
    // int target = 14;
    // System.out.println("Key idex Should be: " + Linear(marks, target));
    // System.out.println("The Largest Value: " + largest(marks));
    // System.out.println("The Smallest Value: " + smallest(marks));
    // System.out.println("Result: " + binary(marks, target));
    // reverse(marks);
    // for(int i=0;i<marks.length;i++){
    //     System.out.print(marks[i] + " ");
    // }
    // System.out.println();
    // pairs(marks);
    subArray(marks);
    
    }
}