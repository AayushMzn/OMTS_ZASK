package nccs.omts.model;

public class Transaction {
	private int transactions_id;
	private int	booking_id;
	private int	customer_id;
	private int transactions_date;
	private int	price;
	public Transaction(int transactions_id, int booking_id, int customer_id, int transactions_date, int price) {
		super();
		this.transactions_id = transactions_id;
		this.booking_id = booking_id;
		this.customer_id = customer_id;
		this.transactions_date = transactions_date;
		this.price = price;
	}
	public int getTransactions_id() {
		return transactions_id;
	}
	public void setTransactions_id(int transactions_id) {
		this.transactions_id = transactions_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getTransactions_date() {
		return transactions_date;
	}
	public void setTransactions_date(int transactions_date) {
		this.transactions_date = transactions_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}