public class Student extends Person {

    private int studentID;


    Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Student ID: " + studentID);
    }
}