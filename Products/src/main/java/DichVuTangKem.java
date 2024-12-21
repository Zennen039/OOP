
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
public class DichVuTangKem extends KhuyenMaiB {

    protected TangKem tangKem;

    public DichVuTangKem(String maKM, String ngayTao, String ngayEnd, List<TangKem> tangKem) throws ParseException {
        super(maKM, ngayTao, ngayEnd, tangKem);
    }

    /**
     * @return the tangKem
     */
    public TangKem getTangKem() {
        return tangKem;
    }

    /**
     * @param tangKem the tangKem to set
     */
    public void setTangKem(TangKem tangKem) {
        this.tangKem = tangKem;
    }
}
