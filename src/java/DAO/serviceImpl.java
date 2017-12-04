/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.service;
import java.sql.Connection;
import java.sql.Statement;

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
    
}
