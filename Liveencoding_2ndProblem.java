/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liveencoding_2nd.problem;

import java.util.Scanner;

/**
 *
 * @author ALMEDA_CPE113
 */
public class Liveencoding_2ndProblem {

    /**
     * @param args the command line arguments
     */
    public static double calculateConsumptionCharge(
            double consumption, double rate) {
        return consumption * rate;
    }

    public static double calculateAdditionalCharge(
            double consumptionCharge, double percentage) {
        return consumptionCharge * (percentage / 100);
    }

    public static double calculateTotalBill(
            double consumptionCharge, double additionalCharge) {
        return consumptionCharge + additionalCharge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter electricity consumption (kWh): ");
        double consumption = input.nextDouble();

        System.out.print("Enter rate per kWh: ");
        double rate = input.nextDouble();

        System.out.print("Enter additional charge percentage: ");
        double percentage = input.nextDouble();

        double consumptionCharge =
                calculateConsumptionCharge(consumption, rate);

        double additionalCharge =
                calculateAdditionalCharge(consumptionCharge, percentage);

        double totalBill =
                calculateTotalBill(consumptionCharge, additionalCharge);

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.printf("Consumption Charge:       ₱%,.2f%n",
                consumptionCharge);
        System.out.printf("Additional Charge (%.0f%%):  ₱%,.2f%n",
                percentage, additionalCharge);
        System.out.printf("Total Electricity Bill:   ₱%,.2f%n",
                totalBill);

        input.close();
    }
}

