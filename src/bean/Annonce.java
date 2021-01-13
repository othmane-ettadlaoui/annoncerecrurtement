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
public class Annonce {
    private String nom;
    private String id;
    private String taille;
    private String secteur;
    private String poste;
    private String formation;
    private double experience;
    private String ville;
    private double ageMax;

    public Annonce() {
    }

    public Annonce(String nom, String id, String taille, String secteur, String poste, String formation, double experience, String ville, double ageMax) {
        this.nom = nom;
        this.id = id;
        this.taille = taille;
        this.secteur = secteur;
        this.poste = poste;
        this.formation = formation;
        this.experience = experience;
        this.ville = ville;
        this.ageMax = ageMax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(double ageMax) {
        this.ageMax = ageMax;
    }

    @Override
    public String toString() {
        return "Annonce{" + "nom=" + nom + ", id=" + id + ", taille=" + taille + ", secteur=" + secteur + ", poste=" + poste + ", formation=" + formation + ", experience=" + experience + ", ville=" + ville + ", ageMax=" + ageMax + '}';
    }
    
    
     
     
    
    
}
