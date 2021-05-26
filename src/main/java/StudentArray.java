
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake M
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Student[] studList = new Student[5];
        
        for (int i =0; i<studList.length; i++) {
            studList[i] = new Student();
            System.out.println("Enter name: ");
            String name = in.nextLine();
            studList[i].setName(name); 
            System.out.println("Enter ID#: ");
            String id = in.nextLine();
            studList[i].setId(id);
        }
        for (int i = 0; i<studList.length; i++) {
            System.out.println("Student " + i + ": " + studList[i].getName() + 
                    " " + studList[i].getId());
        }
    }
    
}
