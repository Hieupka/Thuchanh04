package Thuchanh04;

public class Bai4 {

    public static void main(String args[]) {
        Employee Emp1 = new Employee("Hung", "Nguyen", 96000);
        Employee Emp2 = new Employee("Huy", "Nguyen", 96000);

        System.out.println(
                "Muc luong 1 nam cua " + Emp1.getFirstName() + " " + Emp1.getLastName() + ": " + Emp1.getSalary() * 12);
        System.out.println(
                "Muc luong 1 nam cua " + Emp2.getFirstName() + " " + Emp2.getLastName() + ": " + Emp2.getSalary() * 12);

        System.out.println(
                "Muc luong 1 nam cua " + Emp1.getFirstName() + " " + Emp1.getLastName() + ": "
                        + Emp1.getSalary() * 1.1 * 12);
        System.out.println(
                "Muc luong 1 nam cua " + Emp2.getFirstName() + " " + Emp2.getLastName() + ": "
                        + Emp2.getSalary() * 1.1 * 12);
    }
}
