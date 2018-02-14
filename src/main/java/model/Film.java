package model;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOHX
 */
public class Film {
   private String id;
   private String titre;
   private String description;
   private String image;
   private Date datesortie;
   private double prix;
   private String idcat;
   private String remarque;
   private String duration;

 
   public Film()
   {
       
   }
      public Film(String id, String titre, String description, String image, Date datesortie, double prix, String idcat, String remarque, String duration) {
        setId(id);
        setTitre(titre);
        setDescription(description);
        setImage (image);
        setDatesortie (datesortie) ;
        setPrix (prix) ;
        setIdcat (idcat) ;
        setRemarque (remarque) ;
        setDuration(duration);
    }
    public Film(String id, String titre, String description, String image, Date datesortie, double prix, String idcat, String remarque) {
        setId(id);
        setTitre(titre);
        setDescription(description);
        setImage (image);
        setDatesortie (datesortie) ;
        setPrix (prix) ;
        setIdcat (idcat) ;
        setRemarque (remarque) ;
    }

    public Film(String titre, String description, String image, Date datesortie, double prix, String idcat, String remarque) {
        setTitre(titre);
        setDescription(description);
        setImage (image);
        setDatesortie (datesortie) ;
        setPrix (prix) ;
        setIdcat (idcat) ;
        setRemarque (remarque) ;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getIdcat() {
        return idcat;
    }

    public void setIdcat(String idcat) {
        this.idcat = idcat;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }
      public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
   
}
