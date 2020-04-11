/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;


public class BaiTapSoDo_Main {
public static void main(String[] args) {
        LopHoc LH = new LopHoc();
        HocSinh HS1 = new HocSinh("59CNTT-1","IT","Nguyen Thai Tuan",15,"Tuy Hoa","123456");
        HocSinh HS2 = new HocSinh("59CNTT-1","IT","Nguyen Van Teo",15,"Phu Yen","123456");
        HocSinh HS3 = new HocSinh("59CNTT-1","IT","Nguyen Van Tun",15,"Tuy Hoa","123456");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        LH.themHocSinh(HS3);
        
        LH.qldsHS.xoa("Lê Thế Duy");
        LH.inDSHS();
    }
}
