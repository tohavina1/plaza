<%-- 
    Document   : ListeCategorie
    Created on : Feb 9, 2018, 11:40:29 AM
    Author     : TOHX
--%>

<%-- 
    Document   : statusUser
    Created on : Feb 9, 2018, 12:54:11 AM
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
        CategorieDAO daoc=new CategorieDAO();
        ArrayList<Categorie> listes=daoc.findAll();
        for(Categorie c : listes)
        {
             obj.put("id", c.getId());
             obj.put("type", c.getType());
             obj.put("nombre", ""+c.getNombre());
             arr.put(obj);
             obj = new JSONObject();
        }
         out.println(arr);
         response.setHeader("Access-Control-Allow-Origin", "*");
    } catch (MongoException e) {
        e.getMessage();
    }

%>
