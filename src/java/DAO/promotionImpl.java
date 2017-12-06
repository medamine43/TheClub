/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.promotion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class promotionImpl implements Ipromotion{
    Connection conn = SingletonConnection.getCon();

    @Override
    public boolean save(promotion p) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into promotions values('"+p.getName()+"','"+p.getDescription()+"',"+p.getPrice()+",'"+p.getDate_start()+"','"+p.getDate_end()+"',"
                    +p.getClub_id()+")");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if( r != 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public List<promotion> promotionByName(String key) {
        List<promotion> ls = new ArrayList<>();
        promotion p = new promotion();
        try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select top 1 * from promotions where name = "+key);
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     double price = r.getDouble("price");
                     Date date_start = r.getDate("date_start");
                     Date date_end = r.getDate("date_end");
                     int club_id = r.getInt("club_id");
                     p.setId(id);
                     p.setName(name);
                     p.setDescription(description);
                     p.setPrice(price);
                     p.setDate_start(date_start);
                     p.setDate_end(date_end);
                     p.setClub_id(club_id);
                     ls.add(p);
                 }
            } catch (SQLException ex) {
            }
        return ls;
    }

    @Override
    public List<promotion> promotions() {
        List<promotion> ls = new ArrayList<>();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from promotions");
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     double price = r.getDouble("price");
                     Date date_start = r.getDate("date_start");
                     Date date_end = r.getDate("date_end");
                     int club_id = r.getInt("club_id");
                     promotion p = new promotion();
                     p.setId(id);
                     p.setName(name);
                     p.setDescription(description);
                     p.setPrice(price);
                     p.setDate_start(date_start);
                     p.setDate_end(date_end);
                     p.setClub_id(club_id);
                     ls.add(p);
                     
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
            r = st.executeUpdate("delete from promotions where id="+key);
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
    public promotion promotionByKey(int key) {
        promotion p = new promotion();
        try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select top 1 * from promotions where id = "+key);
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     double price = r.getDouble("price");
                     Date date_start = r.getDate("date_start");
                     Date date_end = r.getDate("date_end");
                     int club_id = r.getInt("club_id");
                     p.setId(id);
                     p.setName(name);
                     p.setDescription(description);
                     p.setPrice(price);
                     p.setDate_start(date_start);
                     p.setDate_end(date_end);
                     p.setClub_id(club_id);                     
                 }
            } catch (SQLException ex) {
            }
        return p;
    }
    
}
