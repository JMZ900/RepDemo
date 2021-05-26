/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jake M
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        double x;
        double y;
        String type;
        int count = 0;
        Object[] objects = new Object[4];
        Scanner in = new Scanner(System.in);
        
    do { 
        System.out.println("Enter object type: ");
        type = in.next();
        count++;
        
        if (type.equalsIgnoreCase("cylinder")) {
        System.out.println("Enter object dimensions RadiusxHeight: ");
        x = in.nextDouble();
        y = in.nextDouble();
        
            if (count == 1) {
                Cylinder can1 = new Cylinder(x,y);
                objects[i] = can1;
                i++;
            }
            if (count == 2) {
                Cylinder can2 = new Cylinder(x,y);
                objects[i] = can2;
                i++;
            }
            if (count == 3) {
                Cylinder can3 = new Cylinder(x,y);
                objects[i] = can3;
                i++;
            }  
            else if (count == 4) {
                Cylinder can4 = new Cylinder(x,y);
                objects[i] = can4;
                i++;
            }
        }
        
        else if (type.equalsIgnoreCase("circle")) {
            System.out.println("Enter dimensions R: ");
            x = in.nextDouble();
            
            if (count == 1) {
                Circle c1 = new Circle(x);
                objects[i] = c1;
                i++;
            }
            
            if (count == 2) {
                Circle c2 = new Circle(x);
                objects[i] = c2;
                i++;
            }
        }
    } while (count != 4);
}
}
    
