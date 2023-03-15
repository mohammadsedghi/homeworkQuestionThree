package questionthree;

public class UniversityApplication {
    public static void main(String[] args) {
Teacher teacher=new Teacher("ali","yarmohammadi",622);
Course course=new Course("math",622,1);
Student student=new Student("reza","mohammadi",1);
course.addStudent(student);
course.addTeacher(teacher);
course.listStudent(1);

    }
}
