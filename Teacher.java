package questionthree;

public class Teacher extends Person{
    public Teacher(String name, String lastname,int id) {
        super(name, lastname);
        setId(id);
    }
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
