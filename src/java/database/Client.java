/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Mahmoud Eltaieb
 */
@Entity
public class Client {

    @Id
    @GeneratedValue
    private int userId;
    private String email;
    private String password;
    private String userName;
    private String userJob;
    private double userCredit;
    private String userAddress;
    private String mobileNumber;
    @ManyToMany
    private Collection<Category> interest = new ArrayList<Category>();
    private int active = 1;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthdate;

    public Client() {
    }

    public Client(String email, String password, String mobileNumber, String birthdate, String userName, String userJob, String userAddress, double userCredit, List<String> interest) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.userJob = userJob;
        this.userCredit = userCredit;
        this.userAddress = userAddress;
        this.birthdate = database.UtilityClass.getDate(birthdate);
        this.mobileNumber = mobileNumber;
        this.interest = database.DatabaseHandler.initalizeUserInterests(interest);

    }

    public Client(String email, String password, String mobileNumber, String birthdate, String userName, String userJob, String userAddress, double userCredit, ArrayList<Category> interest) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.userJob = userJob;
        this.userCredit = userCredit;
        this.userAddress = userAddress;
        this.birthdate = database.UtilityClass.getDate(birthdate);
        this.mobileNumber = mobileNumber;
        this.interest = interest;

    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userJob
     */
    public String getUserJob() {
        return userJob;
    }

    /**
     * @param userJob the userJob to set
     */
    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    /**
     * @return the userCredit
     */
    public double getUserCredit() {
        return userCredit;
    }

    /**
     * @param userCredit the userCredit to set
     */
    public void setUserCredit(double userCredit) {
        this.userCredit = userCredit;
    }

    /**
     * @return the userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress the userAddress to set
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * @return the mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber the mobileNumber to set
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return the interest
     */
    public Collection<Category> getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(Collection<Category> interest) {
        this.interest = interest;
    }

    /**
     * @return the active
     */
    public int getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(int active) {
        this.active = active;
    }

    /**
     * @return the birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

   
}