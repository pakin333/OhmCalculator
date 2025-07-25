/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ohnlaw;

import java.util.Scanner;

/**
 *
 * @author 344_12
 */
public class Ohmcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice = 0;
        float voltage, current, resistance;
        Scanner scan = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("======================");
            System.out.println("==  OHM Calculato   ==");
            System.out.println("======================");
            System.out.println("1. Voltage");
            System.out.println("2. Current");
            System.out.println("3. Resistance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            ohmcal ohm = new ohmcal();
            switch (choice) {

                case 1:
                    System.out.print("Enter Current: ");
                    current = scan.nextFloat();
                    System.out.print("Enter Resistance: ");
                    resistance = scan.nextFloat();
                    System.out.println("voltage = "+ohm.calvoltage(current,resistance)+" .V");
                    break;
                case 2:
                    
//                    calcurrent();
                    break;
                case 3:
                    System.out.println("ohm");
//                calresistance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("your choice is wrong");
            }
        }

    }

}
