
package BaiTap3;

public class SinhVienBiz extends SinhVienPoLy{
    private double diemMaketing;
    private double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMaketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMaketing = diemMaketing;
        this.diemSales = diemSales;
    }

    public double getDiemMaketing() {
        return diemMaketing;
    }

    public void setDiemMaketing(double diemMaketing) {
        this.diemMaketing = diemMaketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return (2*diemMaketing+diemSales)/3;
    }
}
