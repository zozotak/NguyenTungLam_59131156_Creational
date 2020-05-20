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
public class Rectangle extends Shape{
    private static Shape rectangle;

    protected Rectangle() 
    {
        super("Hình chữ nhật...","Hình chữ nhật giấy","Khung hình chữ nhật"); 
    }
    
    public static Shape createInstance()
    {
        if(rectangle == null)
            rectangle = new Circle();
        return rectangle;
    }   
    
    @Override
    public String draw() {
        return rectangle.getBrush() + "; " + rectangle.getPaper() 
                + "; " + rectangle.getFrame();
    }
    
}