package Trainbooking;

import java.util.*;

public class BookTrain{
    static Scanner input = new Scanner(System.in);
	static int count;

	static void bookTrain() {
		while (true) {
			System.out.print("\n\n1. Book Ticket \n2. Exit\n \n\nEnter Your choice : ");
			int choice = input.nextInt();
			switch (choice) {
				case 1:
					System.out.print("\n\tTicket Booking\n");
					System.out.print("\nEnter Train Name to Book : ");
					String trainName = input.next();

					for (int i = 0; i < Train.traindetails.size(); i++) {
						if (trainName.equals(Train.traindetails.get(i).trainName)) {
							count = i;
							selectCoaches();
						} else {
							return;
						}
					}
					break;



					

				case 2:
					return;
			}
		}
	}


	static void selectCoaches() {
		while (true) {
			System.out.print("\n\tChoose Coach \n\n1. Chair car \n2. Sleeper Car \n3. Chair Car Ac \n4. Sleeper Car Ac \n5. Exit \n\nEnter your Choice : ");
			int choice = input.nextInt();
			switch (choice) {
				case 1:
					chairCar();
				case 2:
					sleeperCar();
				case 3:
					chairCarAc();
				case 4:
					sleeperCarAc();
				case 5:
					bookTrain();
			}
		}
	}

	static void chairCar() {

		System.out.print("\nChoose Seat type\n\n1. Window \n2. Middle \n3. Aisle \n4. Exit \n\nEnter our choice : ");
		int choice = input.nextInt();
		while (true) {
			switch (choice) {
				case 1:
					System.out.print("\nEnter the Number of seats you want : ");
					int seat = input.nextInt();
					System.out.println(Train.window);
					System.out.println(Train.traindetails.get(count).chair);
					int window = Train.window * Train.traindetails.get(count).chair;
					int available = window - seat;
					System.out.println(available);
					System.out.println(window);
					break;

				case 2:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 3:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 4:
					return;

				default:
					break;
			}

		}
	}

	static void chairCarAc() {

		System.out.print("\nChoose Seat type\n\n1. Window \n2. Middle \n3. Aisle \n4. Exit \n\nEnter our choice : ");
		int choice = input.nextInt();
		while (true) {
			switch (choice) {
				case 1:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 2:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 3:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 4:
					return;

				default:
					break;
			}

		}
	}

	static void sleeperCar() {

		System.out.print(
				"\nChoose Seat type\n\n1. Upper \n2. Lower \n3. Middle \n4. Side Upper \n5. Side Lower\n6. Exit ");
		System.out.print("\nEnter Your Choice : ");
		int choice = input.nextInt();
		while (true) {
			switch (choice) {
				case 1:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 2:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 3:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 4:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 5:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				default:
					break;
			}
		}
	}

	static void sleeperCarAc() {

		System.out.print(
				"\nChoose Seat type\n\n1. Upper \n2. Lower \n3. Middle \n4. Side Upper \n5. Side Lower\n6. Exit ");
		System.out.print("\nEnter Your Choice : ");
		int choice = input.nextInt();
		while (true) {
			switch (choice) {
				case 1:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 2:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 3:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 4:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				case 5:
					System.out.print("\nEnter the Number of seats you want : ");
					break;

				default:
					break;
			}
		}
	}

}
