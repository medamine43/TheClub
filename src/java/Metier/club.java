/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.Serializable;

/**
 *
 * @author Mohamed
 */
public class club implements Serializable{
    private int id;
    private String name;
    private String description;
    private String logo;
    private String cover;
    private String address;
    private int phone;
    private String email;
    private String facebook;
    private int gender;
    private double longitude;
    private double latitude;

    public club() {
    }

    public club(int id, String name, String description, String logo, String cover, String address, int phone, String email, String facebook, int gender, double longitude, double latitude) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.logo = logo;
        this.cover = cover;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.facebook = facebook;
        this.gender = gender;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLogo() {
        return logo;
    }

    public String getCover() {
        return cover;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFacebook() {
        return facebook;
    }

    public int getGender() {
        return gender;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
    
    
}
