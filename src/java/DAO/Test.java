/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.service;
import Metier.sport;
import Metier.subscription;
import Metier.user;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author ALCRDATE
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        //service serv = new service(2, 1, "city rabat", "/img/club.jpg", "The best rabat");
        serviceImpl si = new serviceImpl();
        //boolean r = si.save(serv);
        //System.out.println("R = " + r);
//        ArrayList<service> l = new ArrayList<service>();
//        l = (ArrayList<service>) si.allServices();
//        for(service s : l){
//            System.out.println("Id = " + s.getId() + " Name = " + s.getName()); 
//        }
//        System.out.println("Delete service numero 4");
//        System.out.println(si.delete(4));
        Date d = new Date(2010, 10, 2);
        System.out.println("Date = " + d);
        userImpl user = new userImpl();
        ArrayList<user> l = new ArrayList<user>();
        l = (ArrayList<user>) user.allUsers();
//        user u  = new user(3, 0663044354, 2, 1, "Mohamed", "lhsaini", "bb18848", "auil@gmail.com", "admin123", "adress test 1", d);
//        user.save(u);
//        user.delete(6);
//        for(user us : l){
//            System.out.println("Username = " + us.getFirstName() + " with birth of date = " + us.getDateOfBirth() + " and ID = " + us.getId());
//        }
        System.out.println("=======================\nTest table sports : ");
        sportImpl sp = new sportImpl();
        sport s = new sport(0, "icon.jpg", "football", "Best sport ever");
        //sp.save(s);
        ArrayList<sport> ls = new ArrayList<sport>();
        ls = (ArrayList<sport>) sp.allSports();
        for(sport spo : ls){
            System.out.println("Sport id = " + spo.getId() + " with name = " + spo.getName());
        }
        
        System.out.println("=======================\nTest table sunsscriptions : ");
        subscriptionImpl sub = new subscriptionImpl();
        subscription subs = new subscription(0, 20, 1, 2000, "Subs22", "subs1 description");
        sub.save(subs);
        ArrayList<subscription> lsub = new ArrayList<subscription>();
        lsub = (ArrayList<subscription>) sub.subscriptionsByName("su");
        for(subscription subss : lsub){
            System.out.println("subscription id = " + subss.getId() + " with name = " + subss.getName());
        
    }
    
    }
}
