public class Teacher extends Person {
        private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Subject : " + subject);
    }
}

