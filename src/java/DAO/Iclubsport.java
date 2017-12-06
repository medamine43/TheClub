/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.clubsport;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface Iclubsport {
    public boolean save(clubsport c);
    public List<clubsport> clubsport();
    public boolean delete(int key);
    public clubsport clubsportyByKey(int key);
}
