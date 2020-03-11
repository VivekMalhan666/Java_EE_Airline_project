/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Raghda
 */
public class Economy extends Seats{
    
    private String Moviedeals;
    private String Fooddeals;

    public Economy() {
        this.Moviedeals = " ";
        this.Fooddeals = " ";
    }

    public String getMoviedeals() {
        return Moviedeals;
    }

    public void setMoviedeals(String Moviedeals) {
        this.Moviedeals = Moviedeals;
    }

    public String getFooddeals() {
        return Fooddeals;
    }

    public void setFooddeals(String Fooddeals) {
        this.Fooddeals = Fooddeals;
    }
    
}
