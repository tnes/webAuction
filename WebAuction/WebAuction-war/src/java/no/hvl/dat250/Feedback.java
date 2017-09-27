/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import java.io.Serializable;
import java.util.List;
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
public class Feedback implements Serializable{
    
    @Id
    private Long ID;
    
    // Define relationship (one-to-many etc.)
    private User author; 
  
    private Double rating;
    private String content;
    
    public Feedback() {
    }

    public Feedback(User author, Long ID, Double rating, String content) {
        this.author = author;
        this.ID = ID;
        this.rating = rating;
        this.content = content;
    }    

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
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
