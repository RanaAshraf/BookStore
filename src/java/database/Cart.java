/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author orcl
 */
@Entity
public class Cart {

    @Id
    int cartMemeberId;
    @OneToOne
    Client user;
    @OneToOne
    Product product;
    int Quantity;

    public int getCartMemeberId() {
        return cartMemeberId;
    }

    public void setCartMemeberId(int cartMemeberId) {
        this.cartMemeberId = cartMemeberId;
    }
}
