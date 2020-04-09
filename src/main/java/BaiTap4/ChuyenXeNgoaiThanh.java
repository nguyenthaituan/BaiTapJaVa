
package BaiTap4;


public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;   

    public ChuyenXeNgoaiThanh(String maSoCChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoCChuyen, hoTenTaiXe, soXe, doanhThu);
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSoCChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoCChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    public void ThongTinChuyenXeNgoaiThanh(){
        System.out.println("\nNoi den Chuyen xe Ngoai Thanh: "+noiDen);
        System.out.println("\nSo ngay di duoc Chuyen xe Noi Thanh: "+soNgayDiDuoc);
        System.out.println("\nDoanh thu ngoai thanh: ");
    }
    
}
