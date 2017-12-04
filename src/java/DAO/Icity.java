/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.city;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface Icity {
    public boolean save(city c);
    public List<city> citiesByName(String key);
    public List<city> cities();
    public boolean delete(int key);
    public city cityByKey(int key);
}
