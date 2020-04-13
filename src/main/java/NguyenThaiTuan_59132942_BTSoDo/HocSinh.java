/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;


public class HocSinh extends CaNhan{
        private String lop;
        private String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT() {
        System.out.println("\nHo Ten hoc sinh: "+hoTen);
        System.out.println("tuoi hoc sinh: "+tuoi);
        System.out.println("dia chi hoc sinh: "+diaChi);
        System.out.println("sdt hoc sinh: "+sdt);
        System.out.println("lop hoc sinh: "+lop);
        System.out.println("Nang khieu hoc sinh: "+nangKhieu);
        return "1";
    }
  
}
