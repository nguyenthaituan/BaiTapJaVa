/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe {
    
    ArrayList<ChuyenXe> listChuyenXe;
    ChuyenXe cx;
    private Object ChuyenXe;
    
    public QuanLyChuyenXe() {
        super();
        listChuyenXe = new ArrayList<ChuyenXe>();
    }
    
     ChuyenXe[] CX = new ChuyenXe[10];
         int n=0;
          
    public void themChuyenXe(ChuyenXe cx){
       CX[n] = new ChuyenXe();
       CX[n] = cx;
       n++;
    }

    public void inDS() {
        for(int i=0;i<n;i++)
        {
            System.out.println("Thong tin chuyen xe thu: "+i);
            CX[i].ThongTinChuyenXe();
        }
    } 
    
    public void tinhDoanhThuNoiThanh()
        {
            double doanhThuNoiThanh = 0;
            for(ChuyenXe cx : listChuyenXe)
                if(ChuyenXe instanceof ChuyenXeNgoaiThanh)
                {
                     System.out.println("\nĐay khong phai chuyen xe Noi thanh!");
                }
                else doanhThuNoiThanh +=cx.getDoanhThu();
        }
    
    public void tinhDoanhThuNgoaiThanh(){
            double doanhThuNgoaiThanh = 0;
            for(ChuyenXe cx : listChuyenXe)
                if(ChuyenXe instanceof ChuyenXeNgoaiThanh)
                {
                    doanhThuNgoaiThanh+=cx.getDoanhThu();
                }
        }
    
 }


    

