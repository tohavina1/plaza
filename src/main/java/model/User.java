/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *-id
        -pseudo
        -mdp
        -email
        -jeton
        -remarque
 * @author TOHX
 */
public class User {
    private String id;
    private String pseudo;
    private String password;
    private String email;
    private double jeton;
    private String remarque;
    public User()
    {
    
    }
    public User(String pseudo, String password, String email, double jeton, String remarque) {
        setPseudo(pseudo);
        setPassword (password);
        setEmail (email);
        setJeton (jeton) ;
        setRemarque (remarque) ;
    }

    public User(String id, String pseudo, String password, String email, double jeton, String remarque) {
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
