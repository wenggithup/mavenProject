package banyuan.com.ObjectSteam;

import java.io.Serializable;

public class Student implements Serializable {
    private String stuname;
    private String stuaddress;
    private double score;

    public Student(String stuname, String stuaddress, double score) {
        this.stuname = stuname;
        this.stuaddress = stuaddress;
        this.score = score;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuname='" + stuname + '\'' +
                ", stuaddress='" + stuaddress + '\'' +
                ", score=" + score +
                '}';
    }
}
