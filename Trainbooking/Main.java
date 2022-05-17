package Trainbooking;
import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    static int choice;

    public static void main(String[] args) { 

        System.out.print("\n\n\tTrain Booking\n");
        System.out.print("\n1. ADMIN \n2. USER \n3. EXIT \n\nEnter Your Choice : ");
        choice = input.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.print("\n\tSIGN IN\n");
                    Admin.signIn();
                    break;

                case 2:
                    User.user();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.print("\nInvalid Choice\n");
                    break;
            }
        }
    }
}
