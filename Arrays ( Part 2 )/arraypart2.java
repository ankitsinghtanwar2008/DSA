public class arraypart2 {

// Max Sum of an subArray {By basic Method time complexcity = o(n, pow3)}
    // public static void maxSubArraySum(int marks[]){
    //     int subSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i=0;i<marks.length;i++){
    //         int start = i;
    //         for(int j=i;j<marks.length;j++){
    //             int end = j;
    //             subSum = 0;
    //             for(int k=start;k<=end;k++){
    //                 subSum += marks[k];
    //             }
    //             System.out.println(subSum);
    //             if(maxSum < subSum){
    //                 maxSum = subSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum: " + maxSum);
    // }



// Max Sum of an Array {By Prefix Array}
    // public static void maxSubArraySum(int marks[]){
    //     int subSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int Prefix[] = new int[marks.length];
    //     Prefix[0] = marks[0];
    //     for(int i=1;i<Prefix.length;i++){
    //         Prefix[i] = Prefix[i-1] + marks[i];
    //     }

    //     for(int i=0;i<marks.length;i++){
    //         int start = i;
    //         for(int j=i;j<marks.length;j++){
    //             int end = j;
    //             subSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start - 1];
    //             if(maxSum < subSum){
    //                 maxSum = subSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum: " + maxSum);
    // }



// Kadane's Algorithem
    // public static void Kadane(int marks[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;

    //     for (int i=0;i<marks.length;i++){
    //         cs += marks[i];
    //         if(cs<0){
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
    //     System.out.println("The Maximum Sum: " + ms);
    // }




// Trapping Water
    // public static int trappedRainwater(int height[]){
    //     int n = height.length;


    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];
    //     for(int i=1;i<n;i++){
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     } 


    //     int rightMax[] = new int[n];
    //     rightMax[n -1] = height[n -1];
    //     for(int i=n-2;i>=0;i--){
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }
        
    //     int trappedWater = 0;
    //     for(int i=0;i<n;i++){
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]); 
    //         trappedWater += waterLevel - height[i];
    //     }
    //     return  trappedWater;
    // }


    
// Buy And Sell Stocks 
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;  // Today's Profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String arg[]){
    // int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};
    // int marks[] = {1,-2,6,-1,3};
    // int height[] = {4, 2, 0, 6, 3, 2, 5};    
    // int marks[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    // maxSubArraySum(marks);
    // Kadane(marks);
    // System.out.println(trappedRainwater(height));
    int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.println(buyAndSellStocks(prices));
    }
}
