/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TOHX
 */
public class Video {
    private String id;
    private String nom;
     private String idfilm;

    public Video(String id, String nom, String idfilm) {
        setId(id);
        setNom(nom);
        setIdfilm(idfilm);
    }

    public Video() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdfilm() {
        return idfilm;
    }

    public void setIdfilm(String idfilm) {
        this.idfilm = idfilm;
    }
     
    
}
