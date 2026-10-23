/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author syaki
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: Zarith Syakirini");
        System.out.println("Student ID: S85090");
        
                int Programming = 80;
        int ComputerArchitecture = 85;
        int Total = Programming + ComputerArchitecture;
        System.out.println("Total Marks: " + Total);
        
        if (Total >= 160) {
            System.out.println("Excellent Scores");
        } else if (Total >= 140) {
            System.out.println("Good Scores");
        } else if (Total < 140) {
            System.out.println("Needs improvement");
        }
    }
    
}
