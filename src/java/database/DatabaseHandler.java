/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mahmoud Eltaieb
 */
public class DatabaseHandler {

    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    static Session session = sessionFactory.openSession();
    static Session clientSession = sessionFactory.openSession();
    static Session productSession = sessionFactory.openSession();
    static Session categorySession = sessionFactory.openSession();

    public int register(Client c) {



        session.beginTransaction();
        Query q = session.createQuery("from Client where email like ?");
        q.setString(0, c.getEmail());
        List<Client> cleint = (List<Client>) q.list();
        if (cleint.size() > 0) {
            return -1;
        }
        try {
            session.save(c);
            session.getTransaction().commit();
            System.out.println("Registration Succedded");
        } catch (Exception ex) {
            ex.printStackTrace();
            return -2;
        }
        return 0;
    }

    public ArrayList<Category> getAllCategories() {
        session.beginTransaction();
        Query query = session.createQuery("from Category");
        ArrayList<Category> result = (ArrayList<Category>) query.list();
        session.getTransaction().commit();
        return result;
    }

    public ArrayList<Product> getAllProductsByCategory(int categoryId) {
        session.beginTransaction();
        Query query = session.createQuery("From Category where categoryId = ?");
        query.setInteger(0, categoryId);
        Category category = (Category) query.uniqueResult();
        query = session.createQuery("From Product where category = ?");
        query.setEntity(0, category);
        session.getTransaction().commit();
        return (ArrayList<Product>) query.list();

    }

    public Product getProductById(int i) {
        session.beginTransaction();
        Product product = (Product) session.get(Product.class, i);
        session.getTransaction().commit();
        return product;

    }

    public ArrayList<Product> getProductsByClientInterests(int i) {
        session.beginTransaction();
        Client client = (Client) session.get(Client.class, i);
        Query query = session.createQuery("From Product where category in ?");
        query.setEntity(0, client.getInterest());
        ArrayList<Product> products = (ArrayList<Product>) query.list();
        session.getTransaction().commit();
        return products;

    }

    public static ArrayList<Category> initalizeUserInterests(List<String> interest) {

        session.beginTransaction();

        Query query = session.createQuery("from Category where categoryName in :interest");
        query.setParameterList("interest", interest);
        ArrayList<Category> initalizeUserInterests = (ArrayList<Category>) query.list();

        session.getTransaction().commit();
        return initalizeUserInterests;


    }

    public int addCategory(Category category) {
        categorySession.beginTransaction();
        try {
            categorySession.saveOrUpdate(category);
            categorySession.getTransaction().commit();

        } catch (Exception ex) {
            return -1;
        }
        return 0;
    }

    public Category getCategory(String categoryName) {
        categorySession.beginTransaction();
        Query q = categorySession.createQuery("from Category where upper(categoryName) like ?");
        q.setString(0, categoryName.toUpperCase());
        Category category = (Category) q.uniqueResult();
        categorySession.getTransaction().commit();
        return category;

    }

    public Client getClient(int id) {

        clientSession.beginTransaction();
        Client client = (Client) clientSession.load(Client.class, id);
        clientSession.getTransaction().commit();
        return client;

    }

    public Client getClient(String email) {

        clientSession.beginTransaction();
        Query q = clientSession.createQuery("from Client where upper(email) like ?");
        q.setString(0, email.toUpperCase());
        Client client = (Client) q.uniqueResult();
        clientSession.getTransaction().commit();
        return client;

    }

    // will return -1 if this email in not registered on out system
    // will return -2 if the password is incorrect and user will be adviced to restore password if we are able to
    // return 0 if every thing is ok and hold the client to be as an attribute define in scope of session
    public int signIn(String email, String password) {


        if (!alreadyRegistered(email)) {
            return -1;
        }
        clientSession.beginTransaction();
        Query q = clientSession.createQuery("from Client where upper(email) like ? and password like ?");
        q.setString(0, email.toUpperCase());
        q.setString(1, password);
        Client client = (Client) q.uniqueResult();
        if (client == null) {
            return -2;
        }
        //  return the client object and define it at the scope of session
        // ya session set attribute his name is currectClient and the value of it is the client
        return 0;

    }

    public boolean alreadyRegistered(String email) {
        clientSession.beginTransaction();
        Query q = clientSession.createQuery("from Client where upper(email) like ?");
        q.setString(0, email.toUpperCase());
        Client client = (Client) q.uniqueResult();
        clientSession.getTransaction().commit();
        if (client == null) {
            return false;
        }
        return true;
    }

    public int addProduct(Product product) {
        clientSession.beginTransaction();
        int result = 0;
        try {
            clientSession.saveOrUpdate(product);
        } catch (Exception ex) {
            result = -1;
        }
        clientSession.getTransaction().commit();
        return result;
    }

    public  ArrayList<Product> getProducts(String[] catego) {

        productSession.beginTransaction();
        Query q = productSession.createQuery("from Product where category in :categories");
        q.setParameterList("categories", initalizeUserInterests(Arrays.asList(catego)));
        ArrayList<Product> products = (ArrayList<Product>) q.list();


        productSession.getTransaction().commit();
        return products;
    }
}
