/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.service;
import Metier.usersubscription;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public class usersubscriptionImpl implements Iusersubscription{

    @Override
    public boolean save(usersubscription s) {
        Connection conn = SingletonConnection.getCon();
        int r = 0;
        try {
            Statement st = conn.createStatement();
            r = st.executeUpdate("insert into usersubscriptions (user_id , subscription_id) values( " + s.getUser_id() + " , " + s.getSusbcription() + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public List<usersubscription> usersubscriptionById(int id) {
        Connection conn = SingletonConnection.getCon();
        usersubscription s = null;
        ArrayList<usersubscription> list = new ArrayList<usersubscription>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from usersubscriptions where id = " + id + "");
            while(rs.next()){
                int ids = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                int subscription_id = rs.getInt("subscription_id");
                s = new  usersubscription(ids, user_id, subscription_id);
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<usersubscription> allUsersubscription() {
         Connection conn = SingletonConnection.getCon();
        usersubscription s = null;
        ArrayList<usersubscription> list = new ArrayList<usersubscription>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from usersubscriptions");
            while(rs.next()){
                int id = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                int subscription_id = rs.getInt("subscription_id");
                s = new  usersubscription(id, user_id, subscription_id);
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
            r = st.executeUpdate("delete from usersubscriptions where id = " + id + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(r != 0){return true;}else{return false;}
    }

    @Override
    public boolean update(int id, usersubscription s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
