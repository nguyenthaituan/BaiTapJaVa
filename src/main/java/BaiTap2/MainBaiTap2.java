
package BaiTap2;

import BaiTap1.NhanVien;

public class MainBaiTap2 {
    public static void main(String[] args) {
            
    QuanLyNhanVien ds = new QuanLyNhanVien();
    NhanVien NV1 = new NhanVien("Nguyen Thai Tuan", 21,"Phu Yen",6000000,500);
    NhanVien NV2 = new NhanVien("Nguyen Thai Thinh", 22,"Phu Yen",5000000,400);
    NhanVien NV3 = new NhanVien("Nguyen Thai Thanh", 23,"Phu Yen",4000000,300);
    NhanVien NV4 = new NhanVien("Nguyen Thai Tu", 24,"Phu Yen",3000000,200);
    NhanVien NV5 = new NhanVien("Nguyen Thai Tung", 25,"Phu Yen",2000000,100);
     
    ds.themNhanVien(NV1);
    ds.themNhanVien(NV2);
    ds.themNhanVien(NV3);
    ds.themNhanVien(NV4);
    ds.themNhanVien(NV5);
    
        for(int i=0;i<5;i++)
        {
            System.out.println("\nNhan vien thu: "+i);
            ds.NV[i].getThongTin();
        }
  }

}
