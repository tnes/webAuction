/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import controller.AbstractFacade;
import database.MessageFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.jms.Message;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Table;

/**
 *
 * @author TorkelNes
 */
@Stateful
@LocalBean
@Entity
@Table(name = "\"User\"") //User is a reservered SQL keyword - this escapes this
@NamedQueries({
    @NamedQuery(name = "User.findByUsername", query = "SELECT u from User u WHERE u.username = :username"),
    @NamedQuery(name = "User.createUser", query = "")
    })
public class User extends AbstractFacade<User> {
    @PersistenceContext(unitName = "WebAuction-warPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
    return em;
    }
    
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
        super(User.class);
    }
    
    public boolean isValidLogin(String username, String password) {
        boolean isValid;
        Query createNamedQuery = getEntityManager().createNamedQuery("User.findByUsername");
        createNamedQuery.setParameter("username", username);
        
        if(createNamedQuery.getResultList().size() > 0) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }
    
    public boolean isValidRegister(String un, String em, String pn, String pw) {
        if(isValidUsername(un) && isValidEmail(em) && isValidPhonenumber(pn) && isValidPassword(pw)) {
            Query createNamedQuery = getEntityManager().createNamedQuery("User.findByUsername");
            createNamedQuery.setParameter("username", username);
        }
        return true;
    }
    
    public User fetchUser(String username) {
        Query createNamedQuery = getEntityManager().createNamedQuery("User.findByUsername");
        createNamedQuery.setParameter("username", username);
            return (User) createNamedQuery.getSingleResult();
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
    
    private boolean isValidUsername(String username) {
        return true;
    }
    
    private boolean isValidPassword(String password) {
        return true;
    }
    
    private boolean isValidEmail(String email) {
        return true;
    }
    
    private boolean isValidPhonenumber(String phonenumber) {
        return true;
    }
}
