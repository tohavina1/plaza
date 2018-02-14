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

<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.DBCursor"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>

<%
    JSONObject obj = new JSONObject();
    JSONArray arr = new JSONArray();
    MongoConnect mon = new MongoConnect();
    DBCursor cursor = null;
    String pseudo = request.getParameter("p");
    String mdp = request.getParameter("mdp");

    UserDAO dao=new UserDAO();
    UserControl control=new UserControl();
    try {  
            String status[]= control.statusUser(pseudo,mdp);
            obj.put("status", status[0]);
            obj.put("id", status[1]);
            arr.put(obj);
            out.println(arr);
            response.setHeader("Access-Control-Allow-Origin", "*");
    } catch (MongoException e) {
        e.getMessage();
    }

%>