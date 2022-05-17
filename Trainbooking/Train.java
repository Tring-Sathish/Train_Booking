package Trainbooking;

import java.util.*;

class Train {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Traindetails> traindetails = new ArrayList<>();
    static Float trainstartTime;
    static Float trainendTime;
    static int count = 0;
    static int totalAmount;
    static int totalCost;
    static int window;
    static int windowAc = 22;
    static int middle, middleAc = 22;
    static int aisle, aisleAc = 22;
    static int upper, upperAc = 12;
    static int lower, lowerAc = 12;
    static int middleSleeper, middleSleeperAc = 12;
    static int sideUpper, sideUpperAc = 6;
    static int sideLower, sideLowerAc = 6;



    // Add train details in arraylist

    static void addTrain() {

        System.out.print(" \n\tAdd Train\n");
        System.out.print(" \nEnter Train Name : ");
        String trainName = input.next();

        System.out.print(" \nEnter Source Location : ");
        String sourceLocation = input.next();

        System.out.print(" \nEnter Destination Location : ");
        String destinationLocation = input.next();

        System.out.print(" \nEnter Start Time : ");
        Float startTime = input.nextFloat();

        System.out.print(" \nEnter End Time : ");
        Float endTime = input.nextFloat();

        System.out.print(" \nEnter Total Distance : ");
        int distance = input.nextInt();

        System.out.print("\nEnter the number of coaches to be Add : ");
        System.out.print("\nChaircar : ");
        int noofcoaches1 = input.nextInt();

        System.out.print("\nChaircar Ac : ");
        int noofcoaches2 = input.nextInt();

        System.out.print("\nSleeper Car : ");
        int noofcoaches3 = input.nextInt();

        System.out.print("\nSleeper Car Ac : ");
        int noofcoaches4 = input.nextInt();

        traindetails.add(new Traindetails(trainName, sourceLocation, destinationLocation, startTime, endTime, distance,
                noofcoaches1, noofcoaches2, noofcoaches3, noofcoaches4));
        totalCost();
    }

    // Adding total cost of train
    static void totalCost() {
        int windowPrice = 2 * window * traindetails.get(count).chair * traindetails.get(count).distance;
        int aislePrice = 2 * aisle * traindetails.get(count).chair * traindetails.get(count).distance;
        int middlePrice = 1 * middle * traindetails.get(count).chair * traindetails.get(count).distance;
        int totalCostchair = windowPrice + aislePrice + middlePrice;

        int windowPriceAc = 6 * windowAc * traindetails.get(count).chairac * traindetails.get(count).distance;
        int aislePriceAc = 6 * aisleAc * traindetails.get(count).chairac * traindetails.get(count).distance;
        int middlePriceAc = 5 * middleAc * traindetails.get(count).chairac * traindetails.get(count).distance;
        int totalCostchairAc = windowPriceAc + aislePriceAc + middlePriceAc;

        int upperPrice = 1 * upper * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int lowerPrice = 1 * lower * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int middlesleeperPrice = 1 * middleSleeper * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int sideUpperPrice = 1 * sideUpper * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int sideLowerPrice = 1 * sideLower * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int totalCostsleeper = upperPrice + lowerPrice + middlesleeperPrice + sideLowerPrice + sideUpperPrice;

        int upperPriceAc = 5 * upperAc * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int lowerPriceAc = 5 * lowerAc * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int middlesleeperPriceAc = 5 * middleSleeperAc * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int sideUpperPriceAc = 5 * sideUpperAc * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int sideLowerPriceAc = 5 * sideLowerAc * traindetails.get(count).sleeper * traindetails.get(count).distance;
        int totalCostsleeperAc = upperPriceAc + lowerPriceAc + middlesleeperPriceAc + sideLowerPriceAc + sideUpperPriceAc;

        totalCost = totalCostchair + totalCostchairAc + totalCostsleeper + totalCostsleeperAc;
        System.out.print("\nTotal Cost of " + traindetails.get(count).trainName + " = " + totalCost);
        totalAmount += totalCost;
        count++;
        System.out.print("\n___________________________________________________");
    }

    static void totalCostAllTrain() {
        for (int i = 0; i < traindetails.size(); i++) {
            System.out.print("\nTotal Cost of train " + traindetails.get(i).trainName + " is = ");
        }
        System.out.print("\nTotal Cost : " + totalAmount);
    }

    static void browseTrains() {
        while (true) {
            System.out.print(
                    "\n\n1. Search train by Source Location \n2. Search train by Destination Location \n3. Exit\n");
            System.out.print("\nEnter your choice : ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    browseSourceLocation();
                    Food.availableMenu();
                    break;

                case 2:
                    browseDestinationLocation();
                    Food.availableMenu();
                    break;

                case 3:
                    return;

                default:
                    System.out.print("\nInvalid choice");
            }
        }
    }

    // Browse train by source location
    static void browseSourceLocation() {
        System.out.print("\n\tBrowse Train\n");
        System.out.print("\nEnter train Source Location :");
        String sLocation = input.next();

        for (int i = 0; i < traindetails.size(); i++) {
            if (sLocation.equals(traindetails.get(i).sourceLocation)) {
                System.out.print(traindetails.get(i));

                trainstartTime = traindetails.get(i).startTime;
                trainendTime = traindetails.get(i).endTime;
                BookTrain.bookTrain();
            } else {
                return;
            }
        }
    }

    // Browse train by destination location
    static void browseDestinationLocation() {
        System.out.print("\n\tBrowse Train\n");
        System.out.print("\nEnter train Destination Location : ");
        String dLocation = input.next();

        for (int i = 0; i < traindetails.size(); i++) {
            if (dLocation.equals(traindetails.get(i).destinationLocation)) {
                System.out.print(traindetails.get(i));
                System.out.print(traindetails.get(i));
                trainstartTime = traindetails.get(i).startTime;
                trainendTime = traindetails.get(i).endTime;
                BookTrain.bookTrain();
            } else {
                return;
            }

        }

    }

}