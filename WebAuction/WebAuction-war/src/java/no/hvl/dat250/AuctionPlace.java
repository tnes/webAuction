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
public class AuctionPlace implements Serializable{
    
    @Id
    Integer ID;
    
    // Define relationship (one-to-many etc.)
    List<User> users;
    
    public AuctionPlace() {
    }

    public AuctionPlace(List<User> users, Integer ID) {
        this.users = users;
        this.ID = ID;
    }
    
        public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
