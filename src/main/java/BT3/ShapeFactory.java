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
public class ShapeFactory {
    public Shape createShape(ShapeType shapetype)
    {
        if(shapetype != null)
        {
            switch(shapetype)
            {
                case circle:
                    return Circle.createInstance(); 
                case rectangle:
                    return Rectangle.createInstance();
                case triangle:
                    return Triangle.createInstance();
            }
        }
        return null;
    }
}
