/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author ASUS
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Name and ID
        System.out.println("Name: Nur Syahidah Binti Shamsul Anwar");
        System.out.println("Student ID: S87282");
        
        //store marks
        int mark1 = 45;
        int mark2 = 50;
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        
        //calculate total marks
        int total = mark1 + mark2;
        
        //Display total
        System.out.println("Total Marks: " + total);
        
        //Display message based on total
        if (total >= 80) {
            System.out.println("Excellent");
        } else if (total >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}
