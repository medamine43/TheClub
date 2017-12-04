/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.service;

/**
 *
 * @author ALCRDATE
 */
public class Test {
    public static void main(String[] args) {
        service serv = new service(2, 1, "city club2", "/img/club.jpg", "The best club ever exist");
        serviceImpl si = new serviceImpl();
        boolean r = si.save(serv);
        System.out.println("R = " + r);
    }
    
}
