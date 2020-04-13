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
public class QLDS implements IQLDS {
    ArrayList<CaNhan> DSCN = new ArrayList<>();

    @Override
    public int them(CaNhan p) {
        DSCN.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for(int i=0;i<DSCN.size();i++){
            if(DSCN.get(i).getHoTen() == ten)
                DSCN.remove(DSCN.get(i));
            return 1;
        }    
        return 1;
    }

    @Override
    public void inDS() {
         for(int i=0;i<DSCN.size();i++){
             DSCN.get(i).HienThiTT();
         }
    }
    
   
}