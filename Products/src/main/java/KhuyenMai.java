
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class KhuyenMai {

    private static SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    protected String maKM;
    private Date ngayTao;
    private Date ngayEnd;
    private List<TangKem> dichVu;

    public KhuyenMai(String maKM, String ngayTao, String ngayEnd) throws ParseException {
        this.maKM = maKM;
        this.ngayTao = f.parse(ngayTao);
        this.ngayEnd = f.parse(ngayEnd);
        this.dichVu = new ArrayList<>();
    }

    public void hienThi() {
        System.out.printf("Ma KM: %s\nNgay tao: %s\nNgay het hieu luc: %s\n", this.maKM, f.format(this.getNgayTao()), f.format(this.getNgayEnd()));
    }

    /**
     * @return the maKM
     */
    public String getMaKM() {
        return maKM;
    }

    /**
     * @param maKM the maKM to set
     */
    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    /**
     * @return the ngayTao
     */
    public Date getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the ngayEnd
     */
    public Date getNgayEnd() {
        return ngayEnd;
    }

    /**
     * @param ngayEnd the ngayEnd to set
     */
    public void setNgayEnd(Date ngayEnd) {
        this.ngayEnd = ngayEnd;
    }
}
