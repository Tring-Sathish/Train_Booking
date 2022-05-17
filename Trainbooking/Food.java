package Trainbooking;

import java.util.*;

class Food {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Fooddetails> breakFast = new ArrayList<>();
    static ArrayList<Fooddetails> lunch = new ArrayList<>();
    static ArrayList<Fooddetails> dinner = new ArrayList<>();

    static void foodMenu() {
        while (true) {
            System.out.print(" \n\n\t Food Menu\n");
            System.out.print(" 1. Breakfast \n 2. Lunch \n 3. Dinner \n 4. Display Menu\n 5. Exit\n");
            System.out.print("\nEnter your choice : ");
            int choice2 = input.nextInt();
            switch (choice2) {
                case 1:
                    breakFast();
                    break;
                case 2:
                    lunch();
                    break;
                case 3:
                    dinner();
                    break;
                case 4:
                    displayMenu();
                    break;
                case 5:
                    Admin.options();
                default:
                    System.out.print(" \n Invalid Choice\n ");
                    break;
            }
        }
    }

    // Add breakfast
    static void breakFast() {
        System.out.print("\nEnter Your Breakfast : ");
        String Name = input.next();
        System.out.print("\nEnter the price for Breakfast : ");
        int Price = input.nextInt();
        float startTime = 7;
        float endTime = 10;
        System.out.print("\nAvailable time : " + String.format("%.02f", startTime) + " - " + String.format("%.02f", endTime));
        breakFast.add(new Fooddetails(Name, Price, startTime, endTime));

    }

    // Add lunch
    static void lunch() {
        System.out.print("\nEnter Your Lunch : ");
        String Name = input.next();
        System.out.print("\nEnter the price for Lunch : ");
        int Price = input.nextInt();
        float startTime = 13;
        float endTime = 15;
        System.out.print("\nAvailable time : " + String.format("%.02f", startTime) + " - " + String.format("%.02f", endTime));
        lunch.add(new Fooddetails(Name, Price, startTime, endTime));

    }

    // Add dinner
    static void dinner() {
        System.out.print("\nEnter Your Dinner : ");
        String Name = input.next();
        System.out.print("\nEnter the price for Dinner : ");
        int Price = input.nextInt();
        float startTime = 19;
        float endTime = 22;
        System.out.print("\nAvailable time : " + String.format("%.02f", startTime) + " - " + String.format("%.02f", endTime));
        dinner.add(new Fooddetails(Name, Price, startTime, endTime));
    }

    // Display all the menu items
    static void displayMenu() {
        System.out.print("\n\tBreakfast");
        for (int i = 0; i < breakFast.size(); i++) {
            System.out.print(breakFast.get(i));
        }

        System.out.print("\n\n\tLunch");
        for (int i = 0; i < lunch.size(); i++) {
            System.out.print(lunch.get(i));
        }

        System.out.print("\n\n\tDinner");
        for (int i = 0; i < dinner.size(); i++) {
            System.out.print(dinner.get(i));
        }
    }

    // Display menu if availble between train time
    static void availableMenu() {

        for (int i = 0; i < breakFast.size(); i++) {
            if (Train.trainstartTime <= breakFast.get(i).startTime && Train.trainendTime >= breakFast.get(i).endTime) {
                System.out.print(breakFast.get(i));
            }
        }

        for (int i = 0; i < lunch.size(); i++) {
            if (Train.trainstartTime <= lunch.get(i).startTime && Train.trainendTime >= lunch.get(i).endTime) {
                System.out.print(lunch.get(i));
            }
        }

        for (int i = 0; i < dinner.size(); i++) {
            if (Train.trainstartTime <= dinner.get(i).startTime && Train.trainendTime >= dinner.get(i).endTime) {
                System.out.print(dinner.get(i));
            }
        }

    }
}