/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public class serviceImpl implements Iservice{

    public serviceImpl() {
    }

    @Override
    public boolean save(service s) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into services (name , description, icon , club_id) values('" + s.getName() + "' , '" + s.getDescription() + "', '" + s.getIcon() + "' , " + s.getClub_id() + " )");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public List<service> sericesByName(String name) {
        Connection conn = SingletonConnection.getCon();
        service s = null;
        ArrayList<service> list = new ArrayList<service>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from services where name like '" + name + "%' ");
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("name");
                String description = rs.getString("description");
                String icon = rs.getString("icon");
                int club_id = rs.getInt("club_id");
                s = new service(id, club_id, nom, icon, description);
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<service> allServices() {
        Connection conn = SingletonConnection.getCon();
        service s = null;
        ArrayList<service> list = new ArrayList<service>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from services");
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("name");
                String description = rs.getString("description");
                String icon = rs.getString("icon");
                int club_id = rs.getInt("club_id");
                s = new service(id, club_id, nom, icon, description);
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
            r = st.executeUpdate("delete from services where id = " + id + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public boolean update(int id, service s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
