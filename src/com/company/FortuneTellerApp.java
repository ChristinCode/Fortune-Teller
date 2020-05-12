package com.company;

import com.sun.source.tree.CaseTree;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to WCCI's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);


        System.out.println("What is your first name:");
        String firstName = input.nextLine();
        System.out.println("Your first name in " + firstName);

        System.out.println("What is your last name:");
        String lastName = input.nextLine();
        System.out.println("Your last name in " + lastName);

        System.out.println("What is your age:");
        int userAge = input.nextInt();
        System.out.println("Your age is " + userAge);

        System.out.println("What is your birth month number:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
        System.out.println("Your birth were born " + userBirthMonth);


        System.out.println("What is your favorite ROYGBIV color, type help if you don't know the colors.");
        String favoriteColor = input.nextLine();
        System.out.println("Your favorite color is " + favoriteColor);
        if (favoriteColor.equalsIgnoreCase("Help")) {
            System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, and Violet use one of these values.");
        }

        System.out.println("How many siblings do you have:");
        int siblingCount = input.nextInt();
        System.out.println("You have " + siblingCount + " siblings");

        int yearsToRetirement = 0;
        if (userAge % 2 == 0) {
            yearsToRetirement = 12;
        } else {
            yearsToRetirement = 14;
        }
        System.out.println(yearsToRetirement + " Years to Retirement");

        String vacationHomeLocation = "Chernobyl, Ukraine";
        if (siblingCount == 0) {
            vacationHomeLocation = "Boca Raton, FL";
        } else if (siblingCount == 1) {
            vacationHomeLocation = "Nassau, Bahamas";
        } else if (siblingCount == 2) {
            vacationHomeLocation = "Ponta Negra, Brazil";
        } else if (siblingCount == 3) {
            vacationHomeLocation = "Portland, Oregon";
        } else if (siblingCount > 3) {
            vacationHomeLocation = "Baton Rouge, LA";
        }
        System.out.println("Vacation home is in " + vacationHomeLocation);

        String modeOfTransportation = "";
        switch (favoriteColor.toLowerCase()) {

            case "red":
                modeOfTransportation = "Maserati";
                break;
            case "orange":
                modeOfTransportation = "Stallion";
                break;
            case "yellow":
                modeOfTransportation = "Chariot";
                break;
            case "green":
                modeOfTransportation = "Taxi";
                break;
            case "blue":
                modeOfTransportation = "Rickshaw";
                break;
            case "indigo":
                modeOfTransportation = "Motor Scooter";
                break;
            case "Violet":
                modeOfTransportation = "Flying Saucer";
                break;
            default:
                modeOfTransportation = "Walking Shoes";
        }

        Double bankBalance = 0.0;
        if (userBirthMonth > 0 && userBirthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (userBirthMonth > 4 && userBirthMonth <= 8) {
            bankBalance = 3687105.42;
        } else if (userBirthMonth > 8 && userBirthMonth <= 12) {
            bankBalance = 86.23;
        } else if (userBirthMonth <0 && userBirthMonth < 12) {
            bankBalance = 0.00;
        }
        System.out.println("You have $" + bankBalance + " in the bank.");


        System.out.println("Your results are in!!! \n"
                +  firstName + " " + lastName + " will retire in " + yearsToRetirement + " years, \n"
                + " with $" + bankBalance+ " in the bank, \n"
                + " and a vacation house in " + vacationHomeLocation + "!");

    }
}
