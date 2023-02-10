package Thuchanh04;

import java.time.chrono.ThaiBuddhistChronology;

public class Bai7 {
    public static void main(String args[]) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo Tong, Hieu, Tich, Thuong, DoiDau;
        System.out.println("Nhap phan so 1: ");
        ps1.nhap();
        System.out.println("Nhap phan so 2: ");
        ps2.nhap();

        System.out.print("\nPhan so 1: ");
        ps1.display();
        System.out.print("\nPhan so 2: ");
        ps2.display();

        Tong = ps1.cong(ps2);
        System.out.print("\nTong 2 phan so = ");
        Tong.toiGianPS();
        Tong.display();

        Hieu = ps1.tru(ps2);
        System.out.print("\nHieu 2 phan so = ");
        Hieu.toiGianPS();
        Hieu.display();

        Tich = ps1.nhan(ps2);
        System.out.print("\nTich 2 phan so = ");
        Tich.toiGianPS();
        Tich.display();

        Thuong = ps1.chia(ps2);
        System.out.print("\nThuong 2 phan so = ");
        Thuong.toiGianPS();
        Thuong.display();

        DoiDau = ps1.doiDau();
        System.out.print("\nPhan 1 so sau khi doi dau = ");
        DoiDau.toiGianPS();
        DoiDau.display();

        System.out.println("\nPhan so 1 " + (ps1.soSanhBang(ps2) ? "" : "khong ") + "bang phan so 2");
        if (!ps1.soSanhBang(ps2))
            System.out.println("\nPhan so 1" + (ps1.lonhon(ps2) ? " lon hon " : " nho hon ") + "phan so 2");
    }
}
