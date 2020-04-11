/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;

public class LopHoc {
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();

    public LopHoc() {
    }
    
    public int themHocSinh(HocSinh hs){
        qldsHS.Them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGVGD.Them(gv);
        return 1;
    }
    
    public void inDSHS(){
        qldsHS.InDS(qldsHS.dsCaNhan);
    }
    
}