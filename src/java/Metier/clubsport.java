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
public class clubsport implements Serializable{
    private int id;
    private int club_id;
    private int sport_id;

    public clubsport(int id, int club_id, int sport_id) {
        this.id = id;
        this.club_id = club_id;
        this.sport_id = sport_id;
    }

    public clubsport() {
    }

    public int getId() {
        return id;
    }

    public int getClub_id() {
        return club_id;
    }

    public int getSport_id() {
        return sport_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public void setSport_id(int sport_id) {
        this.sport_id = sport_id;
    }
    
}
