package questionthree;

public class Course {
    String name;
    int teacherId;
    int studentId;
Teacher [] teachers=new Teacher[10];
Student [] students=new Student[10];

    public Course(String name, int teacherId, int studentId) {
        this.name = name;
        this.teacherId=teacherId;
        this.studentId=studentId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student [] listStudent(int id){
        Student []students1 =new Student[10];
        if (id==getTeacherId())students1= getStudents();
        return students1;
    }
    public Teacher [] listTeacher(int id){
        Teacher []teachers1 =new Teacher[10];
        if (id==getTeacherId())teachers1= getTeachers();
        return teachers1;
    }

}
