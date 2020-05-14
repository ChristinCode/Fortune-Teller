package com.company;

import com.sun.source.tree.CaseTree;
import org.w3c.dom.ls.LSOutput;

import javax.naming.BinaryRefAddr;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FortuneTellerApp<userBirthMonth> {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to WCCI's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);

        String firstName = getFirstName(input);
        String lastName = getLastName(input);
        int userAge = getUserAge(input);
        int userBirthMonth = getUserBirthMonth(input);
        String favoriteColor = getFavoriteColor(input);
        int siblingCount = getSiblingCount(input);

        int yearsToRetirement = getYearsToRetirement(userAge);
        String vacationHomeLocation = getVacatinHomeLocation(siblingCount);

        getModeOfTransportation(favoriteColor);

        Double bankBalance = getBankBalance(userBirthMonth);

        System.out.println("Your results are in!!! \n"
                + firstName + " " + lastName + " will retire in " + yearsToRetirement + " years, \n"
                + " with $" + bankBalance + " in the bank, \n"
                + " and a vacation house in " + vacationHomeLocation + "!");

    }

    private static Double getBankBalance(int userBirthMonth) {
        Double bankBalance = 0.0;
        if (userBirthMonth > 0 && userBirthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (userBirthMonth > 4 && userBirthMonth <= 8) {
            bankBalance = 3687105.42;
        } else if (userBirthMonth > 8 && userBirthMonth <= 12) {
            bankBalance = 86.23;
        } else if (userBirthMonth < 0 && userBirthMonth < 12) {
            bankBalance = 0.00;
        }
        return bankBalance;
    }

    private static void getModeOfTransportation(String favoriteColor) {
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
    }

    private static String getVacatinHomeLocation(int siblingCount) {
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
        return vacationHomeLocation;
    }

    private static int getYearsToRetirement(int userAge) {
        int yearsToRetirement = 0;
        if (userAge % 2 == 0) {
            yearsToRetirement = 12;
        } else {
            yearsToRetirement = 14;
        }
        return yearsToRetirement;
    }

    private static int getSiblingCount(Scanner input) {
        System.out.println("How many siblings do you have:");
        return input.nextInt();
    }

    private static String getFavoriteColor(Scanner input) {
        System.out.println("What is your favorite ROYGBIV color, type help if you don't know the colors.");
        String favoriteColor = input.nextLine();
        if (favoriteColor.equalsIgnoreCase("Help")) {
            System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, and Violet use one of these values.");
        }
        return favoriteColor;
    }

    private static int getUserBirthMonth(Scanner input) {
        System.out.println("What is your birth month number:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
        while (userBirthMonth < 1 || userBirthMonth > 12) {
            System.out.println("Birth Month must be between 1 and 12.");
            userBirthMonth = input.nextInt();
        }
        return userBirthMonth;
    }

    public static String getFirstName(Scanner input) {
        System.out.println("What is your first name:");
        String firstName = input.nextLine();
        return firstName;
    }

    public static String getLastName(Scanner input) {
        System.out.println("What is your last name:");
        String lastName = input.nextLine();
        return lastName;
    }

    public static int getUserAge(Scanner input) {
        System.out.println("What is your age:");
        int userAge = input.nextInt();
        return userAge;
    }



}
