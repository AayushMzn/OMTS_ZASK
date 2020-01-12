package nccs.omts.model;

public class Tickets {
        private int ticket_id;
	private int booking_id;
	private double price;
        private int status;

    public Tickets(int ticket_id, int booking_id, double price, int status) {
        this.ticket_id = ticket_id;
        this.booking_id = booking_id;
        this.price = price;
        this.status = status;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}