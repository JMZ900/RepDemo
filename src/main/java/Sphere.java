/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Sphere extends Circle {
    
    private double radius;
    
    public Sphere()
    {}
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calcArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    
    public double calcVolume() {
        return 4/3 * Math.PI * Math.pow(this.radius, 3);
    }
}
