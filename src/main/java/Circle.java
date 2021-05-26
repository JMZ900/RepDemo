/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Circle {
     
    private double radius = 1;
 
    public Circle() {   
    }
 
    public Circle(double radius) throws IllegalArgumentException {
        setRadius(radius);
    }
 
    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Invalid value for radius.");
    }
 
    public double getRadius() {
        return radius;
    }
 
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }
     
    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }
 
    @Override
    public String toString() {
        return "Circle: radius=" + radius;
    }
 
    public boolean equals(Object circle) {
        Circle c = (Circle)circle;
        return (c.getRadius() == this.radius);
    }
}



