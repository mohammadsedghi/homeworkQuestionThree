package questionthree;

public class Course {
   private String name;
    private int teacherId;
   private int studentId;
    private Teacher[] teachers = new Teacher[10];
    private Student[] students = new Student[10];
    Student student1 = new Student("reza", "mohammadi", 1,"mechanic");
    Student student = new Student("hooman", "ahmadi", 2,"mechanic");
    Student student2 = new Student("niloofar", "hajipoor", 3,"mechanic");
    Teacher teacher = new Teacher("ali", "yarmohammadi", 622);
    Teacher teacher1 = new Teacher("nima", "rezaee", 623);

    public Course(String name, int teacherId, int studentId) {
        setName(name);
        setTeacherId(teacherId);
        setStudentIdd(studentId);

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



    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentIdd(int studentId) {
        this.studentId = studentId;
    }
    public void addStudent() {
        if(studentId==student.getId()) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    break;
                }
            }
        }
    }

    public void addTeacher() {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    public void printStudents() {
        if (teacher.getId() == teacherId) {
            System.out.println("list of Student");
            for (Student s : getStudents()
            ) {
                if (s != null) {
                    System.out.print("course name is "+getName()+"  :");
                    System.out.print(s.getName()+"  ");
                    System.out.print(s.getLastname()+"  ");
                    System.out.print(s.getId()+"  ");
                    if (student.getId()==1){
                        setTeacherScore(17);
                        System.out.print(s.getScore());
                    }
                    System.out.println();
                }
            }
        }

    }

    public void printTeachers() {
        if (student.getId() == studentId) {
            System.out.println("list of Teachers");
            for (Teacher t : getTeachers()
            ) {
                if (t != null) {
                    System.out.print("course name is "+getName()+"  :");
                    System.out.print(t.getName()+"  ");
                    System.out.print(t.getLastname()+"  ");
                    System.out.println(t.getId()+"  ");
                }
            }
        }
    }
    public void setTeacherScore(double score){
        if (teacherId==teacher.getId()&&studentId==student.getId())student.setScore(score);
    }
}
