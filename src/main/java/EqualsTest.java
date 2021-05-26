
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class EqualsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Circle c = new Circle(20);
        Circle d = new Circle(20);
        System.out.println(c.equals(d));
       
        HashMap<String, String> map = new HashMap<>();
map.put("Texas", "Dallas");
map.put("Oklahoma", "Norman");
map.put("Texas", "Austin");
map.put("Oklahoma", "Tulsa");
System.out.println(map.get("Texas"));
System.out.println(map.size());

try { 
    method();
    System.out.println("After the method call");
    
} catch (RuntimeException ex) {
    System.out.println("RuntimeException in main");
} catch (Exception ex) {
    System.out.println("Exception in main");
}
    }
    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
            
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }
    
    public void m(int value) throws Exception {
        if (value < 40) {
           throw new Exception("value is too small"); 
          }
     } 
     public static void main(String arr) {
}
}
    

