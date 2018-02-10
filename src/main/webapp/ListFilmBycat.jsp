<%-- 
    Document   : ListFilmBycat
    Created on : Feb 9, 2018, 3:17:15 PM
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
    String categorie=request.getParameter("idcat");
    DBCursor cursor = null;

    try {  
             
        // find()
         FilmDAO daof=new FilmDAO();
         ArrayList<Film> lis=daof.findByIdCat(categorie);
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

