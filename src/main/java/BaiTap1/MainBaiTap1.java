
package BaiTap1;

public class MainBaiTap1 {
    public static void main(String[] args) {
        NhanVien NV = new NhanVien("tuan", 10,"phu yen", 100000, 100);
        NhanVien NV1 = new NhanVien("teo", 15,"phu yen", 110000, 110);
        NhanVien NV2 = new NhanVien("tun", 20,"phu yen", 120000, 120);
        System.out.println(NV.getThongTin());  
        System.out.println(NV1.getThongTin()); 
        System.out.println(NV2.getThongTin()); 
//m1
    }
}
