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
public class AuctionPlace {

    public AuctionPlace(List<User> users, Integer ID) {
        this.users = users;
        this.ID = ID;
    }

    public AuctionPlace() {
    }
    
    List<User> users;
    Integer ID;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
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
