package Thuchanh04;

public class GradeBook {
    private String courseName;

    // Bai 1 + 2
    public void displayMessage() {
        System.out.println("Chao mung ban den voi khoa hoc " + courseName);
    }

    // bai 3
    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }
}
