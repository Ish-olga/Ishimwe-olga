package HotelManagementSystem;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" LEMIGO HOTEL MANAGEMENT SYSTEM");
        System.out.println("------------------------------");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Book a room");
            System.out.println("2. Checkout a guest");
            System.out.println("3. Generate a bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            // Exit if user chooses 4
            if (choice == 4) {
                System.out.println("Thank you for using LEMIGO HOTEL system. Goodbye!");
                break;
            }


            System.out.print("Enter Guest ID: ");
            String guestId = sc.nextLine();

            System.out.print("Enter Guest Name: ");
            String guestName = sc.nextLine();

            System.out.print("Enter Room Type (STANDARD/DELUXE/SUITE): ");
            String roomType = sc.nextLine().toUpperCase();

            System.out.print("Enter Stay Days: ");
            int stayDays = sc.nextInt();
            sc.nextLine();

            String roomStatus = "OCCUPIED"; // assuming already booked

            Billing billing = new Billing(guestId, guestName, roomType, roomStatus,stayDays);
            billing.generalBill();

            sc.close();
        }
    }
}



