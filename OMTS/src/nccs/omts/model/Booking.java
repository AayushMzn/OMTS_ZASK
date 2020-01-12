package nccs.omts.model;

public class Booking {
	private int booking_id;
	private int show_id;
	private int customer_id;
        private String date;
        private int status_id;

    public Booking(int booking_id, int show_id, int customer_id, String date, int status_id) {
        this.booking_id = booking_id;
        this.show_id = show_id;
        this.customer_id = customer_id;
        this.date = date;
        this.status_id = status_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
        
    
	
	
	
	
}
