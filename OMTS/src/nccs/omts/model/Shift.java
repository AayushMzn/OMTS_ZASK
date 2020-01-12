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
public class Shift {
    private int shift_id;
    private String  shift_time;

    public Shift(int shift_id, String shift_time) {
        this.shift_id = shift_id;
        this.shift_time = shift_time;
    }

    public int getShift_id() {
        return shift_id;
    }

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    public String getShift_time() {
        return shift_time;
    }

    public void setShift_time(String shift_time) {
        this.shift_time = shift_time;
    }
}