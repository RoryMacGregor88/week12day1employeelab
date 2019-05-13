package Staff;


public abstract class Employee {

    private String name;
    private int nINumber;
    private double salary;

    public Employee(String name, int nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setnINumber(int nINumber) {
        this.nINumber = nINumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
