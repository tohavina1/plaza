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
import java.util.Date;
import model.Film;
import model.Image;

/**
 *
 * @author TOHX
 */
public class ImageDAO {
    public Image findById(String id)throws Exception
    {
        try
        {
            Image img=new Image();
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection acteurs = data.getCollection("image");
            BasicDBObject query = new BasicDBObject ("id", id);
            DBCursor cursors= acteurs.find(query);
            while (cursors.hasNext ())
            {
                DBObject objet=cursors.next ();  
                img=new Image(objet.get("id").toString(),objet.get("image1").toString(),objet.get("image2").toString());  
            }
            cursors.close ();
            return img;
        }
        catch(Exception ex)
        {
            throw ex;
        }   
    }
}
