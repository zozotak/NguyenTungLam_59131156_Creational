/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private static Shape triangle;
    
    protected Triangle()
    {
        super("Hình tam giác...","Hình tam giác giấy","Khung hình tam giác"); 
    }
    
    public static Shape createInstance()
    {
        if(triangle == null)
            triangle = new Triangle();
        return triangle;
    }
    
    @Override
    public String draw() {
        return triangle.getBrush() + "; " + triangle.getPaper() 
                + "; " + triangle.getFrame();
    }
    
}
