/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Itterator_Pattern;

/**
 *
 * @author fa20-bse-019
 */
public class ItteratorPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("\n-------ITTERATOR PATTERN => TUTORIAL POINT--------\n");
      NameRepository namesRepository = new NameRepository();
      
        System.out.println("All Students:");
        Iterator iter = namesRepository.getIterator();
        while (iter.hasNext()) 
        {
            Student student = (Student) iter.next();
            System.out.println("RegNo: " + student.regNo + ", Name: " + student.name +", Phone : "+student.phoneNumber+", Gender:"+student.gender);
        }

        System.out.println("\nStudents with Names Starting from 'Muhammad':");
        iter.moveToLast(); 
        while (iter.hasNext()) 
        {
            Student student = (Student) iter.next();
            if (student.name.startsWith("Muhammad")) {
                System.out.println("RegNo: " + student.regNo + ", Name: " + student.name +", Phone : "+student.phoneNumber+", Gender:"+student.gender);
            }
        }
        
        System.out.println("\n-------ITTERATOR PATTERN => REFACTORING GURU--------\n");
        
        Application app = new Application();
        app.config();

        System.out.println("Sending spam to friends:");
        app.sendSpamToFriends("123"); // "123" is a placeholder for the profile ID

        System.out.println("\nSending spam to coworkers:");
        app.sendSpamToCoworkers("123"); // "123" is a placeholder for the profile ID
        
    }
    
}
