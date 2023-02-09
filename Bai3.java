package Thuchanh04;

import java.util.*;

public class Bai3 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        GradeBook gb = new GradeBook();
        String name = inp.nextLine();
        gb.setCourseName(name);
        gb.displayMessage();
    }
}