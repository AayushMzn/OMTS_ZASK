package nccs.omts.model;

public class Hall {
	private int hall_id;
	private String hall_name;
	private int seats;
	
	public Hall(int hall_id, String hall_name, int seats) {
		super();
		this.hall_id = hall_id;
		this.hall_name = hall_name;
		this.seats = seats;
	}

	public int getHall_id() {
		return hall_id;
	}

	public void setHall_id(int hall_id) {
		this.hall_id = hall_id;
	}

	public String getHall_name() {
		return hall_name;
	}

	public void setHall_name(String hall_name) {
		this.hall_name = hall_name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}
