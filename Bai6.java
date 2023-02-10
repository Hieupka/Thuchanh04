package Thuchanh04;

import java.util.*;

public class Bai6 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        SoPhuc Tong, Hieu, Thuong, NghichDao;

        System.out.println("So phuc z = a + bi");
        System.out.println("Nhap so phuc 1: ");
        sp1.nhap();

        System.out.println("Nhap so phuc 2: ");
        sp2.nhap();

        System.out.print("\nSo phuc 1: ");
        sp1.displaySoPhuc();
        System.out.print("\nSo phuc 2: ");
        sp2.displaySoPhuc();

        System.out.print("\nTong 2 so phuc: ");
        Tong = sp1.cong(sp2);
        Tong.displaySoPhuc();

        System.out.print("\nHieu 2 so phuc: ");
        Hieu = sp1.tru(sp2);
        Hieu.displaySoPhuc();

        System.out.print("\nThuong 2 so phuc: ");
        Thuong = sp1.chia(sp2);
        Thuong.displaySoPhuc();

        System.out.print("\nNghich dao so phuc 1: ");
        NghichDao = sp1.nghichDao();
        NghichDao.displaySoPhuc();

        System.out.println("\nSp1 " + (sp1.sosanhBang(sp2) ? "" : "khong ") + "bang sp2");

        if (!sp1.sosanhBang(sp2)) {
            System.out.println("\nsp1 " + (sp1.lonhon(sp2) ? "lon hon " : "nho hon ") + "sp2");
        }

    }
}
