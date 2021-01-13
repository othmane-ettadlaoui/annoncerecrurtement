/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Packard Bell
 */
public class Utilisateur {
     private String nom;
    private String login;
    private String password;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String login, String password) {
        this.nom = nom;
        this.login = login;
        this.password = password;
    }

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

   
    

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "login=" + login + ", password=" + password + ", nom=" + nom + '}';
    }


    
    
}
