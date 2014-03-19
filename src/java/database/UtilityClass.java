/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author orcl
 */
public class UtilityClass {

    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
    public static Date getDate(String dateAsString) {


        SimpleDateFormat formatedDate = new SimpleDateFormat("yyyy-mm-dd");
        Date date;
        try {
            date = formatedDate.parse(dateAsString);
        } catch (ParseException ex) {
            return null;
        }
        return date;
    }
    
   
}
