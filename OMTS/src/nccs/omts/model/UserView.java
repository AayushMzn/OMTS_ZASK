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
    private int show_id;
    private String movie_name;
    private String hall_name;
    private String schedule_name;

    public UserView(int show_id, String movie_name, String hall_name, String schedule_name) {
        this.show_id = show_id;
        this.movie_name = movie_name;
        this.hall_name = hall_name;
        this.schedule_name = schedule_name;
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

    public String getSchedule_name() {
        return schedule_name;
    }

    public void setSchedule_name(String schedule_name) {
        this.schedule_name = schedule_name;
    }

    
    
}
