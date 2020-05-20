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
public class Circle extends Shape{ 
    private static Shape circle;

    protected Circle()
    {
       super("Hình tròn...","Hình tròn giấy","Khung hình tròn"); 
    }

    public static Shape createInstance()
    {
        if(circle == null)
            circle = new Circle();
        return circle;
    }     
    
    @Override
    public String draw() {
        return circle.getBrush() + "; " + circle.getPaper() 
               + "; " + circle.getFrame();
    }
    
}
