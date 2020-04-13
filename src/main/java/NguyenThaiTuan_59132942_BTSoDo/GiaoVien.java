/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;


public class GiaoVien extends CaNhan{
        private String monDay;
        private String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
         System.out.println("Ho Ten giao vien: "+hoTen);
        System.out.println("tuoi giao vien: "+tuoi);
        System.out.println("dia chi giao vien: "+diaChi);
        System.out.println("sdt giao vien: "+sdt);
        System.out.println("mon day giao vien: "+monDay);
        System.out.println("to bo mon giao vien: "+toBoMon);
        return "2";
    }
        
        
}
