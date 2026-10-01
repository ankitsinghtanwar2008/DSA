import java.util.*;
public  class conditionalStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age to Get the Access: ");
        int age = sc.nextInt();

// if-else Statement
        if(age>=18){
            System.out.println("Ok, You would be able to Join");
        }else{
            System.out.println("Sorry, You are under 18 so cam't join us");
        }

// else-if Statement
    if(age>18){
        System.out.println("Adult");
    }else if(age==18){
        System.out.println("Tenn");
    }else{
        System.out.println("Child");
    }


// Ternary Operator
    String name = (29>1)?"Ankit":"Buggu";
    System.out.println(name);


// Switch Statement
    int number = 2;
    switch(number){
        case 1: System.out.println("Study");
                break;
        case 2: System.out.println("Gaming");
                break;
        case 3: System.out.println("Eat");
                break;
        case 4: System.out.println("Sleep");
                break;
        default: System.out.println("Running");
    }



    }
}