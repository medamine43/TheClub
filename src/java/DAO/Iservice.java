/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.service;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public interface Iservice {
    public boolean save(service s);
    public List<service> sericesByName(String name);
    public List<service> allServices();
    public boolean delete(int id);
    public boolean update(int id , service s);
}
