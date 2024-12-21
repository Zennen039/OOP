
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class SanPham {

    private static int dem = 0;
    private int Id = ++dem;
    private String tenSp;
    private double giaBan;
    private List<KhuyenMai> danhSach;

    public SanPham(String tenSp, double giaBan) {
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.danhSach = new ArrayList<>();
    }

    SanPham(SanPham s1) {
        this.tenSp = s1.tenSp;
        this.giaBan = s1.giaBan;
        this.danhSach = new ArrayList<>(s1.danhSach);
    }

    public double tinhTien() {
        for (KhuyenMai km : this.danhSach) {
            if (km instanceof KhuyenMaiA) {
                return this.giaBan - this.giaBan * ((KhuyenMaiA) km).getTyLePhanTram();
            }
        }
        return this.giaBan;
    }

    public void themKM(KhuyenMai... k) {
        this.danhSach.addAll(Arrays.asList(k));
    }

    public void hienThi() {
        System.out.printf("Id: %d\nTen Sp: %s\nGia ban: %.1f (Giam gia con: %.1f)\n", this.Id, this.tenSp, this.giaBan, this.tinhTien());

        this.danhSach.forEach(k -> k.hienThi());
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the danhSach
     */
    public List<KhuyenMai> getDanhSach() {
        return danhSach;
    }

    /**
     * @param danhSach the danhSach to set
     */
    public void setDanhSach(List<KhuyenMai> danhSach) {
        this.danhSach = danhSach;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}