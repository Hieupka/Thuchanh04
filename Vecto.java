package Thuchanh04;

import java.util.*;

public class Vecto {
    private int n;
    private double[] arr;
    Scanner inp = new Scanner(System.in);

    Vecto(int n) {
        this.n = n;
        arr = new double[n];
    }

    public void setVecto() {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = inp.nextInt();
        }
    }

    public void displayVecto() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public Vecto tong(Vecto vt2) {
        Vecto tong = new Vecto(n);
        for (int i = 0; i < n; i++) {
            tong.arr[i] = this.arr[i] + vt2.arr[i];
        }
        return tong;
    }

    public Vecto hieu(Vecto vt2) {
        Vecto hieu = new Vecto(n);
        for (int i = 0; i < n; i++) {
            hieu.arr[i] = this.arr[i] - vt2.arr[i];
        }
        return hieu;
    }

    public Vecto tich(double x) {
        Vecto kq = new Vecto(n);
        for (int i = 0; i < n; i++) {
            kq.arr[i] = this.arr[i] * x;
        }
        return kq;
    }

    public double tichVoHuong(Vecto vt2) {
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans += this.arr[i] * vt2.arr[i];
        }
        return ans;
    }

    public double doDai() {
        double tongBinhPhuong = 0;
        for (int i = 0; i < n; i++) {
            tongBinhPhuong += Math.pow(this.arr[i], 2);
        }
        return Math.sqrt(tongBinhPhuong);
    }

    public void chuanHoa() {
        for (int i = 0; i < n; i++) {
            this.arr[i] = arr[i] / this.doDai();
        }
    }

    public boolean isVuongGoc(Vecto vt2) {
        if (this.tichVoHuong(vt2) == 0)
            return true;
        return false;
    }

    public boolean isCongTuyen(Vecto vt2) {
        double k = this.arr[0] / vt2.arr[0];
        for (int i = 1; i < n; i++) {
            if (this.arr[i] / vt2.arr[i] != k)
                return false;
        }
        return true;
    }
}