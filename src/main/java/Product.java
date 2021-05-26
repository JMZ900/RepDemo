/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Product {
    
    private String productName;
    private String flavour;
    private double cost;
    
    public Product() {
        
    }
    
    public Product(String name,String flavour, double cost) {
        setProductName(name);
        setFlavour(flavour);
        setCost(cost);
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String name) {
        this.productName = name;
    }
    
    public String getFlavour() {
        return this.flavour;
    }
    
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    
    public double getCost() {
        return this.cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public String toString() {
        return "Products: name: " + productName + " flavour: " + flavour + " cost: " + cost;
    }
    
}
