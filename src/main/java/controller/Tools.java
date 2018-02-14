/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mycompany.testmongo.DAO.UserDAO;
import java.util.Date;

/**
 *
 * @author TOHX
 */
public class Tools   
{
    public Tools() throws Exception {
    }
    public String getHostVideo(String categorie,String nom)
    {
        return "http://plazachanel.000webhostapp.com/plaza/"+categorie+"/"+nom;
    }
    public String formatDateToString(Date dt) throws Exception {
        int j = dt.getDate();
        int m = dt.getMonth();
        int y = dt.getYear();
        String datestring = "" + y + "-" + m + "-" + j;
        System.out.println("io daty "+datestring);
        return datestring;
    }
    public Date formatStringToDate(String date)
    {
        String s="2018-01-12";
        String[]listes=date.split("-");
        return new Date(Integer.parseInt(listes[0]),Integer.parseInt(listes[1]),Integer.parseInt(listes[2]));
    }
    public float timerToSecond(String timer) throws Exception {
        String[] timme = timer.split(":");
        System.out.println("timer=" + timer);
        return (Float.parseFloat(timme[0].toString()) * 60) + Float.parseFloat(timme[1].toString());
    }
   public String getPredicat(String classe)throws Exception
   {
       try
       {
              if(classe=="User")
                {
                    return "USR000"+new UserDAO().countUsers();
                }        
                return "";
       }
       catch(Exception ex)
       {
           throw ex;
       }
    
   }
   /* public String getIdseq(String tabseq) throws Exception {
        SQLConnection con = new SQLConnection();
        String idseq = null;
        try
        {
           
            Connection sqlc = con.getconnexion();
            String querry = "select next value for " + tabseq + " as id";
            Statement cmd = sqlc.createStatement();
            ResultSet readdata = cmd.executeQuery(querry);
            while (readdata.next())
            {
                idseq = readdata.getString("id");
            }
            return idseq;
        }
        catch (Exception ex)
        {
            System.out.println("getIdErreur " + ex.getMessage());
        }
        finally
        {
            con.close();
        }
        return idseq;
    }*/
    public Date repairDate(Date d)
    {
        return new Date(d.getYear()-1900,d.getMonth()-1,  d.getDate());
    }
   /* public String getPredicat(String objet) throws Exception {
        String pred = null;
      
        if (objet.equals( "Possesion"))
        {
            pred = "POS000" + getIdseq("idPos");
            System.out.println(pred);
        }
         
        if (objet.equals("Match"))
        {
            pred = "MAT000" + getIdseq("idMatch");
            System.out.println("my pred "+pred);
        }
         
        if (objet.equals( "Tir"))
        {
            pred = "TIR000" + getIdseq("idTir");
            System.out.println(pred);
        }
         
        if (objet.equals( "entre") || objet.equals("sortie"))
        {
            pred = "MVT000" + getIdseq("idMouve");
            System.out.println(pred);
        }
         
        return pred;
    }*/

}




