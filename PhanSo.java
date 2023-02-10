package Thuchanh04;

import java.util.*;

public class PhanSo {
    private int tu, mau;
    Scanner inp = new Scanner(System.in);

    PhanSo() {
        tu = 0;
        mau = 1;
    }

    PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void nhap() {
        System.out.print("Nhap tu so: ");
        this.tu = inp.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau = inp.nextInt();
        while (mau == 0) {
            System.out.println("Nhap lai mau so: ");
            this.mau = inp.nextInt();
        }
    }

    public void display() {
        if (this.tu == 0 || this.mau == 0) {
            System.out.println("0");
        } else if (Math.abs(this.mau) == 1) {
            System.out.println(this.tu);
        } else {
            System.out.println(this.tu + "/" + this.mau);
        }
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            return 0;
        else
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        return a;
    }

    public void toiGianPS() {
        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
        int ucln = timUCLN(this.tu, this.mau);
        if (ucln == 0) {
            this.setTu(0);
        } else {
            this.setTu(this.tu / ucln);
            this.setMau(this.mau / ucln);
        }
    }

    public PhanSo cong(PhanSo ps2) {
        int tu = this.tu * ps2.mau + this.mau * ps2.tu;
        int mau = this.mau * ps2.mau;
        PhanSo tongPS = new PhanSo(tu, mau);
        return tongPS;
    }

    public PhanSo tru(PhanSo ps2) {
        int tu = this.tu * ps2.mau - this.mau * ps2.tu;
        int mau = this.mau * ps2.mau;
        PhanSo truPS = new PhanSo(tu, mau);
        return truPS;
    }

    public PhanSo nhan(PhanSo ps2) {
        int tu = this.tu * ps2.tu;
        int mau = this.mau * ps2.mau;
        if (this.tu == 0 || this.mau == 0 || ps2.tu == 0 || ps2.mau == 0) {
            tu = 0;
            mau = 0;
        }
        PhanSo tichPS = new PhanSo(tu, mau);
        return tichPS;
    }

    public PhanSo chia(PhanSo ps2) {
        int tu = this.tu * ps2.mau;
        int mau = this.mau * ps2.tu;
        if (this.tu == 0 || this.mau == 0 || ps2.tu == 0 || ps2.mau == 0) {
            tu = 0;
            mau = 0;
        }
        PhanSo thuongPS = new PhanSo(tu, mau);
        return thuongPS;
    }

    public PhanSo nghichDao() {
        int tu = this.mau;
        int mau = this.tu;
        PhanSo nghichDao = new PhanSo(tu, mau);
        return nghichDao;
    }

    public PhanSo doiDau() {
        PhanSo DoiDau = new PhanSo(-tu, mau);
        return DoiDau;
    }

    public boolean soSanhBang(PhanSo ps2) {
        return (tu / mau == ps2.tu / ps2.mau);
    }

    public boolean lonhon(PhanSo ps2) {
        return (tu / mau > ps2.tu / ps2.mau);
    }
}