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
public class ProductCatalog implements Serializable{
    
    @Id
    private Long ID;
    
    // Define relationship (one-to-many etc.)
    private List<Product> products; 

    public ProductCatalog(Long ID, List<Product> products) {
        this.ID = ID;
        this.products = products;
    }

    public ProductCatalog() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
