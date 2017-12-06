/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.promotion;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface Ipromotion {
    public boolean save(promotion p);
    public List<promotion> promotionByName(String key);
    public List<promotion> promotions();
    public boolean delete(int key);
    public promotion promotionByKey(int key);
}
