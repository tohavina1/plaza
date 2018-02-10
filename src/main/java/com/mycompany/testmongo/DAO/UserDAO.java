/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo.DAO;
import com.mongodb.*;
import com.mycompany.testmongo.*;
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
            DBCursor cursors= acteurs.find(query);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();    
                user=new User(objet.get("id").toString(),objet.get("pseudo").toString(),objet.get("password").toString(),objet.get("email").toString(),Double.parseDouble(objet.get("jeton").toString()),objet.get("remarque").toString());  
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
}
