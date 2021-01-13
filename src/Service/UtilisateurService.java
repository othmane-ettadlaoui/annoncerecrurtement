/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Utilisateur;
import java.util.ArrayList;

/**
 *
 * @author Packard Bell
 */
public class UtilisateurService {

    public int creerCompte(String nom, String login, String password, ArrayList<Utilisateur> utilisateurs) {
        Utilisateur res = findByLogin(login, utilisateurs);
        if (res != null) {
            return -1;
        } else {
            Utilisateur c = new Utilisateur(nom, login, password);
            utilisateurs.add(c);
            return 1;
        }
    }

    public int seConnecter(String login, String password, ArrayList<Utilisateur> utilisateurs) {
        Utilisateur res = findByLogin(login, utilisateurs);
        if (res == null) {
            return -1;
        } else if (!res.getPassword().equals(password)) {
            return -2;
        } else if (res.getPassword().equals(password)) {
            return 1;
        }
        return 0;

    }

    public Utilisateur findByLogin(String login, ArrayList<Utilisateur> utilisateurs) {
        for (int i = 0; i < utilisateurs.size(); i++) {
            Utilisateur c = utilisateurs.get(i);
            if (c.getLogin().equals(login)) {
                return c;
            }

        }
        return null;

    }

}
