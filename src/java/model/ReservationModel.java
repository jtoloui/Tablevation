/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author Francesco David Nota
 */
public class ReservationModel implements Model{
    
    private final Connection conn;
    private int id;
    private String restaurantName;
    private String restaurantEmail;
    private String customerEmail;
    private Date bookedTime;
    private int numberOfGuests;
    private String details;

    /**
     * constructor
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public ReservationModel() throws ClassNotFoundException, SQLException{
       conn = Database.getConnection();
    }
    
    // METHODS INTERFACING WITH THE DATABASE //
    
    @Override
    public void insert(Model model) {
        ReservationModel reservation = (ReservationModel) model;
        PreparedStatement ps;
        String query = "INSERT INTO Reservation VALUES (?,?,?,?,?,?,?)";
    }

    @Override
    public void update(Model model) {
        ReservationModel customer = (ReservationModel) model;
        PreparedStatement ps;
        String query = "UPDATE Reservation SET (?,?,?,?)";
    }
    
    @Override
    public LinkedList<Object> select(LinkedList<Object> keys) {
        return null;
    }
    
    // GETTERS AND SETTERS //
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the restaurantName
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * @param restaurantName the restaurantName to set
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * @return the restaurantEmail
     */
    public String getRestaurantEmail() {
        return restaurantEmail;
    }

    /**
     * @param restaurantEmail the restaurantEmail to set
     */
    public void setRestaurantEmail(String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }

    /**
     * @return the customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * @param customerEmail the customerEmail to set
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * @return the bookedTime
     */
    public Date getBookedTime() {
        return bookedTime;
    }

    /**
     * @param bookedTime the bookedTime to set
     */
    public void setBookedTime(Date bookedTime) {
        this.bookedTime = bookedTime;
    }

    /**
     * @return the numberOfGuests
     */
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    /**
     * @param numberOfGuests the numberOfGuests to set
     */
    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    /**
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    
}
