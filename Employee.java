package Thuchanh04;

class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    Employee() {
        firstName = "Hung";
        lastName = "Nguyen Manh";
        salary = 10000;
    }

    Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = ((salary > 0) ? salary : 0.0);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = (salary > 0) ? salary : 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

}
