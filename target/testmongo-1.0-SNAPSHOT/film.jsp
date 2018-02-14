<%-- 
    Document   : film
    Created on : Feb 13, 2018, 10:53:36 AM
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
    String idfilm=request.getParameter("idfilm");
    DBCursor cursor = null;
    
    try {        
        // find()
         FilmDAO daof=new FilmDAO();
         Video video=daof.getByIdfilm(idfilm);
         Film f=daof.findById(video.getIdfilm());
         Categorie c=new CategorieDAO().findById(f.getIdcat());
            obj.put("id", video.getId());
            obj.put("idfilm", video.getIdfilm());
            obj.put("lien", video.getNom());
            obj.put("cat", c.getType());
            arr.put(obj);
            obj=new JSONObject();
        
         out.println(arr);
         response.setHeader("Access-Control-Allow-Origin", "*");
    } catch (MongoException e) {
        e.getMessage();
    }

%>


