/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Honey extends Product {
   
    private String type;
    private double jarSize;
    
    public Honey() {
    super();
    }
    
    public Honey(String name, String flavour, double cost, String type, double jarSize) {
        super();
        this.type = type;
        this.jarSize = jarSize;
        setProductName(name);
        setFlavour(flavour);
        setCost(cost);
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getJarSize() {
        return this.jarSize;
    }
    
    public void setJarSize(double jarSize) {
        this.jarSize = jarSize;
    }
    
    public String toString() {
        return String.format("%s : $%.2f", getProductName(), getCost());
    }
    
    
    
    
}
