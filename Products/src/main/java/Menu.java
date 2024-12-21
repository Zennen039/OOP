
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class Menu {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        QuanLy ds = new QuanLy();
        do {
            int chon;
            System.out.println("=======MENU=======");
            System.out.println("1. Them san pham vao danh sach.");
            System.out.println("2. Tim kiem san pham theo ten, theo khoang gia chi dinh hoac theo tung loai khuyen mai.");
            System.out.println("3. Them khuyen mai vao mot san pham.");
            System.out.println("4. Xoa cac khuyen mai het hieu luc khoi san pham.");
            System.out.println("5. Cho phep nguoi dung nhap so ngay x, xac dinh tat ca cac khuyen mai con x ngay nua het hieu luc.");
            System.out.println("6. Hien thi toan bo thong tin.");
            System.out.println("7. Sap xep danh sach khuyen mai giam dan theo so luong khuyen mai con hieu luc.");
            System.out.println("8. Ket thuc");
            System.out.println("=======END=======");
            do {
                System.out.print("Thao tac ban lua chon (1 - 8): ");
                chon = sc.nextInt();
                if (chon < 1 || chon > 8) {
                    System.out.println("Lua chon khong hop le! Moi chon lai.");
                }
            } while (chon < 1 || chon > 8);
            switch (chon) {
                case 1:
                    //String tenSp, double gia, DanhMuc danhmuc, KhuyenMai[] dsKM
                    sc.nextLine();
                    SanPham s = new SanPham("Kem", 20000);
                    System.out.print("- Nhap ten san pham: ");
                    s.setTenSp(sc.nextLine());
                    System.out.print("- Nhap gia san pham: ");
                    s.setGiaBan(sc.nextDouble());
                    ds.themSanPham(s);
                    System.out.println("Da them thanh cong san pham!");
                    break;

                case 2:
                    System.out.println("Ban muon chon theo tieu chi nao:");
                    System.out.println("1. Theo ten.");
                    System.out.println("2. Theo khoang gia chi dinh.");
                    System.out.println("3. Theo tung loai khuyen mai.");
                    do {
                        System.out.print("Ban muon chon so may (1/2/3): ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 3) {
                            System.out.println("Lua chon khong phu hop! Vui long chon lai.");
                        }
                    } while (chon < 1 || chon > 3);
                    switch (chon) {
                        case 1:
                            sc.nextLine();
                            System.out.print("- Hay nhap ten san pham can tim: ");
                            String tenSp = sc.nextLine();
                            List<SanPham> p = ds.traCuu(tenSp);
                            if (ds.traCuu(tenSp).isEmpty()) {
                                System.out.printf("Khong tim thay san pham co ten %s", tenSp);
                            } else {
                                p.forEach(r -> r.hienThi());
                            }
                            break;

                        case 2:
                            System.out.print("- Hay nhap gia bat dau: ");
                            double start = sc.nextDouble();
                            System.out.print("- Hay nhap gia ket thuc: ");
                            double end = sc.nextDouble();
                            List<SanPham> giaBan = ds.traCuu(start, end);
                            if (giaBan.isEmpty()) {
                                System.out.printf("Khong tim thay san pham co khoang gia tu %f den %f\n", start, end);
                            } else {
                                giaBan.forEach(g -> g.hienThi());
                            }
                            break;

                        case 3:
                            sc.nextLine();
                            System.out.print("- Hay nhap loai khuyen mai can tim: ");
                            char KhuyenMai = sc.nextLine().charAt(0);
                            List<SanPham> kq = ds.traCuu(KhuyenMai);
                            if (kq.isEmpty()) {
                                System.out.printf("Khong tim thay san pham co khuyen mai loai %s\n", KhuyenMai);
                            } else {
                                System.out.printf("Khuyen mai: ", ds.traCuu(KhuyenMai));
                                for (SanPham x : kq) {
                                    x.hienThi();
                                }
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("- Hay nhap khuyen mai cua san pham ban muon them: ");
                    do {
                        System.out.print("Ban muon chon loai nao? (1/2/3): ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 3) {
                            System.out.println("Lua chon khong phu hop! Vui long chon lai.");
                        }
                    } while (chon < 1 || chon > 3);
                    sc.nextLine();
                    switch (chon) {
                        case 1:
                            System.out.print("Hay nhap ngay bat dau khuyen mai: ");
                            String ngayTao = sc.nextLine();
                            System.out.print("Hay nhap ngay het hieu luc khuyen mai: ");
                            String ngayEnd = sc.nextLine();
                            System.out.print("Hay nhap ty le phan tram cua khuyen mai: ");
                            double tyLePhanTram = sc.nextDouble();
                            KhuyenMaiA a = new KhuyenMaiA("A", ngayTao, ngayEnd, tyLePhanTram);
                            System.out.print("Hay nhap Id san pham: ");
                            int Id = sc.nextInt();
                            ds.themKhuyenMai(Id, a);
                            break;

                        case 2:
                            System.out.print("Hay nhap ngay bat dau khuyen mai: ");
                            ngayTao = sc.nextLine();
                            System.out.print("Hay nhap ngay het hieu luc khuyen mai: ");
                            ngayEnd = sc.nextLine();
                            System.out.print("Tang kem: (1. VE_XEM_PHIM, 2.VE_XEM_HAI_KICH) ");
                            int t = sc.nextInt();
                            List<TangKem> tk = new ArrayList<>();
                            if (t == 1) {
                                tk.add(TangKem.VE_XEM_PHIM);
                            } else {
                                tk.add(TangKem.VE_XEM_HAI_KICH);
                            }
                            KhuyenMaiB b = new KhuyenMaiB("B", ngayTao, ngayEnd, tk);
                            System.out.print("Hay nhap Id san pham: ");
                            Id = sc.nextInt();
                            ds.themKhuyenMai(Id, b);
                            break;

                        case 3:
                            System.out.print("Hay nhap ngay bat dau khuyen mai: ");
                            ngayTao = sc.nextLine();
                            System.out.print("Hay nhap ngay het hieu luc khuyen mai: ");
                            ngayEnd = sc.nextLine();
                            System.out.print("Hay nhap thong tin san pham tang kem: ");
                            String sanPhamTangKem = sc.nextLine();
                            SanPham sp = new SanPham("Dia CD", 30000);
                            List<SanPham> TangKem = new ArrayList<>();
                            TangKem.add(sp);
                            System.out.print("Hay nhap ty le phan tram cua khuyen mai: ");
                            tyLePhanTram = sc.nextDouble();
                            KhuyenMaiC c = new KhuyenMaiC("C", ngayTao, ngayEnd, (int) tyLePhanTram);
                            System.out.print("Hay nhap Id san pham: ");
                            Id = sc.nextInt();
                            ds.themKhuyenMai(Id, c);
                            break;

                    }
                    break;

                case 4:
                    ds.xoaKM();
                    System.out.println("Da xoa danh sach thanh cong!");
                    break;

                case 5:
                    System.out.print("Hay nhap so ngay: ");
                    int soNgay = sc.nextInt();
                    ds.choPhep(soNgay);
                    break;

                case 6:
                    if (ds.getDs().isEmpty()) {
                        System.out.println("Khong co danh sach");
                    } else {
                        ds.hienThi();
                    }
                    break;

                case 7:
                    ds.sapXep();
                    System.out.println("Sap xep xong!");
                    break;
            }
        } while (true);
    }
}