public class practiceOOPS {
    public static void main(String arg[]){
        Student s = new Student();
        s.name = "Preet";
        s.getName();
        s.marks = 234;
        s.getMarks();
        // System.out.println(s.name + " " + s.marks);

    }
}

class Student{
    String name;
    int marks;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name; 
    }

    void setMarks(int marks){
        this.marks = marks;
    }

    int getMarks(){
        return marks;
    }
}
