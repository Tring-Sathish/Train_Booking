package Trainbooking;

import java.util.*;

public class User {
	static Scanner input = new Scanner(System.in);
	static ArrayList<User> userDetails = new ArrayList<>();
	String userName;
	String passWord;

	User(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}

	public String toString() {
		return userName + "-" + passWord;
	}

	static void user() {
		while (true) {
			System.out.print("\n1. SIGN-UP \n2. SIGN-IN \n3. EXIT\n\nEnter Your Choice : ");
			int choice = input.nextInt();
			switch (choice) {
				case 1:
					System.out.print("\n\tSIGN UP\n");
					signUp();
					break;

				case 2:
					System.out.print("\n\tSIGN IN\n");
					sign_In();
					break;

				case 3:
					Main.main(null);
				default:
					System.out.print("\nInvalid Choice\n");
					break;
			}
		}
	}
	//user signup
	static void signUp() {
		System.out.print("\nEnter Your Name : ");
		String userName = input.next();
		System.out.print("\nEnter Your Password : ");
		String passWord = input.next();
		userDetails.add(new User(userName, passWord));
	}
	//user signin
	public static void sign_In() {
		System.out.print("\nEnter Your Name : ");
		String name = input.next();
		System.out.print("\nEnter Your Password : ");
		String pass = input.next();

		for (int i = 0; i < userDetails.size(); i++) {

			if (name.equals(userDetails.get(i).userName) && pass.equals(userDetails.get(i).passWord)) {
				System.out.print("\n\nSign In Succesfully\n\n");
				System.out.print("\n1. Browse Trains \n2. Logout\n\nEnter Your Choice : ");
				int choice1 = input.nextInt();
				switch (choice1) {
					case 1:
						Train.browseTrains();
						break;

					case 2:
						user();
				}
			}
		}
	}
}
