package Thuchanh04;

import java.util.*;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;
    Scanner inp = new Scanner(System.in);

    SoPhuc() {
        phanThuc = 0;
        phanAo = 0;
    }

    SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public void nhap() {
        System.out.print("a = ");
        this.phanThuc = inp.nextDouble();
        System.out.print("b = ");
        this.phanAo = inp.nextDouble();
    }

    public SoPhuc cong(SoPhuc sp2) {
        SoPhuc sp3 = new SoPhuc();
        sp3.phanThuc = this.phanThuc + sp2.phanThuc;
        sp3.phanAo = this.phanAo + sp2.phanAo;
        return sp3;
    }

    public SoPhuc tru(SoPhuc sp2) {
        SoPhuc sp3 = new SoPhuc();
        sp3.phanThuc = this.phanThuc - sp2.phanThuc;
        sp3.phanAo = this.phanAo - sp2.phanAo;
        return sp3;
    }

    public SoPhuc chia(SoPhuc sp2) {
        SoPhuc Tich1 = new SoPhuc();
        SoPhuc Tich2 = new SoPhuc();
        SoPhuc Thuong = new SoPhuc();
        // a + bi
        // c + di
        double a = this.phanThuc;
        double b = this.phanAo;
        double c = sp2.phanThuc;
        double d = sp2.phanAo;

        Tich1.phanThuc = (a * c - b * (-d));
        Tich1.phanAo = (a * (-d) + b * c);

        Tich2.phanThuc = (c * c - d * (-d));
        Thuong.phanThuc = Tich1.phanThuc / Tich2.phanThuc;
        Thuong.phanAo = Tich1.phanAo / Tich2.phanThuc;
        return Thuong;
    }

    public SoPhuc nghichDao() {
        SoPhuc ngDao = new SoPhuc();
        ngDao.phanThuc = this.phanThuc;
        ngDao.phanAo = -(this.phanAo);
        return ngDao;
    }

    public boolean sosanhBang(SoPhuc sp2) {
        if (this.phanThuc == sp2.phanThuc && this.phanAo == sp2.phanAo)
            return true;
        return false;
    }

    public boolean lonhon(SoPhuc sp2) {
        double modun1 = Math.sqrt((this.phanThuc * this.phanThuc) + (this.phanAo * this.phanAo));
        double modun2 = Math.sqrt((sp2.phanThuc * sp2.phanThuc) + (sp2.phanAo * sp2.phanAo));
        if (modun1 > modun2)
            return true;
        return false;
    }

    public void displaySoPhuc() {
        System.out.println("z = " + this.phanThuc + (this.phanAo < 0 ? " - " : " + ") + Math.abs(this.phanAo) + "i");
    }
}
