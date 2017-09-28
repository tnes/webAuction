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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author TorkelNes
 */
@Stateful
@LocalBean
@Entity
@Table(name = "\"User\"") //User is a reservered SQL keyword - this escapes this
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @ManyToOne
    private AuctionPlace auctionplace;
    
    private Double rating;    
    private String username;
    private String password;
    private Boolean loggedIn;
    private String email;
    private String phonenumber;
    
    // Riktig med OneToOne når det er flere, selvstendige objekter? 
    
    @OneToOne (mappedBy = "owner")
    private ProductCatalog acquiredProducts;
    
    @OneToOne (mappedBy = "owner")
    private ProductCatalog soldProducts;
    
    @OneToOne (mappedBy = "owner")
    private ProductCatalog productCatalog;
    
    @OneToMany (mappedBy = "author")
    private List<Feedback> feedback;
    
    public User() {
        
    }
    
    public Long getId() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = id;
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

    public List<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<Feedback> feedback) {
        this.feedback = feedback;
    }

    public ProductCatalog getAcquiredProducts() {
        return acquiredProducts;
    }

    public void setAcquiredProducts(ProductCatalog acquiredProducts) {
        this.acquiredProducts = acquiredProducts;
    }

    public ProductCatalog getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(ProductCatalog soldProducts) {
        this.soldProducts = soldProducts;
    }
    
    public void setPhoneNumber(String n){
        this.phonenumber = n;
    }
    
    public String getPhoneNumber(){
        return phonenumber; 
    }
    
    public void setEmail(String n){
        this.email = n;
    }
    
    public String getEmail(){
        return email;
    } 
    
      public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    public AuctionPlace getAuctionplace() {
        return auctionplace;
    }

    public void setAuctionplace(AuctionPlace auctionplace) {
        this.auctionplace = auctionplace;
    }
}
