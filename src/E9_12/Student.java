package E9_12;

public class Student extends Person{
    private String major;

    public Student(String name, int birthYear, String major){
        super(name,birthYear);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        System.out.println("Major: " + major);
        return super.toString();
    }
}
