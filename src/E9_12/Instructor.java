package E9_12;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name,birthYear);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        System.out.println("Salary: " + getSalary());
        return super.toString();
    }
}
