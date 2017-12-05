/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.usersubscription;
import java.util.List;

/**
 *
 * @author ALCRDATE
 */
public interface Iusersubscription {
    public boolean save(usersubscription s);
    public List<usersubscription> usersubscriptionById(int id);
    public List<usersubscription> allUsersubscription();
    public boolean delete(int id);
    public boolean update(int id , usersubscription s);
}
