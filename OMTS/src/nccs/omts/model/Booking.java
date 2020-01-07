package nccs.omts.model;

public class Booking {
	private int booking_id;
	private int show_id;
	private int customer_id;
	public Booking(int booking_id, int show_id, int customer_id) {
		super();
		this.booking_id = booking_id;
		this.show_id = show_id;
		this.customer_id = customer_id;
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
	
	
}
