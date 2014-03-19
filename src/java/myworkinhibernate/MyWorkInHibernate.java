/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myworkinhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import database.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author orcl
 */
public class MyWorkInHibernate {

    /**
     * @param args the command line arguments
     */
    static DatabaseHandler database = new DatabaseHandler();

    public static void main(String[] args) {
        //registerClient();
        //  signIn("mahmoud@gmail.com", "13456");
       /*
         SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         */
        /*
         session.save(product);
         session.getTransaction().commit();
         */
        
        /*
        ArrayList<Product> products = database.getProducts(new String[] {"anythin2g"});
           for(Product p : products)
           {
               System.out.println(p.getProductName()+" "+p.getImageUrl() + " " + p.getAvailable());
           
           }*/
        
        addProduct(null);

        }
        
    

    /*
     
     * */
    public static void print(Object toPrint) {

        System.out.println(toPrint);
    }

    public static Category getCategory(String categoryName) {
        Category category = (Category) database.getCategory(categoryName);
        if (category == null) {
            print("no Such category");
            return null;
        } else {
            print(category.getCategoryId());
        }
        return category;

    }

    public static void loadAllCategories() {

        ArrayList<Category> categories = database.getAllCategories();

        for (Category c : categories) {
            System.out.println(c.getCategoryName() + " avaialbility " + c.getAvailable() + " id " + c.getCategoryId());
        }
    }

    public static boolean isNull(Object object) {
        if (object == null) {
            System.out.println("Object is null");
            return true;
        }
        System.out.println("Object is not null");
        return false;
    }

    public static Client getClient(String clientEmail) {

        return database.getClient(clientEmail);
    }

    public static void registerClient() {


        Client c = new Client("Mahmoud@gmail.com", "123456", "01112256793", "19-07-2011", "Mahmoud mohamed eltaieb", "developer", "Cairo", 125, Arrays.asList(new String[]{"Computer", "Art"}));

        database.register(c);
    }

    public static void signIn(String userName, String password) {

        int result = database.signIn(userName, password);
        System.out.println(result);
    }

    public static void addProduct(Product product) {

         Product p = new Product("oracle for beginners", 10, 10, "best books ever ", "\\fdsfds.com", "computer books");
        database.addProduct(p);

    }
}
