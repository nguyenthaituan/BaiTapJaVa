/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;
import java.util.ArrayList;
public class LopHoc{
    GiaoVien giaovienCN =new GiaoVien();
    QLDS qldsGVCN = new QLDS();
    QLDS qldsHS = new QLDS();
    
    ArrayList<GiaoVien> giaovienGD = new ArrayList<>();
    ArrayList<HocSinh> hocSinh = new ArrayList<>();

    public LopHoc() {
    }
    
    public int themHS(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGVCN.them(gv);
        return 1;
    }
    
    public void inDSHS(){
        qldsHS.inDS();
    }
    public void inDSGVGD(){
        qldsGVCN.inDS();
    }
   
}