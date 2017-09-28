/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import no.hvl.dat250.User;

/**
 *
 * @author TorkelNes
 */
@Named(value = "userController")
@SessionScoped
public class UserController implements Serializable {

    @EJB
    private User user;
    private String username;
    private String password;

    /**
     * Creates a new instance of UserController
     */
    public UserController() {
    
    
    }
    
    public String login() {
        
        
        
        
        
        
        
       return null; 
    }
    
}
