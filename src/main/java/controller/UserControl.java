/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mongodb.*;
import com.mycompany.testmongo.DAO.UserDAO;
import com.mycompany.testmongo.MongoConnect;

/**
 *
 * @author TOHX
 */
public class UserControl {
    public int userExist(String pseudo)throws Exception
    {   try
        {
            MongoConnect connect=new MongoConnect();
            DB database=connect.getConnection();
            DBCollection acteurs = database.getCollection("users");
            BasicDBObject query = new BasicDBObject ("pseudo",pseudo);
            int test = acteurs.find (query).count();
            if(test!=0)
            {
                return 1;
            }
            else
            {
                 return 0; 
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw ex;
        }
     
    }
    public int passwordExist(String pseudo,String mdp)throws Exception
    {
        try
        {
            MongoConnect connect=new MongoConnect();
            DB database=connect.getConnection();
            DBCollection acteurs = database.getCollection("users");
            DBObject clause1 = new BasicDBObject("pseudo", pseudo);
            DBObject clause2 = new BasicDBObject("password", mdp);
            BasicDBList and = new BasicDBList();
            and.add(clause1);
            and.add(clause2);
            DBObject query = new BasicDBObject("$and", and);
            int test = acteurs.find(query).count();
            if(test!=0)
            {
                return 1;
            }
            else
            {
                 return 0; 
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw ex;
        }
     
        
    }
    public String[] statusUser(String pseudo,String pass)throws Exception
    {
        try
        {
            String stat[]=new String[2];
            UserDAO dao=new UserDAO();
            String status="";
            int user=userExist(pseudo);
            int mdp=passwordExist(pseudo,pass);
            if(user!=0 && mdp==0)
            {
                stat[0]="0";
                stat[1]=dao.findByPseudo(pseudo).getId();         
            }
             if(user!=0 && mdp!=0)
            {
                stat[0]="1";
                stat[1]=dao.findByPseudo(pseudo).getId();
            }
            if(user==0 && mdp==0)
            {
                stat[0]="2";
                stat[1]="null";
            }        
            return stat;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw ex;
        }
       
    }
    public int emailExist(String iduser,String mail)
    {
         return 0;
    }
}
