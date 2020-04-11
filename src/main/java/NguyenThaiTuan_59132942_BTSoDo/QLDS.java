/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThaiTuan_59132942_BTSoDo;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS{

    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }

    public QLDS() {
    }
    
    public int Them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (int i =0; i<dsCaNhan.size(); i++){
            if (dsCaNhan.get(i).getHoTen() == ten)
                dsCaNhan.remove(i);
        }
        return 1;
    }

    public void InDS(ArrayList<CaNhan> ls) {
        for (int i =0; i<ls.size(); i++){
            ls.get(i).hienthiTT();
        }
    }

    @Override
    public int them(CaNhan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}