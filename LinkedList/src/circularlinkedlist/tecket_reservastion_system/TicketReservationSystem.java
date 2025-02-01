package circularlinkedlist.tecket_reservastion_system;

class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head; // Circular reference
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Circular reference
        }
        System.out.println("Ticket booked successfully! Ticket ID: " + ticketId);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode previous = null;

        // If the ticket to remove is the head
        if (head.ticketId == ticketId) {
            if (head == tail) {
                head = tail = null; // Only one ticket in the list
            } else {
                tail.next = head.next;
                head = head.next;
            }
            System.out.println("Ticket with ID " + ticketId + " has been removed.");
            return;
        }

        // Traverse the circular list to find the ticket
        do {
            previous = current;
            current = current.next;
            if (current.ticketId == ticketId) {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous; // Update tail if necessary
                }
                System.out.println("Ticket with ID " + ticketId + " has been removed.");
                return;
            }
        } while (current != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = head;
        System.out.println("Current Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName +
                    ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String nameOrMovie) {
        if (head == null) {
            System.out.println("No tickets available to search.");
            return;
        }

        TicketNode current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(nameOrMovie) || current.movieName.equalsIgnoreCase(nameOrMovie)) {
                System.out.println("Ticket found: " +
                        "Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName +
                        ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found for '" + nameOrMovie + "'.");
        }
    }

    // Calculate the total number of booked tickets
    public void totalBookedTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        int count = 0;
        TicketNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total booked tickets: " + count);
    }
}
