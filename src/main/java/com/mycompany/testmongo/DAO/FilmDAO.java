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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Film;

/**
 *
 * @author TOHX
 */
public class FilmDAO {
    public Film findById(String id)throws Exception
    {
        Film film=new Film();
        try
        {
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("film");
            BasicDBObject query = new BasicDBObject ("id", id);
            DBCursor cursors= acteurs.find(query);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date d=formatter.parse(objet.get("datesortie").toString());
                film=new Film(objet.get("id").toString(),objet.get("titre").toString(),objet.get("description").toString()
                ,objet.get("image").toString(),d,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),objet.get("remarque").toString());    
            }
            cursors.close ();
            return film;
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
            throw ex;
        }
       
    }
    public ArrayList<Film> listFilm()throws Exception
    {
        Film film=new Film();
        try
        {
            ArrayList<Film> listes=new ArrayList<Film>();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("film");
            BasicDBObject orderBy = new BasicDBObject ("id", -1);
            DBCursor cursors= acteurs.find().sort(orderBy);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date d=formatter.parse(objet.get("datesortie").toString());
                film=new Film(objet.get("id").toString(),objet.get("titre").toString(),objet.get("description").toString()
                ,objet.get("image").toString(),d,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),objet.get("remarque").toString());
                listes.add(film);
                
            }
            cursors.close ();
            return listes;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    
    }
    public ArrayList<Film> findByIdCat(String idcat)throws Exception
    {
        Film film=new Film();
        try
        {
            ArrayList<Film> listes=new ArrayList<Film>();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("film");
            BasicDBObject orderBy = new BasicDBObject ("idcat", idcat);
            DBCursor cursors= acteurs.find(orderBy);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date d=formatter.parse(objet.get("datesortie").toString());
                film=new Film(objet.get("id").toString(),objet.get("titre").toString(),objet.get("description").toString()
                ,objet.get("image").toString(),d,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),objet.get("remarque").toString());
                listes.add(film);
                
            }
            cursors.close ();
            return listes;
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
            throw ex;
        }
    }
            
    
}
