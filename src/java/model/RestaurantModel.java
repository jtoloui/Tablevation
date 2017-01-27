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
 * A class that manages Restaurant data
 * and execute queries on the database
 * @author Francesco David Nota
 */
public class RestaurantModel implements Model{
    
    private final Connection conn;
    private String email;
    private String password;
    private String name;
    private String addressLine1;
    private String area;
    private String city;
    private String county;
    private String postCode;
    private int rating;
    private int bookedSeats;
    private String foodType;
    private int totalNumberOfSeats;
    private String contactNumber;
    private Date monOpTime;
    private Date monClTime;
    private Date tueOpTime;
    private Date tueClTime;
    private Date wedOpTime;
    private Date wedClTime;
    private Date thurOpTime;
    private Date thurClTime;
    private Date fryOpTime;
    private Date fryClTime;
    private Date satOpTime;
    private Date satClTime;
    private Date sunOpTime;
    private Date sunClTime;
    
    /**
     * constructor that connect the class to the database
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public RestaurantModel() throws SQLException, ClassNotFoundException{
       conn = Database.getConnection();
    }
    
    
    // METHODS INTERFACING WITH THE DATABASE //
    
    @Override
    public void insert(Model model) {
        RestaurantModel restaurant = (RestaurantModel) model;
        PreparedStatement ps;
        String query = "INSERT INTO Restaurant "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
    }

    @Override
    public void update(Model model) {
        ReservationModel customer = (ReservationModel) model;
        PreparedStatement ps;
        String query = "UPDATE Restaruant SET (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override
    public LinkedList<Object> select(LinkedList<Object> keys) {
        return null;
    }
    
    // GETTERS AND SETTERS //
    
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the bookedSeats
     */
    public int getBookedSeats() {
        return bookedSeats;
    }

    /**
     * @param bookedSeats the bookedSeats to set
     */
    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    /**
     * @return the foodType
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * @param foodType the foodType to set
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    /**
     * @return the totalNumberOfSeats
     */
    public int getTotalNumberOfSeats() {
        return totalNumberOfSeats;
    }

    /**
     * @param totalNumberOfSeats the totalNumberOfSeats to set
     */
    public void setTotalNumberOfSeats(int totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the monOpTime
     */
    public Date getMonOpTime() {
        return monOpTime;
    }

    /**
     * @param monOpTime the monOpTime to set
     */
    public void setMonOpTime(Date monOpTime) {
        this.monOpTime = monOpTime;
    }

    /**
     * @return the monClTime
     */
    public Date getMonClTime() {
        return monClTime;
    }

    /**
     * @param monClTime the monClTime to set
     */
    public void setMonClTime(Date monClTime) {
        this.monClTime = monClTime;
    }

    /**
     * @return the tueOpTime
     */
    public Date getTueOpTime() {
        return tueOpTime;
    }

    /**
     * @param tueOpTime the tueOpTime to set
     */
    public void setTueOpTime(Date tueOpTime) {
        this.tueOpTime = tueOpTime;
    }

    /**
     * @return the tueClTime
     */
    public Date getTueClTime() {
        return tueClTime;
    }

    /**
     * @param tueClTime the tueClTime to set
     */
    public void setTueClTime(Date tueClTime) {
        this.tueClTime = tueClTime;
    }

    /**
     * @return the wedOpTime
     */
    public Date getWedOpTime() {
        return wedOpTime;
    }

    /**
     * @param wedOpTime the wedOpTime to set
     */
    public void setWedOpTime(Date wedOpTime) {
        this.wedOpTime = wedOpTime;
    }

    /**
     * @return the wedClTime
     */
    public Date getWedClTime() {
        return wedClTime;
    }

    /**
     * @param wedClTime the wedClTime to set
     */
    public void setWedClTime(Date wedClTime) {
        this.wedClTime = wedClTime;
    }

    /**
     * @return the thurOpTime
     */
    public Date getThurOpTime() {
        return thurOpTime;
    }

    /**
     * @param thurOpTime the thurOpTime to set
     */
    public void setThurOpTime(Date thurOpTime) {
        this.thurOpTime = thurOpTime;
    }

    /**
     * @return the thurClTime
     */
    public Date getThurClTime() {
        return thurClTime;
    }

    /**
     * @param thurClTime the thurClTime to set
     */
    public void setThurClTime(Date thurClTime) {
        this.thurClTime = thurClTime;
    }

    /**
     * @return the fryOpTime
     */
    public Date getFryOpTime() {
        return fryOpTime;
    }

    /**
     * @param fryOpTime the fryOpTime to set
     */
    public void setFryOpTime(Date fryOpTime) {
        this.fryOpTime = fryOpTime;
    }

    /**
     * @return the fryClTime
     */
    public Date getFryClTime() {
        return fryClTime;
    }

    /**
     * @param fryClTime the fryClTime to set
     */
    public void setFryClTime(Date fryClTime) {
        this.fryClTime = fryClTime;
    }

    /**
     * @return the satOpTime
     */
    public Date getSatOpTime() {
        return satOpTime;
    }

    /**
     * @param satOpTime the satOpTime to set
     */
    public void setSatOpTime(Date satOpTime) {
        this.satOpTime = satOpTime;
    }

    /**
     * @return the satClTime
     */
    public Date getSatClTime() {
        return satClTime;
    }

    /**
     * @param satClTime the satClTime to set
     */
    public void setSatClTime(Date satClTime) {
        this.satClTime = satClTime;
    }

    /**
     * @return the sunOpTime
     */
    public Date getSunOpTime() {
        return sunOpTime;
    }

    /**
     * @param sunOpTime the sunOpTime to set
     */
    public void setSunOpTime(Date sunOpTime) {
        this.sunOpTime = sunOpTime;
    }

    /**
     * @return the sunClTime
     */
    public Date getSunClTime() {
        return sunClTime;
    }

    /**
     * @param sunClTime the sunClTime to set
     */
    public void setSunClTime(Date sunClTime) {
        this.sunClTime = sunClTime;
    }

}
