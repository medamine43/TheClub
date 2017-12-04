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
public class clubcity implements Serializable{
    private int id;
    private int club_id;
    private int city_id;

    public clubcity(int id, int club_id, int city_id) {
        this.id = id;
        this.club_id = club_id;
        this.city_id = city_id;
    }

    public clubcity() {
    }

    public int getId() {
        return id;
    }

    public int getClub_id() {
        return club_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }
    
}
