
package BaiTap4;


public class ChuyenXe {
    protected String maSoCChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoCChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoCChuyen = maSoCChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoCChuyen() {
        return maSoCChuyen;
    }

    public void setMaSoCChuyen(String maSoCChuyen) {
        this.maSoCChuyen = maSoCChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void ThongTinChuyenXe(){
        System.out.println("\nMa so chuyen xe: "+maSoCChuyen);
        System.out.println("\nHo ten tai xe: "+hoTenTaiXe);
        System.out.println("\nSo xe: "+soXe);
        System.out.println("\nDoanh thu: "+doanhThu);      
    }



  
    
}
