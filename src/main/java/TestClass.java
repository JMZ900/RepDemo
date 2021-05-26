/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class TestClass {
    
    public static void displayShapeInfo(Circle c) {
        System.out.println(c);
        System.out.print("Area: " + c.calcArea());
        if (c instanceof Cylinder) { //is a cylinder?
            Cylinder temp = (Cylinder)c;
            System.out.println("Volume: " + temp.calcVolume());
        }
        
        
    }
    
}
