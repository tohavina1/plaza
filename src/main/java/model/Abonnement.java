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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOHX
 */
public class Abonnement {
    private String id;
    private String iduser;
    private String idfilm;

    public Abonnement(String id, String iduser, String idfilm) {
        setId (id) ;
        setIduser(iduser)  ;
        setIdfilm(idfilm);
    }

    public Abonnement(String iduser, String idfilm) {
        setIduser(iduser)  ;
        setIdfilm(idfilm);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIdfilm() {
        return idfilm;
    }

    public void setIdfilm(String idfilm) {
        this.idfilm = idfilm;
    }
    
    
}

