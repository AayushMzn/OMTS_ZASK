/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nccs.omts.model;

/**
 *
 * @author Aayush
 */
public class UserView {
    private String date;
    private int show_id;
    private String movie_name;
    private String hall_name;
    private String shift_time;
    private double price;
    private int tickets_num;

    public UserView(String date, int show_id, String movie_name, String hall_name, String shift_time, double price, int tickets_num) {
        this.date = date;
        this.show_id = show_id;
        this.movie_name = movie_name;
        this.hall_name = hall_name;
        this.shift_time = shift_time;
        this.price = price;
        this.tickets_num = tickets_num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public String getShift_time() {
        return shift_time;
    }

    public void setShift_time(String shift_time) {
        this.shift_time = shift_time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTickets_num() {
        return tickets_num;
    }

    public void setTickets_num(int tickets_num) {
        this.tickets_num = tickets_num;
    }
    
    
}
