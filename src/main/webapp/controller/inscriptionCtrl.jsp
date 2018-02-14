<%-- 
    Document   : inscriptionCtrl
    Created on : Feb 13, 2018, 2:53:27 AM
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
    String mail=request.getParameter("mail");
    String pseudo=request.getParameter("name");
    String mdp=request.getParameter("pass");
  
    RequestDispatcher dispat = request.getRequestDispatcher("../pages/abonnement.jsp"); 
    dispat.forward(request,response);
%>
