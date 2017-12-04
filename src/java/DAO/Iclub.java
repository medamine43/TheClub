/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.club;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface Iclub {
    public boolean save(club c);
    public List<club> clubsByName(String key);
    public List<club> clubs();
    public boolean delete(int key);
    public club clubByKey(int key);
}
