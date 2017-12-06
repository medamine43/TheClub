/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.clubsport;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class clubsportImpl implements Iclubsport{
    Connection conn = SingletonConnection.getCon();

    @Override
    public boolean save(clubsport c) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into clubsport values('"+c.getId()+"','"+c.getClub_id()+"',"+c.getSport_id()+")");
        } catch (SQLException ex) {
        }
        if( r != 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public List<clubsport> clubsport() {
        clubsport cl = new clubsport();
        List<clubsport> ls = new ArrayList<>();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from clubsport");
                 while(r.next()){
                     int id = r.getInt("id");
                     int  club_id = r.getInt("club_id");
                     int sport_id = r.getInt("sport_id");
                     cl.setId(id);
                     cl.setClub_id(club_id);
                     cl.setSport_id(sport_id);
                     ls.add(cl);
                 }
            } catch (SQLException ex) {
            }
            return ls;
    }

    @Override
    public boolean delete(int key) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("delete from clubsport where id="+key);
        } catch (SQLException ex) {
        }
        if( r != 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public clubsport clubsportyByKey(int key) {
        clubsport cl = new clubsport();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select top 1 * from clubsport where id ="+key);
                 while(r.next()){
                     int id = r.getInt("id");
                     int  club_id = r.getInt("club_id");
                     int sport_id = r.getInt("sport_id");
                     cl.setId(id);
                     cl.setClub_id(club_id);
                     cl.setSport_id(sport_id);
                 }
            } catch (SQLException ex) {
            }
            return cl;
    }
    
}
