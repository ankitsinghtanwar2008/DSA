

public class OOPs {
    public static void main(String arg[]){
        // Pen p1 = new Pen();
        // p1.setcolor("Black");
        // p1.settip(5);
        // System.out.println(p1.color + " " + p1.tip);

        // Student s1 = new Student();
        // s1.setname("Rohan");
        // s1.setroll(78);
        // s1.setmarks(480);
        // s1.setsubject(5);
        // System.out.println(s1.name + " " + s1.roll + " " + s1.marks + " " + s1.subject + " " + s1.percentage);

        // Info i1 = new Info();
        // i1.setName("Ankit");
        // i1.setAddress("Jeelo");
        // System.out.println(i1.getName());
        // System.out.print(i1.getAddress());

        // Check c1 = new Check("Contructor");
        // c1.setvalue(245);
        // System.out.println(c1.getvalue());
        // System.out.print(c1.data);

        // Fish f1 = new Fish();
        // f1.eat();

        Queen q1 = new Queen();
        q1.move();
        System.out.println(q1.hits());
        King k1 = new King();
        k1.move();
    }
}


     // Interfaces

interface ChessPlayers {
    void move();
    int hits();
}

class King implements ChessPlayers{
    public void move(){
        System.out.println("up,down,left,right, diagonaly by 1 step ");
    }

    public int hits(){
        return 1;
    }
    
}

class Queen implements ChessPlayers{
    public void move(){
        System.out.println("up, down, right, left, digonaly to all 4 direction");
    }

    public int hits(){
        return 8;
    }
}

// class Animal{
//     String color;

//     void eat(){
//         System.out.print("Veg/Non-veg");
//     }

//     void nature(){
//         System.out.print("Okay");
//     }
// }

// class Fish extends Animal{
//     int wing;
//      void swim(){
//         System.out.print("Little/More");
//      }
// }

   // Creating Class
// class Pen{
//     String color;
//     int tip;

//     void setcolor(String newcolor){
//         color = newcolor;
//     }

//     void settip(int newtip){
//         tip = newtip;
//     }
// }

// class Student{
//     String name;
//     int roll;
//     float marks;
//     int subject;
//     float percentage;

//     void setname(String newname){
//         name = newname;
//     }

//     void setroll(int newroll){
//         roll = newroll;
//     }

//     void setmarks(float  newmarks){
//         marks = newmarks;
//     }
    
//     void setsubject(int newsubject){
//         subject = newsubject;
//     }

//     void percentage(float percentage){
//         percentage = marks / subject; 
//     }
// }


  // Getter & Setter
// class Info{
//     private String name;
//     private String address;

//     void setName(String name){
//         this.name = name;
//     }

//     void setAddress(String address){
//         this.address = address;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getAddress(){
//         return  address;
//     }
// }




   // Constructor
// class Check{
//     String data;
//     private int value;

//     public void setvalue(int value){
//         this.value = value;
//     }
//     int getvalue(){
//         return this.value;
//     }

//     Check(String data){
//         this.data = data;
//     }
//     Check(int value){
//         this.value = value;
//     }
// }
 
