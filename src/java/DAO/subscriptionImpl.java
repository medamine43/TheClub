/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.subscription;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public class subscriptionImpl implements Isubscription{

    @Override
    public boolean save(subscription s) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into subscriptions (name , description, price , duration ,club_id) values('" + s.getName() + "' , '" + s.getDescription() + "', " + s.getPrice()+ " , " + s.getDuration()+ " , " + s.getClub_id() + " )");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public List<subscription> subscriptionsByName(String name) {
        Connection conn = SingletonConnection.getCon();
        subscription s = null;
        ArrayList<subscription> list = new ArrayList<subscription>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from subscriptions where name like '" + name + "%'");
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("name");
                String description = rs.getString("description");
                int duration = rs.getInt("duration");
                double price = rs.getDouble("price");
                int club_id = rs.getInt("club_id");
                s = new subscription(id, duration, club_id, price, nom , description);
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<subscription> allSubscriptions() {
        Connection conn = SingletonConnection.getCon();
        subscription s = null;
        ArrayList<subscription> list = new ArrayList<subscription>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from subscriptions");
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("name");
                String description = rs.getString("description");
                int duration = rs.getInt("duration");
                double price = rs.getDouble("price");
                int club_id = rs.getInt("club_id");
                s = new subscription(id, duration, club_id, price, nom , description);
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
   

    @Override
    public boolean delete(int id) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("delete from subscriptions where id = " + id + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public boolean update(int id, subscription s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
