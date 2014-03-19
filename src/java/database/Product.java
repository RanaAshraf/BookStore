/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author orcl
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private double productPrice;
    @OneToOne
    private Category category;
    private int numberOfAvailableUnits;
    private String description;
    private String imageUrl;
    private int available = 1;

    public Product() {
       
    }

    public Product(String productName, double productPrice, int numberOfAvailableUnits, String description, String imageUrl, String category) {
      
        setProductName(productName);
        setProductPrice(productPrice);
        setNumberOfAvailableUnits(numberOfAvailableUnits);
        setDescription(description);
        setImageUrl(imageUrl);
        setCategory(setCategory(category));
    }

    public Product(String productName, double productPrice, int numberOfAvailableUnits, String description, String imageUrl, Category category) {
        
        setProductName(productName);
        setProductPrice(productPrice);
        setNumberOfAvailableUnits(numberOfAvailableUnits);
        setDescription(description);
        setImageUrl(imageUrl);
        setCategory(category);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getNumberOfAvailableUnits() {
        return numberOfAvailableUnits;
    }

    public void setNumberOfAvailableUnits(int numberOfAvailableUnits) {
        this.numberOfAvailableUnits = numberOfAvailableUnits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
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

    private Category  setCategory(String categoryName) {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        Category category = databaseHandler.getCategory(categoryName);

        if (category == null) 
        {
            category = new Category(categoryName);
            databaseHandler.addCategory(new Category(categoryName));
        }
       category = databaseHandler.getCategory(categoryName);
        return category;

    }
}
