/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Cylinder extends Circle {
    private double height = 1;
 
    public Cylinder() {
        super();
    }
 
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }
 
    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Invalid value for height.");
    }
 
    public double getHeight() {
        return height;
    }
    public double calcArea() {
        return 2 * super.calcArea() * height * 2 * Math.PI * getRadius();
    }
    
    public double calcVolume() {
        return height * super.calcArea();
    }
    
    public boolean equals(Object cylinder) {
        Cylinder c = (Cylinder)cylinder;
        return (c.getHeight() == this.height && c.calcVolume() == this.calcVolume());
    }
    
    @Override
    public String toString() {
        return (height + "");
    }
}