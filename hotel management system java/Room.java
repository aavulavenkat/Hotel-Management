public class Room {
    private int roomNumber;
    private boolean isBooked;
    private String guestName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        this.guestName = "";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book(String guestName) {
        this.isBooked = true;
        this.guestName = guestName;
    }

    public void checkout() {
        this.isBooked = false;
        this.guestName = "";
    }

    public String getGuestName() {
        return guestName;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " - " + (isBooked ? "Booked by " + guestName : "Available");
    }
}
