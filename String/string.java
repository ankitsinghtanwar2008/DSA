import java.util.*;
public class string {

    // public static boolean isPalidrome(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i) != str.charAt(str.length()-1-i)){
    //             return  false;
    //         }
    //     }
    //     return true;
    // }




    // public static float shortestPath(String str){
    //     int x=0,y=0;
    //     for(int i=0;i<str.length();i++){
    //         int dir = str.charAt(i);
    //         if(dir == 'E'){
    //             x++;
    //         }else if(dir == 'W'){
    //             x--;
    //         }else if(dir == 'N'){
    //             y++;
    //         }else{
    //             y--;
    //         }
    //     }
    //     int x2 = x*x;
    //     int y2 = y*y;
    //     return (float)Math.sqrt(x2 + y2);
    // }



    // public static String subString(String str,int si,int ei){
    //     String subStr = "";
    //     for(int i=si;i<ei;i++){
    //         subStr += str.charAt(i);
    //     }
    //     return subStr;
    // }


    // public static String upperCase(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    //     for(int i=1;i<str.length();i++){
    //         if(str.charAt(i) == ' ' && i < str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         }else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }



    // public static String compress(String str){
    //     String newStr = "";
    //     for(int i=0;i<str.length();i++){
    //         Integer count = 1;
    //         if(str.charAt(i) == str.charAt(i+1) && i < str.length()-1){
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if(count > 1){
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }



    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = "aaabbcccdd";
        // System.out.print(upperCase(str));
        // System.out.print(compress(str));



        // String fruits[] = {"Mango","Apple","Banana"};
        // String largest = fruits[0];
        // for(int i=0;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.print("The largest String Should be: " + largest);


        // System.out.print(subString(str,0,4));
        // System.out.print(shortestPath(str));
        // System.out.print(isPalidrome(str));
    }
}
