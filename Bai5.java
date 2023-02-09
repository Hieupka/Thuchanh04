package Thuchanh04;

import java.util.*;

public class Bai5 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        Vecto vt1, vt2, vt;
        System.out.println("Nhap n phan tu cho 2 vecto: ");
        int n = inp.nextInt();

        vt1 = new Vecto(n);
        vt2 = new Vecto(n);

        System.out.println("Nhap phan tu cho vecto 1: ");
        vt1.setVecto();
        System.out.println("Nhap phan tu cho vecto 2: ");
        vt2.setVecto();

        System.out.print("Vecto 1: ");
        vt1.displayVecto();
        System.out.print("\nVecto 2: ");
        vt2.displayVecto();

        vt = vt1.tong(vt2);
        System.out.print("\nTong 2 vecto: ");
        vt.displayVecto();

        vt = vt1.hieu(vt2);
        System.out.print("\nHieu 2 vecto: ");
        vt.displayVecto();

        System.out.print("\nNhap x = ");
        int x = inp.nextInt();
        System.out.print("\nTich vecto 1 voi " + x + ": ");
        vt = vt1.tich(x);
        vt.displayVecto();

        System.out.println("\nTich vo huong: " + vt1.tichVoHuong(vt2));

        System.out.println("\nDo dai cua vecto 1: " + vt1.doDai());

        System.out.println("\nVecto 1 " + (vt1.isVuongGoc(vt2) ? "" : "khong ") + "vuong goc voi Vecto 2");

        System.out.println("\nVecto 1 " + (vt1.isCongTuyen(vt2) ? "" : "khong ") + "cong tuyen voi Vecto 2");

        System.out.print("\nVecto sau khi chuan hoa: ");
        vt1.chuanHoa();
        vt1.displayVecto();

    }
}
