/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Firsty {
    private double y;
    private double x;
    Firsty Origin;
    
    public Firsty() {
    this.x = 0;
    this.y = 0;
    }
    
    public Firsty(double x, double y) {
            this.x = x;
            this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return String.format("%.1f, %.1f", x, y);
    }
    
}
