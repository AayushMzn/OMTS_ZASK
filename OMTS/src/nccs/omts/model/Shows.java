package nccs.omts.model;

public class Shows {
	private int show_id;
	private int hall_id;
	private int movie_id;
	private int shift_id;
        private int ticket_num;
        private double price;
        private String date;

    public Shows(int show_id, int hall_id, int movie_id, int shift_id, int ticket_num, double price, String date) {
        this.show_id = show_id;
        this.hall_id = hall_id;
        this.movie_id = movie_id;
        this.shift_id = shift_id;
        this.ticket_num = ticket_num;
        this.price = price;
        this.date = date;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getHall_id() {
        return hall_id;
    }

    public void setHall_id(int hall_id) {
        this.hall_id = hall_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getShift_id() {
        return shift_id;
    }

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    public int getTicket_num() {
        return ticket_num;
    }

    public void setTicket_num(int ticket_num) {
        this.ticket_num = ticket_num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
      
        
        