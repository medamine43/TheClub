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
public class usersubscription implements Serializable{
    int id , user_id, susbcription;

    public usersubscription(int id, int user_id, int susbcription) {
        this.id = id;
        this.user_id = user_id;
        this.susbcription = susbcription;
    }
    
    public usersubscription(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSusbcription() {
        return susbcription;
    }

    public void setSusbcription(int susbcription) {
        this.susbcription = susbcription;
    }
    
}
