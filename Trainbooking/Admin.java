package Trainbooking;

import java.util.*;

public class Admin {
    static Scanner input = new Scanner(System.in);

    static void signIn() {
        final String name = "train";
        final String pass = "123";

        System.out.print("\nEnter Your Name : ");
        String userName = input.next();
        System.out.print("\nEnter Your Password : ");
        String passWord = input.next();

        if (name.equals(userName) && pass.equals(passWord)) {
            System.out.print("\nSign In Succesfully\n");
            options();
        } else {
            System.out.print("\n\nUsername or Passward Mismatch\n\n");
            return;
        }
    }

    //Display options after admin signin
    static void options() {
        while (true) {
            System.out.print("\n\n1. Add Train \n2. Food Menu \n3. Total Cost of Travel \n4. Log out \n\n Enter Your Choice : ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Train.addTrain();
                    break;
                case 2:
                    Food.foodMenu();
                    break;
                case 3:
                    Train.totalCostAllTrain();
                    break;
                case 4:
                    Main.main(null);
                default:
                    System.out.print(" \n Invalid Choice ");
                    break;
            }
        }
    }
}