package circularlinkedlist.tecket_reservastion_system;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Add some ticket reservations
        system.addTicket(101, "Naincy", "Avatar", "A1", "2025-01-29 10:00");
        system.addTicket(102, "Abhishek", "Titanic", "B2", "2025-01-29 12:00");
        system.addTicket(103, "Sanjh", "Avatar", "C3", "2025-01-29 14:00");
        system.addTicket(104, "Mayank", "Inception", "D4", "2025-01-29 16:00");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket by customer name or movie name
        system.searchTicket("Avatar");
        system.searchTicket("Titanic");

        // Remove a ticket by ticket ID
        system.removeTicket(102);
        system.removeTicket(999); // Non-existent ticket

        // Display all tickets after removal
        system.displayTickets();

        // Total booked tickets
        system.totalBookedTickets();
    }
}