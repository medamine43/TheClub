/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.sport;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public interface Isport {
    public boolean save(sport s);
    public List<sport> sportsByName(String name);
    public List<sport> allSports();
    public boolean delete(int id);
    public boolean update(int id , sport s);
}
