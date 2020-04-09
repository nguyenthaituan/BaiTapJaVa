
package BaiTap4;


public class ChuyenXeNoiThanh extends ChuyenXe{
    private String soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh(String maSoCChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoCChuyen, hoTenTaiXe, soXe, doanhThu);
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }


    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public void ThongTinChuyenXeNoiThanh(){
        System.out.println("So tuyen Chuyen xe noi thanh: "+soTuyen);
        System.out.println("So Km di duoc Chuyen xe noi thanh: "+soKmDiDuoc);
    }
    
}
