/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo.DAO;
import com.mongodb.*;
import com.mycompany.testmongo.*;
import controller.Tools;
import java.util.Date;
import model.User;

/**
 *
 * @author TOHX
 */
public class UserDAO {
    public User findByPseudo(String pseudo)throws Exception
    {
        try
        {
            User user=new User();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("users");
            BasicDBObject query = new BasicDBObject ("pseudo", pseudo);
            Tools  tool =new Tools();
            DBCursor cursors= acteurs.find(query);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                System.out.println(objet.get("pseudo"));
                System.out.println(objet.get("password"));
                System.out.println(objet.get("isadmin"));
                System.out.println(objet.get("isactif"));
                Date debut=tool.formatStringToDate(objet.get("datedebut").toString());
                Date fin=tool.formatStringToDate(objet.get("datefin").toString());
                /* public User(String id, String pseudo, String password, String email, double jeton, int isadmin, int isactif, String remarque, Date datedebut, Date datefin)*/
                user=new User(objet.get("id").toString(),objet.get("pseudo").toString(),objet.get("password").toString(),objet.get("email").toString(),Double.parseDouble(objet.get("jeton").toString()),Integer.parseInt(objet.get("isadmin").toString()),Integer.parseInt(objet.get("actif").toString()),objet.get("remarque").toString(),debut,fin);  
            }
            cursors.close ();
            return user;
           
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
            throw ex;
        }
      
    }
    public void insert(User user)throws Exception
    {
        try
        { 
            Tools tool=new Tools();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection table = data.getCollection("users");
            BasicDBObject document = new BasicDBObject();
            document.put("id", user.getId());
            document.put("pseudo", user.getPseudo());
            document.put("email", user.getEmail());
            document.put("jeton", user.getJeton());
            document.put("isadmin", user.getIsadmin());
            document.put("isactif", user.getIsactif());
            document.put("remarque", user.getRemarque());
            document.put("datedebut",tool.formatDateToString(user.getDatedebut())  );
            document.put("datefin",tool.formatDateToString(user.getDatefin()) );
           
            table.insert(document);
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    public int countUsers()throws Exception
    {
             try
        {
            User user=new User();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("users");
            Tools  tool =new Tools();
            int cursors= acteurs.find().count();
            return cursors;
           
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
            throw ex;
        }
    }
}
