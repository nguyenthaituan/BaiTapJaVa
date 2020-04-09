
package BaiTap2;
import BaiTap1.NhanVien;

public class QuanLyNhanVien implements IQuanLy {
    NhanVien[] NV = new NhanVien[10];
    int n=0;
    
    @Override
    public void themNhanVien(NhanVien nv){
       NV[n] = new NhanVien();
       NV[n] = nv;
       n++;
    }

    @Override
    public void inDS() {
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhan vien thu: "+i);
            NV[i].getThongTin();
        }
    }
}
