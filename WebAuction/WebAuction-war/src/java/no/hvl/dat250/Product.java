/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author S1ndr3
 */
@Stateless
@LocalBean
@Entity
public class Product implements Serializable{
    
    @Id
    private int id;
    
    private String name;
    private String picture; // May change
    private String features;
    
    private double rating;

    // Define relationship (one-to-many etc.)
    private Bid currentBid;
    
    private boolean published;
    
    private long remainingTime; // currentTimeMillis
    
    // Define relationship (one-to-many etc.)
    private User seller;
    
     public Product(int id, String name, String picture, String features, double rating, boolean published, long remainingTime, User seller) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.features = features;
        this.rating = rating;
        this.published = published;
        this.remainingTime = remainingTime;
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public long getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(long remainingTime) {
        this.remainingTime = remainingTime;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
    
     public Bid getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(Bid currentBid) {
        this.currentBid = currentBid;
    }

    /**
     * Creates a new instance of Product
     */
    public Product() {
    }
}
