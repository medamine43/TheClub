/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.club;
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
public class clubImpl implements Iclub{
    Connection conn = SingletonConnection.getCon();

    @Override
    public boolean save(club c) {
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into clubs values('"+c.getName()+"','"+c.getDescription()+"','"+c.getLogo()+"','"+c.getCover()+"','"
                    +c.getAddress()+"',"+c.getPhone()+",'"+c.getEmail()+"','"+c.getFacebook()+"',"+c.getGender()+","+c.getLongitude()+","+c.getLatitude()+")");
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
    public List<club> clubsByName(String key) {
         List<club> ls = new ArrayList<club>();
         club cl = new club();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from clubs where name ='"+key+"'");
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     String logo = r.getString("logo");
                     String cover = r.getString("cover");
                     String address = r.getString("address");
                     int phone = r.getInt("phone");
                     String email = r.getString("email");
                     String facebook = r.getString("facebook");
                     int gender = r.getInt("gender");
                     double longitude = r.getDouble("longitude");
                     double latitude = r.getDouble("latitude");
                     cl.setId(id);
                     cl.setName(name);
                     cl.setDescription(description);
                     cl.setLogo(logo);
                     cl.setCover(cover);
                     cl.setAddress(address);
                     cl.setPhone(phone);
                     cl.setEmail(email);
                     cl.setFacebook(facebook);
                     cl.setGender(gender);
                     cl.setLongitude(longitude);
                     cl.setLatitude(latitude);
                     ls.add(cl);
                 }
            } catch (SQLException ex) {
            }
            return ls;
    }

    @Override
    public List<club> clubs() {
        List<club> ls = new ArrayList<club>();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select * from clubs");
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     String logo = r.getString("logo");
                     String cover = r.getString("cover");
                     String address = r.getString("address");
                     int phone = r.getInt("phone");
                     String email = r.getString("email");
                     String facebook = r.getString("facebook");
                     int gender = r.getInt("gender");
                     double longitude = r.getDouble("longitude");
                     double latitude = r.getDouble("latitude");
                     club cl = new club();
                     cl.setId(id);
                     cl.setName(name);
                     cl.setDescription(description);
                     cl.setLogo(logo);
                     cl.setCover(cover);
                     cl.setAddress(address);
                     cl.setPhone(phone);
                     cl.setEmail(email);
                     cl.setFacebook(facebook);
                     cl.setGender(gender);
                     cl.setLongitude(longitude);
                     cl.setLatitude(latitude);
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
            r = st.executeUpdate("delete from clubs where id="+key);
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
    public club clubByKey(int key) {
        club cl = new club();
            try {
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery("select top 1 * from clubs where id ="+key);
                 while(r.next()){
                     int id = r.getInt("id");
                     String name = r.getString("name");
                     String description = r.getString("description");
                     String logo = r.getString("logo");
                     String cover = r.getString("cover");
                     String address = r.getString("address");
                     int phone = r.getInt("phone");
                     String email = r.getString("email");
                     String facebook = r.getString("facebook");
                     int gender = r.getInt("gender");
                     double longitude = r.getDouble("longitude");
                     double latitude = r.getDouble("latitude");
                     cl.setId(id);
                     cl.setName(name);
                     cl.setDescription(description);
                     cl.setLogo(logo);
                     cl.setCover(cover);
                     cl.setAddress(address);
                     cl.setPhone(phone);
                     cl.setEmail(email);
                     cl.setFacebook(facebook);
                     cl.setGender(gender);
                     cl.setLongitude(longitude);
                     cl.setLatitude(latitude);
                 }
            } catch (SQLException ex) {
            }
            return cl;
    }
    
}
