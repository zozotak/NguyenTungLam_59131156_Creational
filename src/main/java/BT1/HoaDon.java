/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
     HoaDonHeader hdHeader;
    ArrayList<CTHD> dsCTHD= new ArrayList<>();
    //Thiet lap lop hoa don thong qua lop builder
    protected HoaDon(Builder builder)
    {
        this.hdHeader = builder.hdHeader;
        this.dsCTHD = builder.dsCTHD;
    }
    //Hien thi thong tin trong hoa don

    @Override
    public String toString() {
        String s = "";
        s += hdHeader.toString();
        for(int i=0; i<dsCTHD.size(); i++)
        {
            s += "\nSan Pham Thu " + (i+1);
            s += dsCTHD.get(i).toString();
        }
        return s;
    }
    
    
    public static class Builder 
    {
        HoaDonHeader hdHeader;
        ArrayList<CTHD> dsCTHD = new ArrayList<>();
        //Constuctor ko tham so
        public Builder()
        {
            
        }
        //Them hoa don Header cho lop Builder
        public Builder addHDHeader(HoaDonHeader hdHD)
        {
            this.hdHeader = hdHD;
            return this; // Tra ve hoa don Header cua lop Builder
        }
        //Them cac chi tiet cua hoa don vao lop Builder
        public Builder addCTHD(CTHD ctHD)
        {
            this.dsCTHD.add(ctHD);
            return this; 
        }
        //Tao ra mot hoa don moi
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
}
