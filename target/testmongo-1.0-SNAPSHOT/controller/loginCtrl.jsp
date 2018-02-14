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
    String pseudo=request.getParameter("pseudo");
    String mdp=request.getParameter("pass");
    UserControl ctrl=new UserControl();
    String[]stat=ctrl.statusUser(pseudo, mdp);
    String info="";
 out.println(stat[0]);
     if(stat[0]=="2")
    {
         info="wrong login";
        response.sendRedirect("../pages/login.jsp?confirm="+info);
    }
     else if(stat[0]=="0")
    {     
        info="wrong password";
        response.sendRedirect("../pages/login.jsp?confirm="+info);
    }
    else
    {
       response.sendRedirect("../pages/index.jsp?");
    }

%>
