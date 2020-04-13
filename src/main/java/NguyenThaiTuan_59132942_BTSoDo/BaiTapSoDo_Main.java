/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;


public class BaiTapSoDo_Main {
public static void main(String[] args) {
    
    //tao 1 lop hoc
    LopHoc LH = new LopHoc();
      
    //them hoc sinh
    HocSinh hs1 = new HocSinh("TH1","Code HTML","Nguyen Thai Tuan", 21," Room5,30/53 Doan Tran Nghiep","0123456789");
    HocSinh hs2 = new HocSinh("TH1","Code CSS","Tran Tien Cao", 21," Room5,30/53 Doan Tran Nghiep","0123789456");
    
    //them giao vien
    GiaoVien gv1 = new GiaoVien("Design Pattern","Cong Nghe Phan Mem","Thay Huynh Tuan Anh",42," Truong Dai Hoc Nha Trang","0123789456");
    GiaoVien gv2 = new GiaoVien("XML","Cong nghe phan mem","Pham Thi Thu Thuy", 40," Truong Dai Hoc Nha Trang"," 0345789654");
    
    LH.themHS(hs1);
    LH.themHS(hs2);
    LH.themGVGD(gv1);
    
    LH.inDSGVGD();
    LH.inDSHS();
    
    }
}
