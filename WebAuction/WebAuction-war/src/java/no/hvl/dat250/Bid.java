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
public class Bid implements Serializable{
    
    @Id
    Integer ID;
    
    // Define relationship (one-to-many etc.)
    User bidder;
    Double amount;
    
    public Bid() {
    }

    public Bid(User bidder, Double amount, Integer ID) {
        this.bidder = bidder;
        this.amount = amount;
        this.ID = ID;
    }

    public User getBidder() {
        return bidder;
    }

    public void setBidder(User bidder) {
        this.bidder = bidder;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
