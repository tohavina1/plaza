/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo.DAO;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mycompany.testmongo.MongoConnect;
import model.Abonnement;

/**
 *
 * @author TOHX
 */
public class AbonnementDAO {
    public void save(Abonnement abonne)throws Exception 
    {
        try
        {
            MongoConnect con=new MongoConnect(); 
            DB data=con.getConnection();
            DBCollection table = data.getCollection("abonnement");
            BasicDBObject document = new BasicDBObject();
            document.put("id", abonne.getId());
            document.put("iduser", abonne.getIduser());
            document.put("idfilm", abonne.getIdfilm());
            table.insert(document);
        }
        catch(Exception ex)
        {
            throw ex;
        }
   
    }
}
