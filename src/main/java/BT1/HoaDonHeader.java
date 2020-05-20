/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
class HoaDonHeader {
    String maHD, tenKH;
    Date ngayBan;
    //Constructor co tham so
    public HoaDonHeader(String maHD, Date ngayBan, String tenKH)
    {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() 
    {
        return "Ma Hoa Don: " + maHD + "\nNgay ban: " 
                + new SimpleDateFormat("dd/MM/yyyy").format(ngayBan) 
                + "\nTen KH: " + tenKH;
    }
}
