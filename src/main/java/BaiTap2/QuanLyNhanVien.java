
package BaiTap2;
import BaiTap1.NhanVien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy {
    ArrayList<NhanVien> DS = new ArrayList<>();
      
    @Override
    public void themNhanVien(NhanVien nv){
       DS.add(nv);
    }

    @Override
    public void inDS() {
        for(int i=0;i<DS.size();i++)
        {
             System.out.println(DS.get(i).getThongTin());
        }
    }
}
