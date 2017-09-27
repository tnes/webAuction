/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author TorkelNes
 */
@Stateful
@LocalBean
@Entity
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Double rating;    
    private String username;
    private String password;
    private Boolean loggedIn;
    
    // Define relationship (one-to-many etc.)
    @OneToMany (mappedBy = "id")    
    private List<Product> acquiredProducts;
    
    // Define relationship (one-to-many etc.)
    @OneToMany (mappedBy = "id")
    private List<Product> soldProducts;
    
    // Define relationship (one-to-many etc.)
    @OneToOne(mappedBy = "id")
    private ProductCatalog catalog;
    
    // Define relationship (one-to-many etc.)
    @OneToMany(mappedBy = "id")
    private List<Feedback> feedback;
    
    public User() {
        
    }
    
     public User(Long id, double rating, ProductCatalog catalog, List<Feedback> feedback, String username, String password, boolean loggedIn, List<Product> acquiredProducts, List<Product> soldProducts) {
        this.id = id;
        this.rating = rating;
        this.catalog = catalog;
        this.feedback = feedback;
        this.username = username;
        this.password = password;
        this.loggedIn = loggedIn;
        this.acquiredProducts = acquiredProducts;
        this.soldProducts = soldProducts;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    
    public ProductCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public List<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<Feedback> feedback) {
        this.feedback = feedback;
    }

    public List<Product> getAcquiredProducts() {
        return acquiredProducts;
    }

    public void setAcquiredProducts(List<Product> acquiredProducts) {
        this.acquiredProducts = acquiredProducts;
    }

    public List<Product> getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(List<Product> soldProducts) {
        this.soldProducts = soldProducts;
    }
    
}
