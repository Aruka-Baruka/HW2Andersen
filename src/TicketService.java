public class TicketService {
    public static void main(String[] args) {
        // Create 3 tickets: empty, full, and limited
        Ticket emptyTicket = new Ticket();
        Ticket fullTicket = new Ticket("TICK123", "Concert Hall 1", 123, 1643723400, true, 'A', 5.5);
        Ticket limitedTicket = new Ticket("Concert Hall 2", 456, 1643723400);

        // Print out the tickets
        System.out.println("Empty Ticket: " + emptyTicket.toString());
        System.out.println("Full Ticket: " + fullTicket.toString());
        System.out.println("Limited Ticket: " + limitedTicket.toString());
    }
}
