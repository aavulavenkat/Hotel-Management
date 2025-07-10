import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void viewRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void bookRoom(int roomNumber, String guestName) {
        Room room = rooms.get(roomNumber - 1);
        if (!room.isBooked()) {
            room.book(guestName);
            System.out.println("Room " + roomNumber + " booked successfully for " + guestName);
        } else {
            System.out.println("Room already booked.");
        }
    }

    public void checkoutRoom(int roomNumber) {
        Room room = rooms.get(roomNumber - 1);
        if (room.isBooked()) {
            room.checkout();
            System.out.println("Checked out from room " + roomNumber);
        } else {
            System.out.println("Room is not booked.");
        }
    }
}
