/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class Student {
    private String name;
    private String id;
    
    public Student(){}
    
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, String id){
    this.name = name;
    this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the ID
     */
    public String getId() {
        return this.id;
    }
    
    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}
