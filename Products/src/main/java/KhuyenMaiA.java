
import java.text.ParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class KhuyenMaiA extends KhuyenMai {

    private static int dem = 0;
    private double tyLePhanTram;

    {
        maKM = String.format("A%02d", ++dem);
    }

    public KhuyenMaiA(String maKM, String ngayTao, String ngayEnd, double tyLePhanTram) throws ParseException {
        super(maKM, ngayTao, ngayEnd);
        this.tyLePhanTram = tyLePhanTram;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ty le phan tram: %s\n", this.tyLePhanTram);
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