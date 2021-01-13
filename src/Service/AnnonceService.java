/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Annonce;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Packard Bell
 */
public class AnnonceService {

    public int save(String nom, String id, String taille, String secteur, String poste, String formation, double experience, String ville, double ageMax, List<Annonce> annonces) {
        Annonce a = findById(id, annonces);
        if (a != null) {
            return -1;
        } else {
            Annonce nva = new Annonce(nom, id, taille, secteur, poste, formation, experience, ville, ageMax);
            annonces.add(nva);
            return 1;
        }
    }

    public Annonce findById(String id, List<Annonce> annonces) {
        for (int i = 0; i < annonces.size(); i++) {
            Annonce a = annonces.get(i);
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public List<Annonce> findByFormation(String formation, List<Annonce> annonces) {
        List<Annonce> res = new ArrayList<>();
        for (int i = 0; i < annonces.size(); i++) {
            Annonce a = annonces.get(i);
            if (a.getFormation().equals(formation)) {
                res.add(a);
            }
        }
        return res;
    }

    public List<Annonce> findByPoste(String poste, List<Annonce> annonces) {
        List<Annonce> res = new ArrayList<>();
        for (int i = 0; i < annonces.size(); i++) {
            Annonce a = annonces.get(i);
            if (a.getPoste().equals(poste)) {
                res.add(a);
            }
        }
        return res;
    }

    public int findByIndex(String id, List<Annonce> annonces) {
        for (int i = 0; i < annonces.size(); i++) {
            Annonce a = annonces.get(i);
            if (a.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public int delete(String id, List<Annonce> annonces) {
        int res = findByIndex(id, annonces);
        if (res >= 0) {
            annonces.remove(res);
            return 1;
        } else {
            return -1;
        }

    }
}
