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
public class Main3 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape sCircle = sf.createShape(ShapeType.circle);
        Shape sRectangle = sf.createShape(ShapeType.rectangle);
        Shape sTritangle = sf.createShape(ShapeType.triangle);
          
        System.out.println(sCircle.draw());
        System.out.println("\n" + sRectangle.draw());
        System.out.println("\n" + sTritangle.draw());
    }
    
    
}
