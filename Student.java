//static Variable

public class Student {
    int id;
    String name;
    static int noOfStudents; 
    
    public static void main(String[] args) {
        Student Mary = new Student();
        System.out.println(Mary.noOfStudents);
        Student Tom = new Student();
        System.out.println(Tom.noOfStudents);
        Student Jak = new Student();
        System.out.println(Jak.noOfStudents);
        //System.out.println(noOfStudents);
    }
    Student(){
        noOfStudents++;
    }    
    public static int noOfStudents(){
        return noOfStudents;
    }
}