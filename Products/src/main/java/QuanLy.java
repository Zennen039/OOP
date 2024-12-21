
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class QuanLy {

    private static int dem = 0;
    private List<SanPham> ds = new ArrayList<>();
    private List<KhuyenMai> danhSach = new ArrayList<>();

    {
        ds.add(new SanPham("Sach tieng anh", 36000));
        ds.add(new SanPham("Sach tieng han", 45000));
        ds.add(new SanPham("Sach tieng trung", 60000));
    }

    public void themSanPham(SanPham... s) {
        this.ds.addAll(Arrays.asList(s));
    }

    public void themKhuyenMai(int Id, KhuyenMai... km) {
        for (SanPham x : ds) {
            if (x.getId() == Id) {
                x.themKM(km);
            }
        }
        for (KhuyenMai y : danhSach) {
            this.danhSach.add(y);
        }
    }

    public void hienThi() {
        this.ds.forEach(s -> s.hienThi());
    }

    /**
     *
     * @param tuKhoa
     * @return
     */
    public List<SanPham> traCuu(String tuKhoa) {
        return this.ds.stream().filter(s -> s.getTenSp().contains(tuKhoa)).collect(Collectors.toList());
    }

    public List<SanPham> traCuu(double tuGia, double denGia) {
        return this.ds.stream().filter(s -> s.getGiaBan() >= tuGia && s.getGiaBan() <= denGia).collect(Collectors.toList());
    }

    public List<SanPham> traCuu(char maKM) {
        List<SanPham> kq = new ArrayList<>();
        for (SanPham x : this.getDs()) {
            for (KhuyenMai y : x.getDanhSach()) {
                if (y.getMaKM().contains(String.format("%s", maKM))) {
                    kq.add(x);
                    break;
                }
            }
        }
        return kq;
    }

    public void hienThiToanBo() {
        this.ds.forEach(sp -> sp.hienThi());
    }

    public void xoaKM() {
        for (SanPham k : this.getDs()) {
            for (KhuyenMai q : this.danhSach) {
                if (q.getNgayEnd().compareTo(new Date()) == -1) {
                    k.getDanhSach().remove(q);
                }
            }
        }
    }

    public void choPhep(int soNgay) {
        Date d = new Date();
        for (KhuyenMai i : this.danhSach) {
            if (((i.getNgayEnd().getTime() - d.getTime()) / 86400000) == soNgay) {
                i.hienThi();
            }
        }
    }

    public void sapXep() {
        this.ds.sort((s1, s2) -> {
//            SanPham m = new SanPham(s1);
//            SanPham n = new SanPham(s2);
//            for (KhuyenMai q : m.getDanhSach()) {
//                if (q.getNgayEnd().compareTo(new Date()) == -1) {
//                    m.getDanhSach().remove(q);
//                }
//            }
//            for (KhuyenMai q : n.getDanhSach()) {
//                if (q.getNgayEnd().compareTo(new Date()) == -1) {
//                    n.getDanhSach().remove(q);
//                }
//            }
            return -(s1.getDanhSach().size() - s2.getDanhSach().size());
        });
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
}