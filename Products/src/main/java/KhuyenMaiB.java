
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
public class KhuyenMaiB extends KhuyenMai {
    private static int dem = 0;
    protected List<TangKem> tangKem;
    
    {
        maKM = String.format("B%04d", (int)(Math.random() * 8999 + 1000));
    }

    public KhuyenMaiB(String maKM, String ngayTao, String ngayEnd, List<TangKem> tangKem) throws ParseException {
        super(maKM, ngayTao, ngayEnd);
        this.tangKem = new ArrayList<>(tangKem);
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("- Danh sach cac khuyen mai:");
        for (TangKem x : this.tangKem)
            System.out.println(x);      
    }
}
