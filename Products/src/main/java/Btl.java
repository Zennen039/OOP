
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class Btl {

    public static void main(String[] args) throws ParseException {
        SanPham s1 = new SanPham("Ban Chai", 20000);
        SanPham s2 = new SanPham("Kem Danh Rang", 100000);
        SanPham s3 = new SanPham("Laptop", 120000);

        List<TangKem> tangKem = new ArrayList<TangKem>();
        tangKem.add(TangKem.VE_XEM_PHIM);
        tangKem.add(TangKem.VE_XEM_HAI_KICH);
        KhuyenMai k1 = new KhuyenMaiA("A", "12/09/2022", "20/11/2022", 50);
        KhuyenMai k2 = new KhuyenMaiC("C", "03/03/2022", "11/12/2022", 4);
        KhuyenMai k3 = new KhuyenMaiB("B", "7/11/2021", "4/12/2021", tangKem);

        s1.themKM(k1);
        s1.hienThi();
        s2.themKM(k2);
        s2.hienThi();
        s3.themKM(k3);
        s3.hienThi();

        QuanLy q1 = new QuanLy();
        q1.themSanPham(s1, s2, s3);
        q1.hienThi();

        System.out.println("==========");
        List<SanPham> a = q1.traCuu('B');
        a.forEach(e -> e.hienThi());
        List<SanPham> d = q1.traCuu("Chai");
        d.forEach(c -> c.hienThi());

        ArrayList<KhuyenMai> k = new ArrayList<KhuyenMai>();
        k.add(0, k3);
        System.out.println("==========");
        q1.sapXep();
        q1.hienThi();
    }
}