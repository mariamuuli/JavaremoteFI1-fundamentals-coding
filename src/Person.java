public abstract class Person {
    private String name;
    private int age;

    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void Display(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
    }
//Teacher teacher = new Teacher("Maria", 32, "Math");
//    teacher.Display();
//    Student student = new Student("Hasib", 33, 3344);
//    student.Display();

}
