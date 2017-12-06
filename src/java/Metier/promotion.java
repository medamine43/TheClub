/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Mohamed
 */
public class promotion implements Serializable{
    private int id;
    private String name;
    private String description;
    private double price;
    private Date date_start;
    private Date date_end;
    private int club_id;

    public promotion() {
    }

    public promotion(int id, String name, String description,double price, Date date_start, Date date_end, int club_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.date_start = date_start;
        this.date_end = date_end;
        this.club_id = club_id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
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

    public Date getDate_start() {
        return date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public int getClub_id() {
        return club_id;
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

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }
    
}
