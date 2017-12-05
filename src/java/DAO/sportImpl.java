/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.sport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public class sportImpl implements Isport{

    @Override
    public boolean save(sport s) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into sports (name , description , icon) values ('" + s.getName() + "' , '" + s.getDescription() + "' , '"+s.getIcon()+"')");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public List<sport> sportsByName(String name) {
         Connection conn = SingletonConnection.getCon();
        sport s = null;
        ArrayList<sport> list = new ArrayList<sport>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from sports where name like '" + name + "%'");
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("name");
                String description = rs.getString("description");
                String icon = rs.getString("icon");
                s = new sport(id, icon, nom, description);
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<sport> allSports() {
         Connection conn = SingletonConnection.getCon();
        sport s = null;
        ArrayList<sport> list = new ArrayList<sport>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from sports");
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("name");
                String description = rs.getString("description");
                String icon = rs.getString("icon");
                s = new sport(id, icon, nom, description);
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
            r = st.executeUpdate("delete from sports where id = " + id + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public boolean update(int id, sport s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
