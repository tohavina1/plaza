/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo.DAO;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mycompany.testmongo.MongoConnect;
import java.util.ArrayList;
import model.Categorie;
import model.User;

/**
 *
 * @author TOHX
 */
public class CategorieDAO {
    public ArrayList<Categorie> findAll()throws Exception 
    {
       ArrayList<Categorie> listes=new ArrayList<Categorie>();
       MongoConnect con=new MongoConnect(); 
       Categorie temp=new Categorie();
       try
       {
           DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("categorie");
             DBCollection film = data.getCollection("film");
            DBCursor cursors= acteurs.find();
            
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();
                BasicDBObject curs=new BasicDBObject("idcat",objet.get("id").toString());
            
                int nombre=(int)film.count(curs);
                temp=new Categorie(objet.get("id").toString(),objet.get("type").toString(),nombre);
                listes.add(temp);
            }
            cursors.close ();
       return listes;
       }
       catch(Exception ex)
       {
           throw ex;
       }
            
       
    }
    public Categorie findById(String id)throws Exception
    {
        Categorie cat=new Categorie();
        MongoConnect con=new MongoConnect(); 
        try
       {
            DB data=con.getConnection();
            DBCollection categorie = data.getCollection("categorie");
            BasicDBObject query = new BasicDBObject ("id", id);
             DBCollection film = data.getCollection("film");
            DBCursor cursors= categorie.find(query);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();
                BasicDBObject curs=new BasicDBObject("idcat",objet.get("id").toString());
                int nombre=(int)film.count(curs);
                cat=new Categorie(objet.get("id").toString(),objet.get("type").toString(),nombre);   
            }
            cursors.close ();
        return cat;
       }
       catch(Exception ex)
       {
           throw ex;
       }
       
    }
    
}
