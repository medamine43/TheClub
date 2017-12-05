/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.user;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public interface Iuser {
    public List<user> allUsers();
    public List<user> usersById(int id);
    public boolean save(user u);
    public boolean delete(int id);
    public boolean update(int id, user u);
}
