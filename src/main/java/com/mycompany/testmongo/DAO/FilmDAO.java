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
import controller.Tools;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Film;
import model.Video;

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
                Date d=new Tools().formatStringToDate(objet.get("datesortie").toString());
               // Date d=formatter.parse(objet.get("datesortie").toString());
  
                film=new Film(objet.get("id").toString(),objet.get("titre").toString(),objet.get("description").toString()
                ,objet.get("image").toString(),d,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),"new",objet.get("duration").toString());    
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
                ,objet.get("image").toString(),d,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),"new",objet.get("duration").toString());
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
             BasicDBObject order = new BasicDBObject ("datesortie", -1);
            DBCursor cursors= acteurs.find(orderBy).sort(order);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
               /* System.out.println(objet.get("id").toString());
                    System.out.println(objet.get("titre").toString());
                               System.out.println(objet.get("description").toString());
                                    System.out.println(objet.get("image").toString());
                                   System.out.println(objet.get("datesortie").toString());
                                   System.out.println(objet.get("idcat").toString());
                                     //System.out.println(objet.get("duration").toString());*/
                Date c=new Tools().formatStringToDate(objet.get("datesortie").toString());
                
               film=new Film(objet.get("id").toString(),objet.get("titre").toString(),objet.get("description").toString(),
               objet.get("image").toString(),c,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),"new",objet.get("duration").toString());
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
    public ArrayList<Film> getTopfilm(int limit)throws Exception 
    {
        Film film=new Film();
        try
        {
            ArrayList<Film> listes=new ArrayList<Film>();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("film");
            BasicDBObject orderBy = new BasicDBObject ("datesortie", -1);
            DBCursor cursors= acteurs.find().sort(orderBy).limit(limit);
            Tools tool=new Tools();
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date c=tool.formatStringToDate(objet.get("datesortie").toString());
               // Date d=formatter.parse(objet.get("datesortie").toString());
                film=new Film(objet.get("id").toString(),objet.get("titre").toString(),objet.get("description").toString(),
               objet.get("image").toString(),c,Double.parseDouble(objet.get("prix").toString()),objet.get("idcat").toString(),"new",objet.get("duration").toString());
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
    public Video getByIdfilm(String id)throws Exception
    {
        Video video=new Video();
         try
        {
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("video");
            BasicDBObject query = new BasicDBObject ("idfilm", id);
            DBCursor cursors= acteurs.find(query);
            while (cursors.hasNext ())
            {
                /*
                 private String id;
    private String nom;
     private String idfilm;
                */
                DBObject objet=cursors.next ();  
               /* SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date d=(Date)objet.get("datesortie");*/
               // Date d=formatter.parse(objet.get("datesortie").toString());7
               video=new Video(objet.get("id").toString(),objet.get("nom").toString(),objet.get("idfilm").toString());
               
            }
            cursors.close ();
            return video;
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
            throw ex;
        }

    }
            
    
}
