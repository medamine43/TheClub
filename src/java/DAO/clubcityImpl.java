/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.clubcity;
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
public class clubcityImpl implements Iclubcity{
    Connection conn = SingletonConnection.getCon();

    @Override
    public boolean save(clubcity c) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into clubcity values('"+c.getId()+"','"+c.getClub_id()+"',"+c.getCity_id()+")");
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
    public boolean delete(int key) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("delete from clubcity where id="+key);
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
    public clubcity clubcityByKey(int key) {
        clubcity cl = new clubcity();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select top 1 * from clubcity where id ="+key);
                 while(r.next()){
                     int id = r.getInt("id");
                     int  club_id = r.getInt("club_id");
                     int city_id = r.getInt("city_id");
                     cl.setId(id);
                     cl.setClub_id(club_id);
                     cl.setCity_id(city_id);
                 }
            } catch (SQLException ex) {
            }
            return cl;
    }

    @Override
    public List<clubcity> clubcity() {
        clubcity cl = new clubcity();
        List<clubcity> ls = new ArrayList<>();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from clubcity");
                 while(r.next()){
                     int id = r.getInt("id");
                     int  club_id = r.getInt("club_id");
                     int city_id = r.getInt("city_id");
                     cl.setId(id);
                     cl.setClub_id(club_id);
                     cl.setCity_id(city_id);
                     ls.add(cl);
                 }
            } catch (SQLException ex) {
            }
            return ls;
    }
    
}
