/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;

/**
 *
 * @author Mahmoud Eltaieb
 */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private int categoryId;
    @Column(unique = true)
    private String categoryName;
    private int available = 1;
    @ManyToMany(mappedBy = "interest")
    private Collection<Client> clients = new ArrayList<Client>();
    @OneToMany
    private Collection<Product> products = new ArrayList<Product>();

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(String categoryName, int available) {
        this.categoryName = categoryName;
        this.available = available;
    }

    /**
     * @return the categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the available
     */
    public int getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(int available) {
        this.available = available;
    }

    /**
     * @return the clients
     */
    public Collection<Client> getClients() {
        return clients;
    }

    /**
     * @param clients the clients to set
     */
    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }

    /**
     * @return the products
     */
    public Collection<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
