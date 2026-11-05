/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding_3rd.problem;

/**
 *
 * @author ALMEDA_CPE113
 */
public class Livecoding_3rdProblem {

    /**
     * @param args the command line arguments
     */
    public static int calculateSum(int[] scores) {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum;
    }

    public static double calculateAverage(int[] scores) {
        return (double) calculateSum(scores) / scores.length;
    }

    public static int findHighest(int[] scores) {
        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        return highest;
    }

    public static int findLowest(int[] scores) {
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        return lowest;
    }

    public static int countPassing(int[] scores) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 75) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] scores = {85, 90, 72, 65, 95, 78, 88, 70};

        if (scores == null || scores.length == 0) {
            System.out.println("Error: The score array is empty.");
            return;
        }

        System.out.println("Statistical Information");
        System.out.println("--------------------------------");
        System.out.println("Total Number of Scores: "
                + scores.length);

        System.out.println("Sum of Scores: "
                + calculateSum(scores));

        System.out.println("Average Score: "
                + calculateAverage(scores));

        System.out.println("Highest Score: "
                + findHighest(scores));

        System.out.println("Lowest Score: "
                + findLowest(scores));

        System.out.println("Number of Passing Students: "
                + countPassing(scores));
    }
}
