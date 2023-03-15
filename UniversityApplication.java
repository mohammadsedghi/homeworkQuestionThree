package questionthree;

public class UniversityApplication {
    public static void main(String[] args) {


       // Course course = new Course("math", 622, 1);
       Course course1 = new Course("math", 622, 2);
//        Student student = new Student("reza", "mohammadi", 1);
//
        course1.addStudent();
        course1.addTeacher();
        course1.printStudents();
        course1.printTeachers();

    }
}
