<%-- 
    Document   : ListFilm
    Created on : Feb 9, 2018, 1:43:01 PM
    Author     : TOHX
--%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.*"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.MongoException"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="com.mongodb.QueryBuilder"%>
<%@page import="com.mongodb.DBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="controller.UserControl"%>
<%@page import="com.mycompany.testmongo.DAO.*"%>
<%@page import="com.mycompany.testmongo.*"%>
<%@page import="com.mycompany.testmongo.*"%>
<%@page import="com.mongodb.DB"%>
<%@page import="model.*"%>
<%@page import="com.mongodb.DBCursor"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%
    JSONObject obj = new JSONObject();
    JSONArray arr = new JSONArray();
    MongoConnect mon = new MongoConnect();
    DBCursor cursor = null;

    try {  
             
        // find()
         FilmDAO daof=new FilmDAO();
         ArrayList<Film> lis=daof.listFilm();
        for(Film f : lis)
        {
            obj.put("id", f.getId());
            obj.put("titre", f.getTitre());
            obj.put("description", f.getDescription());
            obj.put("image", f.getImage());
            obj.put("datesortie", f.getDatesortie());
            obj.put("prix", f.getPrix());
            obj.put("cat", f.getIdcat());
            obj.put("remarque", f.getRemarque());
            arr.put(obj);
            obj=new JSONObject();
        }
         out.println(arr);
         response.setHeader("Access-Control-Allow-Origin", "*");
    } catch (MongoException e) {
        e.getMessage();
    }

%>

