
import java.text.ParseException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class KhuyenMaiC extends KhuyenMai {

    private static int dem = 0;
    private double tyLePhanTram;
    protected List<SanPham> sanPhamTangKem;

    {
        maKM = String.format("C%04d", ++dem);
    }

    public KhuyenMaiC(String maKM, String ngayTao, String ngayEnd, int tyLePhanTram) throws ParseException {
        super(maKM, ngayTao, ngayEnd);
        this.tyLePhanTram = tyLePhanTram;
        this.sanPhamTangKem = sanPhamTangKem;
    }

    public void hienThi() {
        super.hienThi();
        System.out.printf("Ty le phan tram: %s\n", this.tyLePhanTram);
        for (SanPham x : this.sanPhamTangKem) {
            x.setGiaBan(x.tinhTien());
            x.hienThi();
        }
    }

    /**
     * @return the tyLePhanTram
     */
    public double getTyLePhanTram() {
        return tyLePhanTram / 100;
    }

    /**
     * @param tyLePhanTram the tyLePhanTram to set
     */
    public void setTyLePhanTram(double tyLePhanTram) {
        this.tyLePhanTram = tyLePhanTram / 100;
    }
}