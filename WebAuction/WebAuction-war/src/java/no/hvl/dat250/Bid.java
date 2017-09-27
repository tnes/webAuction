/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author S1ndr3
 */
@Stateless
@LocalBean
public class Bid {

    public Bid(User bidder, Double amount, Integer ID) {
        this.bidder = bidder;
        this.amount = amount;
        this.ID = ID;
    }

    public Bid() {
    }
    
    User bidder;
    Double amount;
    Integer ID;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

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
