package questionthree;

public class Student extends Person {
    private String major;
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public Student(String name, String lastname, int id,String major) {
        super(name, lastname, id);
        this.major=major;
    }


}
