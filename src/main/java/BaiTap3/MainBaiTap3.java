
package BaiTap3;

public class MainBaiTap3 {
    public static void main(String[] args) {
      SinhVienPoLy pl1 = new SinhVienIT(6, 8, 10,"Nguyen Thai Tuan","CNTT");
        System.out.println("\nSinh vien IT ke thua tu sinh vien poly");
        pl1.Xuat();

        SinhVienPoLy pl2 = new SinhVienBiz(8, 8,"Nguyen Ngoc Chau","CNTT");
        System.out.println("\nSinh vien bIZ ke thua tu sinh vien poly");
        pl2.Xuat();
        
    }
  
}
