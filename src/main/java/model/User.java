/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 * -id
        -pseudo
        -password
        -email
        -jeton
        -isadmin
        -isactif
        -remarque
        -datedebut
        -datefin
 * @author TOHX
 */
public class User {
    private String id;
    private String pseudo;
    private String password;
    private String email;
    private double jeton;
    private int isadmin;
    private int isactif;
    private String remarque;
    private Date datedebut;
    private Date datefin;
    private String idabonne;
    public User()
    {
    
    }
    public User(String pseudo, String password, String email, double jeton, String remarque,String abonne) {
        setPseudo(pseudo);
        setPassword (password);
        setEmail (email);
        setJeton (jeton) ;
        setRemarque (remarque) ;
    }

    public User(String id, String pseudo, String password, String email, double jeton, int isadmin, int isactif, String remarque, Date datedebut, Date datefin) {
        setId(id) ;
        setPseudo(pseudo);
        setPassword (password);
        setEmail (email);
        setJeton (jeton) ;
        setIsadmin(isadmin) ;
        setIsactif(isactif) ;
        setRemarque(remarque) ;
        setDatedebut(datedebut) ;
        setDatefin(datefin) ;
    }

    public User(String pseudo, String password, String email, double jeton, int isadmin, int isactif, String remarque, Date datedebut, Date datefin,String idabonne) {
        setPseudo(pseudo);
        setPassword (password);
        setEmail (email);
        setJeton (jeton) ;
        setIsadmin(isadmin) ;
        setIsactif(isactif) ;
        setRemarque(remarque) ;
        setDatedebut(datedebut) ;
        setDatefin(datefin) ;
        setIdabonne(idabonne);
    }

    public String getIdabonne() {
        return idabonne;
    }

    public void setIdabonne(String idabonne) {
        this.idabonne = idabonne;
    }

    public int getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(int isadmin) {
        this.isadmin = isadmin;
    }

    public int getIsactif() {
        return isactif;
    }

    public void setIsactif(int isactif) {
        this.isactif = isactif;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public User(String id, String pseudo, String password, String email, double jeton, String remarque,String abonne) {
        setId(id) ;
        setPseudo(pseudo);
        setPassword (password);
        setEmail (email);
        setJeton (jeton) ;
        setRemarque (remarque) ;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getJeton() {
        return jeton;
    }

    public void setJeton(double jeton) {
        this.jeton = jeton;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }
    
    
}
