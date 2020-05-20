/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Main1 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        HoaDon hd = new HoaDon.Builder()
                .addHDHeader(new HoaDonHeader("HD01",formatDate.parse("05/05/2020"),"Nguyen Cong Thien"))
                .addCTHD(new CTHD("CocaCola",4,28000,1000))
                .addCTHD(new CTHD("Sua ong tho",3,60000,3000))
                .build();
        System.out.println(hd.toString());
    }
    
}
