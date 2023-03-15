package questionthree;

public class Student extends Person{
    public Student(String name, String lastname,int id) {
        super(name, lastname);
        setId(id);
    }
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
