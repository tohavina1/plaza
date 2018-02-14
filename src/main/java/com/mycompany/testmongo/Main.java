/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo;

import com.mycompany.testmongo.DAO.FilmDAO;
import controller.UserControl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author TOHX
 */
public class Main {
     public static void main(String[] args) throws Exception {
         UserControl control=new UserControl();
       /*  UserControl control=new UserControl();
         UserDAO dao=new UserDAO();*/
         // vérifie si un pseudo existe
     /*   int test=control.userExist("kaka");
        System.out.println("ON A "+test);*/
        
        // vérifie si le mdp existe pour un pseudo
       int test1=control.passwordExist("admin", "123");
           System.out.println("ON A "+test1);
           
          // status user connecte
         /* String test2[]=control.statusUser("admin","123");
           System.out.println("status "+test2[0]+test2[1]); */
        //  JSONObject obj = new JSONObject();
        
        // FilmDAO 
        FilmDAO daof=new FilmDAO();
        daof.findById("FLM0002");
      /*  daof.findById("FLM0001");*/
        // find()
       /* CategorieDAO daoc=new CategorieDAO();
       /* ArrayList<Categorie> listes=daoc.findAll();
        for(Categorie c : listes)
        {
            System.out.println(c.getId()+c.getType());
        }*/
       
   /* ArrayList<Film> lis=daof.listFilm();
        for(Film f : lis)
        {
            System.out.println(f.getId()+f.getTitre());
        }
        */
      //  ArrayList<Film> lis=daof.findByIdCat("CAT0002");
      /*  for(Film f : lis)
        {
            System.out.println(f.getDatesortie());
        }*/
       /* Date d=new Date(2018,02,12);
        Tools tool=new Tools();
        System.out.println(d.getDate());
          System.out.println(d.getMonth());
             System.out.println(d.getYear());
              System.out.println(d.toString());
        Date c=tool.repairDate(d);
        System.out.println(c.toString());*/
     /*  UserDAO daoU=new UserDAO();
       
       User user=new User("USR0002","test","123","gg@gmail.com",2,0,0,"test",new Date(2018,02,12),new Date(2018,02,13));
       
        daoU.insert(user);
        FilmDAO dd=new FilmDAO();
        Video vv=dd.getByIdfilm("FLM0001");
        System.err.println(vv.getNom());*/
     String s="2018-01-12";
     String[]ss=s.split("-");
     System.out.println(ss[0]);
      System.out.println(ss[1]);
       System.out.println(ss[2]);
       Date date=new Date(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]),Integer.parseInt(ss[2]));
   System.out.println(date.toString());
    String dt = "2008-01-01";  // Start date
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.add(Calendar.DATE, 1);
    Date ds=c.getTime();// number of days to add
    dt = sdf.format(ds); 
    
    System.out.println(ds.getYear());
    }
    
}
