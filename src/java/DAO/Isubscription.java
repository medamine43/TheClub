/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.subscription;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public interface Isubscription {
    public boolean save(subscription s);
    public List<subscription> subscriptionsByName(String name);
    public List<subscription> allSubscriptions();
    public boolean delete(int id);
    public boolean update(int id , subscription s);
}
