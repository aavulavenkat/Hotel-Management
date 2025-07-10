import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(10); // Example: 10 rooms

        int choice;
        do {
            System.out.println("\n=== Hotel Management System ===");
            System.out.println("1. View All Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Check-out");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    hotel.viewRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    hotel.bookRoom(roomNumber, guestName);
                    break;
                case 3:
                    System.out.print("Enter room number to check out: ");
                    int checkoutRoom = scanner.nextInt();
                    hotel.checkoutRoom(checkoutRoom);
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}

