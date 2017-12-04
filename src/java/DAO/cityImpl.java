/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.city;
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
public class cityImpl implements Icity{
    Connection conn = SingletonConnection.getCon();

    @Override
    public boolean save(city c) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into cities values('"+c.getName()+"','"+c.getDescription()+"',"+c.getLongitude()+","+c.getLatitude()+")");
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
    public List<city> citiesByName(String key) {
              List<city> ls = new ArrayList<city>();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from cities where name ='"+key+"'");
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     double longitude = r.getDouble("longitude");
                     double latitude = r.getDouble("latitude");
                     city ct = new city();
                     ct.setId(id);
                     ct.setName(name);
                     ct.setDescription(description);
                     ct.setLongitude(longitude);
                     ct.setLatitude(latitude);
                     ls.add(ct);
                     
                 }
            } catch (SQLException ex) {
            }
            return ls;
    }

    @Override
    public List<city> cities() {
        List<city> ls = new ArrayList<city>();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from cities");
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     double longitude = r.getDouble("longitude");
                     double latitude = r.getDouble("latitude");
                     city ct = new city();
                     ct.setId(id);
                     ct.setName(name);
                     ct.setDescription(description);
                     ct.setLongitude(longitude);
                     ct.setLatitude(latitude);
                     ls.add(ct);
                     
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
            r = st.executeUpdate("delete from cities where id="+key);
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
    public city cityByKey(int key) {
        city ct = new city();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select top 1 * from cities where id ="+key);
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     double longitude = r.getDouble("longitude");
                     double latitude = r.getDouble("latitude");
                     ct.setId(id);
                     ct.setName(name);
                     ct.setDescription(description);
                     ct.setLongitude(longitude);
                     ct.setLatitude(latitude);                     
                 }
            } catch (SQLException ex) {
            }
            return ct;
    }
    
}
