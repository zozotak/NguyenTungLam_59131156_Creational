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
public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;
    
    protected Shape()
    {
        
    }
    
    protected Shape(String brush, String paper, String frame)
    {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    
    public String getBrush()
    {
        return this.brush;
    }
    
    public String getPaper()
    {
        return this.paper;
    }
    
    public String getFrame()
    {
        return this.frame;
    }
    public abstract String draw();
}