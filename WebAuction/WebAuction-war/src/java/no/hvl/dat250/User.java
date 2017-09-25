/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author TorkelNes
 */
@Stateful
@LocalBean
public class User {
    
    private int id;
    
    private double rating;
    //private ProductCatalog catalog;
    //private List<Feedback> feedback;
    
    private String username;
    private String password;
    private boolean loggedIn;
    
    //List<Product> acquiredProducts;
    //List<Product> soldProducts;
    
    public User() {
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    public String logIn() {
        return ""; // "SUCCESS" or "FAIL"
    }
    
}
