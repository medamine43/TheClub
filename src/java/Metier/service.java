/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.Serializable;

/**
 *
 * @author ALCRDATE
 */
public class service implements Serializable{
    int id, club_id;
    String name, icon, description;

    public service(int id, int club_id, String name, String icon, String description) {
        this.id = id;
        this.club_id = club_id;
        this.name = name;
        this.icon = icon;
        this.description = description;
    }
    
    public service (){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClub_id() {
        return club_id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
