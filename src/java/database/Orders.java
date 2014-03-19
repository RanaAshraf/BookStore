/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author orcl
 */
@Entity
public class Orders {

    @Id
    private int orderID;
    @OneToOne
    private Client user;
    @OneToOne
    private Product Product;

    public Orders() {
    }

    public Orders(Client user, Product Product, int quantity) {
        this.user = user;
        this.Product = Product;
        this.quantity = quantity;
    }
    private int quantity;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date orderingDate = new Date();

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the user
     */
    public Client getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Client user) {
        this.user = user;
    }

    /**
     * @return the Product
     */
    public Product getProduct() {
        return Product;
    }

    /**
     * @param Product the Product to set
     */
    public void setProduct(Product Product) {
        this.Product = Product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the orderingDate
     */
    public Date getOrderingDate() {
        return orderingDate;
    }

    /**
     * @param orderingDate the orderingDate to set
     */
    public void setOrderingDate(Date orderingDate) {
        this.orderingDate = orderingDate;
    }
    
}
