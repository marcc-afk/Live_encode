/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding;

import java.util.Scanner;

/**
 *
 * @author ALMEDA_CPE113
 */
public class Livecoding {

    /**
     * @param args the command line arguments
     */
    public static double calculateAverage(double prelim, double midterm, double finalExam) {
        return (prelim + midterm + finalExam) ;
    }

    
    public static String getGradeEquivalent(double average) {

     if (average >= 90 && average <= 100) {
        return "2.0";
    } else if (average >= 85) {
        return "2.5";
    } else if (average >= 80) {
        return "2.5";
    } else if (average >= 75) {
        return "2.0";
    } else if (average >= 74) {
        return "2.5";
    } else {
        return "3.0";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter prelim exam score: ");
        double prelim = input.nextDouble();

        System.out.print("enter midterm exam score: ");
        double midterm = input.nextDouble();

        System.out.print("enter final exam score: ");
        double finalExam = input.nextDouble();

        double average = calculateAverage(prelim, midterm, finalExam);

        String grade = getGradeEquivalent(average);

        System.out.println("\n-> Academic Performance <-");
        System.out.printf(" Average: ", average);
        System.out.println(" Grade Equivalent: " + grade);    

        input.close();
    }
}