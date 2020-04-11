
package BaiTap1;

public class MainBaiTap1 {
    public static void main(String[] args) {
        
        //cach 1: khai bao khong co tham so truyen vao
        NhanVien nhanvien1 = new NhanVien();
        nhanvien1.ten = "Thai Tuan";
        nhanvien1.diaChi = "Phu Yen";
        nhanvien1.tuoi = 21;
        nhanvien1.tienLuong = 5000000;
        nhanvien1.tongSoGioLam = 100;
        
        //cach2: khai bao co tham so truyen vao
        NhanVien nhanvien2 = new NhanVien("Thai Thinh",22,"Phu Yen",6000000,200);
        
        System.out.println("Thong tin nhan vien thu 1: ");
        nhanvien1.getThongTin();
        
        System.out.println("");
        
        System.out.println("Thong tin nhan vien thu 2: ");
        nhanvien2.getThongTin();
    }
}
