package questionthree;

public class UniversityApplication {
    public static void main(String[] args) {


        Course course = new Course("math", 622, 1);
       Course course1 = new Course("math2", 622, 2);
       Course course2 = new Course("math", 622, 3);
       Course course3 = new Course("physics", 623, 1);

        course.addStudent();
        course.addTeacher();
        course.printStudents();
        course.printTeachers();

    }
}
