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
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import no.hvl.dat250.User;

/**
 *
 * @author TorkelNes
 */
@Named(value = "user")
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
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        String result;
        boolean isValid;
        
        this.username = request.getParameter("username");
        this.password = request.getParameter("password");
        
        isValid = this.user.isValid(this.username, this.password);
        
        if(isValid) {
            this.user.fetchUser(this.username);
            result = "/products";
        } else {
            //Bruker er ugyldig
            result = "login";
        }
       return null; 
    }
    
}
