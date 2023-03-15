package questionthree;

public class Person {
    //variable and properties
   protected String name;
    protected   String lastname;
    protected  int id;
    //getter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


//constructor
    public Person(String name, String lastname,int id) {
        this.name = name;
        this.lastname = lastname;
        this.id=id;
    }
//getter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//getter for last name
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
