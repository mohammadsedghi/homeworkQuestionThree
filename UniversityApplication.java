package questionthree;

public class UniversityApplication {
    public static void main(String[] args) {


        Course course = new Course("math", 622, 1);
//        Course course1 = new Course("math", 622, 2);
//        Student student = new Student("reza", "mohammadi", 1);
//        Student student1 = new Student("hooman", "ahmadi", 2);
       course.addStudent();
        course.addTeacher();
course.printStudents();
course.printTeachers();

    }
}
