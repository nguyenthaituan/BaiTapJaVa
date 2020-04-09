
package BaiTap4;


public class BaiTap4Main {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        ChuyenXeNgoaiThanh cxnt = new ChuyenXeNgoaiThanh("tuy hoa",2,"chuyen1","tuan","a1",100);
        ChuyenXeNgoaiThanh cxnt2 = new ChuyenXeNgoaiThanh("khanhhoa", 10,"chuyen3","teo","n5", 110);
        
        cxnt.ThongTinChuyenXe();
        cxnt.ThongTinChuyenXeNgoaiThanh();
        qlcx.tinhDoanhThuNgoaiThanh();
    }
}
