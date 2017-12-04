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
public class sport implements Serializable{
    int id;
    String icon, name, description;

    public sport(int id, String icon, String name, String description) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.description = description;
    }
    
    public sport(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
