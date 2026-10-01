public class shortingAlgo{

// Bubble Sort
    // public static void bubbleSort(int arr[]){
    //     for(int i = 0;i<arr.length;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j] > arr[j+1]){     // use '>' for Assending Order  & use '<'  Desending Order   
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);
    //     }
    //     System.out.println();
    // }


// Selection Sort
    // public static void selectionSort(int arr[]){
    //     for(int i =0;i<arr.length-1;i++){
    //         int minPos = i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minPos] > arr[j]){
    //                 minPos = j;
    //             }
    //         }
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        // System.out.println();
    // }



// Insertion Sort
    // public static void insertionSort(int arr[]){
    //     for(int i = 1;i<arr.length;i++){
    //         int curr = arr[i];
    //         int prev = i-1;
    //         while(prev >= 0 && arr[prev] > curr){
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1] = curr;
    //     }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        // System.out.println();
    // }



// Counting Sort
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest];
        for(int i=0;i<count.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i =0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;  
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        // insertionSort(arr);
    }
}