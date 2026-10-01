public class loops{
    public static void main(String[] args) {

// While Loop
        int n = 0;
        while(n<=100){
            System.out.println(n++ + " " + "I love You");
        }


// for Loop
        for(int i=0;i<=100;i++){
            System.out.println(i + "I hate You");
        }

// do-While Loop
        do { 
            System.out.println("OK");
        } while (n>=10);


// Break Statement
    for(int i=1;i<=30;i++){
        if(i==29){
            System.out.print("Happy Birthday Ankit" + " ");
        }
        System.out.println("Calender Dates: " + i);
    }

// Continue Statement
    for(int i=1;i<10;i++){
        if(i==17){
            continue;
        }
        System.out.print(i);
    }


    }
}