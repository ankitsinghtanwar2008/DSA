public class patterns1{
    public static void main(String[] args) {
        char ch ='A';

// Print Star Pattern
        for(int i=1;i<4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

// Print Inverted-Star Pattern
        for(int i=4;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

// Print half-pyramid pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

// Print Character Pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}