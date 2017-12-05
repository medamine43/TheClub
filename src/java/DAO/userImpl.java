/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public class userImpl implements Iuser{

    @Override
    public List<user> allUsers() {
        Connection conn = SingletonConnection.getCon();
        ArrayList<user> list = new ArrayList<user>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from users");
            while(rs.next()){
                user u = new user();
                u.setId(rs.getInt("id"));
                u.setFirstName(rs.getString("firstName"));
                u.setSecondName(rs.getString("secondName"));
                u.setAdress(rs.getString("address"));
                u.setEmail(rs.getString("email"));
                u.setDateOfBirth(rs.getDate("dateOfBirth"));
                u.setPassword(rs.getString("password"));
                u.setCity_id(rs.getInt("city_id"));
                u.setGender(rs.getInt("gender"));
                u.setTelephone(rs.getInt("telephone"));
                u.setCin(rs.getString("cin"));
                list.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<user> usersById(int id) {
        Connection conn = SingletonConnection.getCon();
        ArrayList<user> list = new ArrayList<user>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from users where id = " + id + "");
            while(rs.next()){
                user u = new user();
                u.setId(rs.getInt("id"));
                u.setFirstName(rs.getString("firstName"));
                u.setSecondName(rs.getString("secondName"));
                u.setAdress(rs.getString("address"));
                u.setEmail(rs.getString("email"));
                u.setDateOfBirth(rs.getDate("dateOfBirth"));
                u.setPassword(rs.getString("password"));
                u.setCity_id(rs.getInt("city_id"));
                u.setGender(rs.getInt("gender"));
                u.setTelephone(rs.getInt("telephone"));
                u.setCin(rs.getString("cin"));
                list.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean save(user u) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into users (firstName , secondName , dateOfBirth , gender , telephone , email , password , cin , address, city_id) values ('"+ u.getFirstName() +"' , '"+u.getSecondName()+"', '"+u.getDateOfBirth()+"' , "+u.getGender()+" , "+u.getTelephone()+" , '"+u.getEmail()+"' , '"+u.getPassword()+"' , '"+u.getCin()+"' , '"+u.getAdress()+"' , "+u.getCity_id()+")");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public boolean delete(int id) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("delete from users where id = " + id + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public boolean update(int id, user u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
