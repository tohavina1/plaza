/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo;

import com.mycompany.testmongo.DAO.CategorieDAO;
import com.mycompany.testmongo.DAO.FilmDAO;
import com.mycompany.testmongo.DAO.UserDAO;
import controller.UserControl;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author TOHX
 */
public class Main {
     public static void main(String[] args) throws Exception {
         UserControl control=new UserControl();
         UserDAO dao=new UserDAO();
         // vérifie si un pseudo existe
        int test=control.userExist("kaka");
        System.out.println("ON A "+test);
        
        // vérifie si le mdp existe pour un pseudo
        int test1=control.passwordExist("tohavina", "522");
           System.out.println("ON A "+test1);
           
           // status user connecte
           String test2[]=control.statusUser("555","fds");
           System.out.println("status "+test2[0]+test2[1]); 
        //  JSONObject obj = new JSONObject();
        
        // FilmDAO 
        FilmDAO daof=new FilmDAO();
        daof.findById("FLM0001");
        // find()
        CategorieDAO daoc=new CategorieDAO();
        ArrayList<Categorie> listes=daoc.findAll();
        for(Categorie c : listes)
        {
            System.out.println(c.getId()+c.getType());
        }
       
    ArrayList<Film> lis=daof.listFilm();
        for(Film f : lis)
        {
            System.out.println(f.getId()+f.getTitre());
        }
        
   
    }
    
}
