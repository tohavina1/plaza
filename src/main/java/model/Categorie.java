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
public class Categorie {
    private String id;
    private String type;
    private int nombre;
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public Categorie() {
    }
    
    public Categorie(String id, String type) {
        setId(id);
        setType(type);
    }
 public Categorie(String id, String type,int nombre) {
        setId(id);
        setType(type);
        setNombre(nombre);
    }
    public Categorie(String type) {
        setType(type);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
