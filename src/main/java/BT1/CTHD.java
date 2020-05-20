/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Admin
 */
    public class CTHD {
    String sanPham;
    int soLuong;
    long donGia, chietKhau;
    //Constructor co tham so
    public CTHD(String sanPham, int soLuong, long donGia, long chietKhau)
    {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() 
    {
        return "\nSan pham: " + sanPham + "\nSo luong: " + soLuong
        + "\nDon gia: " + donGia + "\nChiet khau: " + chietKhau;    
    }

}
    

