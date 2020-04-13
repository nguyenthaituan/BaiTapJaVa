
package BaiTap4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgay;

    public ChuyenXeNgoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    @Override
    public void hienThiTT(){
        System.out.println("\nThong tin Chuyen xe Ngoai Thanh: ");
        super.hienThiTT();
        
        System.out.println("Noi den: "+ noiDen + " So ngay:  "+soNgay);
    }
}