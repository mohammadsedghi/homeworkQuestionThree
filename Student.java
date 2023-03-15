package questionthree;

public class Student extends Person {
    //variable and properties
    private String major;
    private double score;
//getter for score
    public double getScore() {
        return score;
    }
//setter for score
    public void setScore(double score) {
        this.score = score;
    }

//constructor
    public Student(String name, String lastname, int id,String major) {
        super(name, lastname, id);
        this.major=major;
    }


}
