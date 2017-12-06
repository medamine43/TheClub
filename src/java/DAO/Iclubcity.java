/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.clubcity;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface Iclubcity {
    public boolean save(clubcity c);
    public List<clubcity> clubcity();
    public boolean delete(int key);
    public clubcity clubcityByKey(int key);
}
