/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author S1ndr3
 */
@Stateless
@LocalBean
public class Feedback {

    public Feedback(User author, Integer ID, Double rating, String content) {
        this.author = author;
        this.ID = ID;
        this.rating = rating;
        this.content = content;
    }

    public Feedback() {
    }
    
    User author;    
    Integer ID;
    Double rating;
    String content;
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
